package object;

/**
 * Created with IntelliJ IDEA.
 * User: ryu
 * Date: 13. 3. 21
 * Time: 오후 6:38
 * To change this template use File | Settings | File Templates.
 */
public class RangeObject {
  private double minX;
  private double minY;
  private double maxX;
  private double maxY;

  public RangeObject(double minX , double minY , double maxX , double maxY) {
    this.minX = minX;
    this.minY = minY;
    this.maxX = maxX;
    this.maxY = maxY;
  }
  public double[] getMinPos() {
    return new double[]{minX , minY};
  }
  public double[] getMaxPos() {
    return new double[]{maxX , maxY};
  }
}
