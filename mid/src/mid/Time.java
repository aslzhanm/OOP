package mid;

public class Time {
	private int hours;
	private int minutes;
	
	
	public Time(int h, int m){
		this.hours = h;
		this.minutes = m;
	}
	
	public String toString() { 
		return hours + ":" + minutes;
	}
	
	
	
}
