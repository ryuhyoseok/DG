package loc;

import object.RangeObject;
import org.apache.commons.math3.distribution.RealDistribution;
import org.apache.commons.math3.distribution.UniformRealDistribution;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: ryu
 * Date: 13. 3. 20
 * Time: 오후 7:55
 * To change this template use File | Settings | File Templates.
 */
public class FourthRangeGenerator {
  private RealDistribution xDistribution = null;
  private RealDistribution xLenDistritubion = null;
  private RealDistribution yDistribution = null;
  private RealDistribution yLenDistribution = null;
  private int bulk;
  private long sleepTime;
//  private BufferedWriter writer = null;
  private DataOutputStream dout;
  private long id = 0;
  private long rangeNum = Long.MAX_VALUE;

  public FourthRangeGenerator(){
    setBulk(1);
    setSleepTime(10);
  }

  public void setXDistributions(RealDistribution xDistribution, RealDistribution xLenDistritubion) {
    this.xDistribution = xDistribution;
    this.xLenDistritubion = xLenDistritubion;
  }

  public void setYDistributions(RealDistribution yDistribution , RealDistribution yLenDistribution) {
    this.yDistribution = yDistribution;
    this.yLenDistribution = yLenDistribution;
  }

  public void setBulk(int bulk) {
    this.bulk = bulk;
  }

  public void setOutputStream(OutputStream out){
//    this.writer = new BufferedWriter(new OutputStreamWriter(out));
    this.dout = new DataOutputStream(out);
  }

  public void setSleepTime(long sleepTime) {
    this.sleepTime = sleepTime;
  }

  public void setRangeNum(long rangeNum) {
    this.rangeNum = rangeNum;
  }

  private void distributionChk() throws Exception{
    if(xDistribution == null || xLenDistritubion == null ||
        yDistribution == null || yLenDistribution == null) {
      throw new Exception("set distribution model first");
    }
  }

  private RangeObject[] generateObjects(int objectNum) throws Exception {
    distributionChk();
    double[] xMins = xDistribution.sample(objectNum);
    double[] yMins = yDistribution.sample(objectNum);

    double[] xLens = xLenDistritubion.sample(objectNum);
    double[] yLens = yLenDistribution.sample(objectNum);

    RangeObject[] objects = new RangeObject[objectNum];
    for(int i = 0 ; i < objectNum ; i ++) {
      objects[i] = new RangeObject(xMins[i] , yMins[i] , xMins[i] + xLens[i] , yMins[i] + yLens[i]);
    }
    return objects;
  }

  public void run() throws IOException {
    long sent = 0;
    long time = 0;
      int gridSize = 512;
      int count;
      int sum = 0;

    double cur_minx;
    double cur_miny;
      double cur_maxx;
      double cur_maxy;

      int MinGridX;
      int MinGridY;
      int MaxGridX;
      int MaxGridY;

      int gridCellNum;

      HashMap<Integer, Integer> grid = new HashMap<Integer, Integer>(gridSize*gridSize);



    try{
      while(true) {
        if(id > rangeNum)
          break;
        Thread.sleep(sleepTime);
        RangeObject[] objects = generateObjects(bulk);

          for(int i =0;i<bulk; i++){
              cur_minx = objects[i].getMinPos()[0];
              cur_miny = objects[i].getMinPos()[1];
              cur_maxx = objects[i].getMaxPos()[0];
              cur_maxy = objects[i].getMaxPos()[1];

              MinGridX = (int)cur_minx / gridSize;
              MinGridY = (int)cur_miny / gridSize;
              MaxGridX = (int)cur_maxx / gridSize;
              MaxGridY = (int)cur_maxy / gridSize;

              for(int n = MinGridX; n < MaxGridX+1; n++){
                  for(int m = MinGridY; m < MaxGridY+1; m++){

                      gridCellNum = n + gridSize*m;
                      if(!grid.containsKey(gridCellNum)){
                          sum = sum + 1;
                          grid.put(gridCellNum, 1);
                      }
                      else{
                          count = grid.get(gridCellNum);
                          grid.put(gridCellNum, count+1);
                          sum = sum + 1;
                      }


                  }
              }

          }
          dout.writeShort(-2);
          dout.writeInt(sum);
          dout.flush();

          for(int i=0; i<gridSize*gridSize; i++){
              dout.writeShort(-3);
              if(!grid.containsKey(i)){
                  dout.writeInt(i);
                  dout.writeInt(0);
              }
              else{
                  dout.writeInt(i);
                  dout.writeInt(grid.get(i));
              }
              dout.flush();
          }


        for(int i = 0 ; i < bulk; i ++) {
          if(id > rangeNum)
            break;
          double[] mins = objects[i].getMinPos();
          double[] maxs = objects[i].getMaxPos();
//          if(writer != null) {
//            String str =  new String(1 + "," + (id++) + "," + mins[0] + "," + mins[1] + "," + maxs[0] + "," + maxs[1] + "," + -1 +"\n");
//            writer.write(str);
//            writer.flush();
//            sent ++;
          if(dout != null) {
            dout.writeShort(1);
            dout.writeLong(id++);
            dout.writeDouble(mins[0]);
            dout.writeDouble(mins[1]);
            dout.writeDouble(maxs[0]);
            dout.writeDouble(maxs[1]);
            dout.writeShort(-1);
            dout.flush();
          }else {
            System.out.println("[SUB xMin : " + mins[0] + " ,yMin : " + mins[1] + " , xMax : " + maxs[0] + " , yMax : " + maxs[1] + "]");
          }
        }
      }
    } catch(InterruptedException ire) {
    } catch(Exception e) {
      System.out.println("TOTAL SENT : " + sent);
      e.printStackTrace();
    }

  }

  public static void main(String[] args) throws InterruptedException {
    FourthRangeGenerator generator = new FourthRangeGenerator();
    generator.setXDistributions(new UniformRealDistribution(0 , 1000) , new UniformRealDistribution(10 , 50));
    generator.setYDistributions(new UniformRealDistribution(0 , 10000) , new UniformRealDistribution(50 , 70));
    generator.setBulk(350000);
    generator.setSleepTime(50);

    Thread.sleep(5000);


  }

}
