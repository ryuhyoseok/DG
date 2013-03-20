package loc;

import org.apache.commons.math3.distribution.*;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/**
 * Created with IntelliJ IDEA.
 * User: ryu
 * Date: 13. 3. 20
 * To change this template use File | Settings | File Templates.
 */

public class PointGenerator extends Thread{
  private RealDistribution xDistribution = null;
  private RealDistribution yDistirbution = null;
  private long sleepTime = -1;
  private int bulk;
  private DataOutputStream out = null;

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
    this.out = new DataOutputStream(out);
  }

//  private double[] generateOneObject() throws Exception{
//    distributionChk();
//    double[] poses = new double[2];
//    poses[0] = xDistribution.sample();
//    poses[1] = yDistirbution.sample();
//    return poses;
//  }
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
  @Override
  public void run() {
    try{
      while(true) {
        Thread.sleep(sleepTime);
        double[][] multiplePoses = generateObjects(bulk);
        for(int i = 0 ; i < multiplePoses[0].length; i ++) {
          if(out != null) {
            out.writeDouble(multiplePoses[0][i]);
            out.writeDouble(multiplePoses[1][i]);
          }else {
            System.out.println("[PUB xPosition : " + multiplePoses[0][i] + " ,yPosition : " + multiplePoses[1][i]);
          }
        }
      }
    } catch(InterruptedException ire) {
    } catch(Exception e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) throws InterruptedException {
    PointGenerator pointGenerator = new PointGenerator();
    pointGenerator.setXDistribution(new UniformRealDistribution(0 , 10000));
    pointGenerator.setYDistribution(new UniformRealDistribution(0 , 100000));
    pointGenerator.setSleepTime(50);
    pointGenerator.setBulkSize(2);

    pointGenerator.start();
    Thread.sleep(5000);
    pointGenerator.interrupt();

  }
}
