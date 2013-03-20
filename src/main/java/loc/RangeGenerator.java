package loc;

import org.apache.commons.math3.distribution.RealDistribution;

/**
 * Created with IntelliJ IDEA.
 * User: ryu
 * Date: 13. 3. 20
 * Time: 오후 7:55
 * To change this template use File | Settings | File Templates.
 */
public class RangeGenerator {
  private RealDistribution xDistribution = null;
  private RealDistribution xLenDistritubion = null;
  private RealDistribution yDistribution = null;
  private RealDistribution yLenDistribution = null;

  public RangeGenerator(){}

  public void setXDistributions(RealDistribution xDistribution, RealDistribution xLenDistritubion) {
    this.xDistribution = xDistribution;
    this.xLenDistritubion = xLenDistritubion;
  }

  public void setYDistributions(RealDistribution yDistribution , RealDistribution yLenDistribution) {
    this.yDistribution = yDistribution;
    this.yLenDistribution = yLenDistribution;
  }

  public void generageOneObject() throws Exception{
    if(xDistribution == null || xLenDistritubion == null ||
        yDistribution == null || yLenDistribution == null) {
      throw new Exception("set distribution model first");
    }

    double xMin = xDistribution.sample();
    double yMin = yDistribution.sample();

    double xMax = xMin + xLenDistritubion.sample();
    double yMax = yMin + yLenDistribution.sample();
  }

}
