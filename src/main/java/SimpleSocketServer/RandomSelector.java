package SimpleSocketServer;

import java.util.Random;
import org.apache.commons.math3.distribution.*;

public class RandomSelector {
	Random random = new Random();
	
	public String uniformDistribution(String[] list) {
		return list[random.nextInt(list.length)];
	}
	
	public String normalDistribution(String[] list, double mean, double sd) {
		NormalDistribution normal = new NormalDistribution(mean, sd);
		System.out.println(normal.inverseCumulativeProbability(0.));
		return "dd";
	}
	
	public String exponentialDistribution(String[] list, double mean) {
		ExponentialDistribution exponential = new ExponentialDistribution(mean);
		
		return "dd";
	}
	
	public String poissonDistribution(String[] list, double mean) {
		PoissonDistribution poisson = new PoissonDistribution(mean);
		System.out.println(poisson.inverseCumulativeProbability(0.7));
		return "dd";
	}
	
	public boolean occurByProb(int p) {
		if (p < 0 || p > 100) {
			System.exit(-1);
		}
		if( random.nextInt(100) < p) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		RandomSelector rs = new RandomSelector();
		
		String[] a = {"d", "d"};
		rs.poissonDistribution(a, 10);
	}
	
}
