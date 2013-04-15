package loc;

import org.apache.commons.math3.distribution.*;

import java.io.*;
import java.nio.ByteBuffer;

/**
 * Created with IntelliJ IDEA.
 * User: ryu
 * Date: 13. 3. 20
 * To change this template use File | Settings | File Templates.
 */

public class PointGenerator {
  private RealDistribution xDistribution = null;
  private RealDistribution yDistirbution = null;
  private long sleepTime = -1;
  private int bulk;
  private DataOutputStream dout;
  private BufferedWriter writer = null;
  private long id = 0;

  public PointGenerator(){
    this.sleepTime = 10;
    bulk = 1;
  }

  public void setXDistribution(RealDistribution xDistribution) {
    this.xDistribution = xDistribution;
  }
  public void setYDistribution(RealDistribution yDistribution) {
    this.yDistirbution = yDistribution;
  }

  public void setBulkSize(int bulk) {
    this.bulk = bulk;
  }

  public void setSleepTime(long sleepTime) {
    this.sleepTime = sleepTime;
  }

  public void setOutputStream(OutputStream out) {
//    this.writer = new BufferedWriter(new OutputStreamWriter(out));
    this.dout = new DataOutputStream(out);
  }

  private double[][] generateObjects(int objectNum) throws Exception {
    distributionChk();
    double[][] multiplePoses = new double[2][];
    multiplePoses[0] = xDistribution.sample(objectNum);
    multiplePoses[1] = yDistirbution.sample(objectNum);
    return multiplePoses;
  }
  private void distributionChk() throws Exception{
    if(xDistribution == null || yDistirbution == null) {
      throw new Exception("set distribution model first");
    }
  }

  public void run() throws IOException {
    long sent = 0;
    long totalTime = 0;
    try{
      while(true) {
        if(sleepTime != 0) {
          Thread.sleep(sleepTime);
        }
        long time = System.currentTimeMillis();
        double[][] multiplePoses = generateObjects(bulk);
        for(int i = 0 ; i < multiplePoses[0].length; i ++) {
//          if(writer != null) {
//            String str =  new String(0 + "," + (id++) + "," + multiplePoses[0][i] + "," + multiplePoses[1][i]+ "," + -1 +"\n");
//            writer.write(str);
//            writer.flush();
//            sent ++;
          if(dout != null) {
            dout.writeShort(0);
            dout.writeLong(id++);
            dout.writeDouble(multiplePoses[0][i]);
            dout.writeDouble(multiplePoses[1][i]);
            dout.writeShort(-1);
            dout.flush();
            sent ++;
          }else {
            System.out.println("[PUB xPosition : " + multiplePoses[0][i] + " ,yPosition : " + multiplePoses[1][i] + "]");
          }
        }
        time = System.currentTimeMillis() - time;
        totalTime += time;
      }
    } catch(Exception e) {
      System.out.println("TOTAL SENT : " + sent + " , time : " + totalTime);
      e.printStackTrace();
    }
  }

  public static void main(String[] args) throws InterruptedException {
    PointGenerator pointGenerator = new PointGenerator();
    pointGenerator.setXDistribution(new UniformRealDistribution(0 , 10000));
    pointGenerator.setYDistribution(new UniformRealDistribution(0 , 100000));
    pointGenerator.setSleepTime(50);
    pointGenerator.setBulkSize(2);

    Thread.sleep(5000);

  }
}
