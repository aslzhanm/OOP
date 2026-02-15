package lab1.p1;



public class Data {
	
	private double sum;
	private double max;
	private int count;
	
	public Data() {
		sum = 0;
		max = Double.NEGATIVE_INFINITY;
		count = 0;
	}
	
	public void add(double value) {
		sum += value;
		count++;
		
		if(count == 1 || value > max) {
			max = value;
		}
		
	}
	
	public double avg() {
		if(count == 0) return 0;
		return sum / count;
	}
	
	public double maxR() {
		if(count == 0) return 0;
		return max;
	}
	
	
	

	public static void main(String[] args) {
		

		

	}

}
