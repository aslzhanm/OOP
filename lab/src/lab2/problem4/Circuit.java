package lab2.problem4;

public abstract class Circuit {

	abstract double getResistance();
	abstract double getPotentialDiff();
	abstract void applyPotentialDiff(double v);
	
	double getPower() {
		double v = this.getPotentialDiff();
		return v*v / this.getResistance();
	}
	
	double getCurrent() {
		return this.getPotentialDiff() / this.getResistance();
	}

}
