package lab1.p3;

public class Temperature {
	
	private double value;
	private char scale;
	
	public Temperature() {
		value = 0;
		scale = 'C';
	}
	
	public Temperature(double val) {
		this.value = val;
		this.scale = 'C';
	}
	
	public Temperature(char sca) {
		this.value = 0;
		
		if(sca == 'C' || sca == 'F') {
			this.scale = sca;
		}else {
			this.scale = 'C';
			System.out.println("Invalid scale! Default set to C");
		}
	}
	
	public Temperature(double val, char sca) {
		this.value = val;
		
		if(sca == 'C' || sca == 'F') {
			this.scale = sca;
		}else {
			this.scale = 'C';
			System.out.println("Invalid scale. Default set to C");
		}
		
	}
	
	public double inC() {
		if(this.scale == 'F') {
			return 5 * (this.value - 32) / 9;
		}else {
			return this.value;
		}
	}
	
	public double inF() {
		if(this.scale == 'C') {
			return (9 * (this.value / 5) + 32);
		}else {
			return this.value;
		}
	}
	
	public void setValue(double val) {
		this.value = val;
	}
	
	public void setScale(char sca) {
		if(sca == 'C' || sca == 'F') {
			this.scale = sca;
		}else {
			System.out.println("Invalid scale! Use 'C' or 'F'");
		}
	}
	
	public void setBoth(double val, char sca) {
		this.setValue(val);
		this.setScale(sca);
	}
	
	public double getValue() {
		return this.value;
	}
	
	public char getScale() {
		return this.scale;
	}

	public static void main(String[] args) {
		Temperature t = new Temperature('X');
		
		
		
		System.out.println(t.getValue() + "C in F is: " + t.inF());
		
		t.setBoth(32, 'F');
		
		System.out.println(t.getValue() + "F in C is : " + t.inC());
	}

}
