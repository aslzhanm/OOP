package lab1.p2;

public class Course {
	
	public enum Level{
		BACHELOR,
		MASTER,
		PHD
	}
	
	private static int totalCourses = 0;
	
	private final int courseId; //read-only
	
	private String name;
	private Level lvl;
	
	public static final int MAX_STUDENTS = 100;
	
	{
		System.out.println("New course is being created...");
	}
	
	public Course(int courseId, String name, Level lvl) {
		this.courseId = courseId;
		this.name = name;
		this.lvl = lvl;
		totalCourses++;
	}
	
	public Course(int courseId, String name) { // overloading constructor
		this(courseId, name, Level.BACHELOR);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setName(String name, boolean uppercase) { // overloading method
		if(uppercase) {
			this.name = name.toUpperCase();
		}else {
			this.name = name;
		}
	}
	
	public static int getTotalCourses() {
		return totalCourses;
	}
	
	public int getCourseId() {
		return courseId;
	}
	
	public String getInfo() {
		return courseId + " - " + name + "(" + lvl + ")";
	}
	
	

	public static void main(String[] args) {
		Course course = new Course(101, "OOP");
		
		System.out.println(course.getInfo());

	}

}
