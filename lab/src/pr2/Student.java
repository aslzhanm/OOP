package pr2;

public class Student {
	private String name;
	private int id;
	private int yearOfStudy;
	private int grade;
	
	public Student(String name, int id, int grade) {
		this.name = name;
		this.id = id;
		this.yearOfStudy = 1;
		this.grade = grade;
	}
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public int getYearOfStudy() {
		return yearOfStudy;
	}
	
	public void incrementYear() {
		yearOfStudy++;
	}
	
	public int getGrade() {
		return grade;
	}
	
	@Override
	public String toString() {
		return "Student name: " + name +
				"\nid: " + id +
				"\ngrade: " + grade;
	}

//	public static void main(String[] args) {
//		Student s = new Student("Assylzhan", 111);
//		s.incrementYear();
//		System.out.println(s.getYearOfStudy());
//
//	}
	


}
