package lab2.problem4;

public class Resistor extends Circuit {
	private double resistor;
	private double potentialDiff;
	
	Resistor(double r) {
		this.resistor = r;
	}
	
	@Override double getResistance() {
		return resistor;
	}
	
	@Override double getPotentialDiff() {
		return potentialDiff;
	}
	
	@Override void applyPotentialDiff(double v) {
		this.potentialDiff = v;
	}
	
	
}
