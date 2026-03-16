package mid;

public class Lesson{
	
	private String lesson;
	private Days day;
	private Time time;

	public Lesson(String l, Days day, Time time) {
		this.lesson = l;
		this.day = day;
		this.time = time;
	}
	
	public String toString() {
		return lesson + " " + day + " " + time.toString(); 
	}

	public static void main(String[] args) {
		Lesson oop = new Lesson("OOP", Days.FRIDAY, new Time(10, 30));
		
		System.out.println(oop.toString());
	}

}
