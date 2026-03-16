package lab2.problem4;

public class Series extends Circuit {
	private Circuit c1;
	private Circuit c2;
	private double potentialDiff;
	
	Series(Circuit a, Circuit b){
		this.c1 = a;
		this.c2 = b;
	}
	
	@Override double getResistance() {
		return c1.getResistance() + c2.getResistance();
	}
	
	@Override double getPotentialDiff() {
		return potentialDiff;
	}
	
	@Override void applyPotentialDiff(double v) {
		this.potentialDiff = v;
		double r = getResistance();
		double i = super.getCurrent();
		
		double v1 = i * c1.getResistance();
		double v2 = i * c2.getResistance();
		
		c1.applyPotentialDiff(v1);
		c2.applyPotentialDiff(v2);
	}
	
}
