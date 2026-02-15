package lab1.p4;

public class Course {
	
	private String name;
	private String description;
	private int numOfCredits;
	private String prereqs;
	
	public Course(String name, String desc, int numOfCre, String prereqs) {
		this.name = name;
		this.description = desc;
		this.numOfCredits = numOfCre;
		this.prereqs = prereqs;
	}
	
	@Override
	public String toString() {
		return "Course name: " + name +
				"\nDescription: " + description +
				"\nCredits: " + numOfCredits +
				"\nPrerequisites: " + prereqs;
	}

}
