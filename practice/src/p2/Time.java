package p2;

public class Time {
	
	private int hour;
	private int min;
	private int sec;
	
	public Time(int hour, int min, int sec) {
		if(hour < 0 || hour > 23 ||
			min < 0 || min >59 ||
			sec < 0 || sec > 59) {
			throw new IllegalArgumentException("Invalid time");
			
		}
		
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}
	
	public String toUniversal() {
		return String.format("%02d:%02d:%02d", hour, min, sec);
	}
	
	public String toStandard() {
		int h = hour % 12;
		if (h == 0 ) h = 12;
		
		String amPm = hour < 12 ? "AM" : "PM";
		
		return String.format("%02d:%02d:%02d %s", h, min, sec, amPm);
	}
	
	public void add(Time t) {
		this.sec += t.sec;
		this.min += t.min + this.sec / 60;
		this.sec %= 60;
		
		this.hour += t.hour + this.min / 60;
		this.min %= 60;
		
		this.hour %= 24;
	}

	public static void main(String[] args) {
		Time t = new Time(23, 5, 6);
		System.out.println(t.toUniversal());
		System.out.println(t.toStandard());
		
		Time t2 = new Time(4, 24, 33);
		t.add(t2);
		
		System.out.println(t.toUniversal());

		
	}

}
