package lab2.problem4;

public class Parallel extends Circuit {
	private Circuit c1;
	private Circuit c2;
	private double potentialDiff;
	
	Parallel(Circuit a, Circuit b) {
		this.c1 = a;
		this.c2 = b;
	}
	
	@Override double getResistance() {
		double r1 = c1.getResistance();
		double r2 = c2.getResistance();
		
		return 1 / ((1/r1) + (1/r2));
	}
	
	@Override double getPotentialDiff() {
		return potentialDiff;
	}
	
	@Override void applyPotentialDiff(double v) {
		this.potentialDiff = v;
		
		c1.applyPotentialDiff(v);
		c2.applyPotentialDiff(v);
	}
}
