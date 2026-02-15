package lab1.p4;

import java.util.ArrayList;
import pr2.Student;

public class GradeBook {
	
	private Course course;
	private ArrayList<Student> students;
	
	public GradeBook(Course course) {
		this.course = course;
		this.students = new ArrayList<>();
		
	}
	
	
	
	public void addStudent(Student student) {
		students.add(student);
	}
	
	
	
	public void displayMessage() {
		System.out.println("Welcome to the grade book for:");
		System.out.println(course);
	}
	
	
	
	public double getClassAverage() {
		if(students.isEmpty()) return 0;
		
		double total = 0;
		
		for (Student s : students) {
			total += s.getGrade();
		}
		
		return total / students.size();
	}
	
	

	public Student findMin() {
		Student min = students.get(0);
		
		for(Student s : students) {
			if(s.getGrade() < min.getGrade()) {
				min = s;
			}
		}
		
		return min;
	}
	
	
	
	public Student findMax() {
		Student max = students.get(0);
		
		for(Student s : students) {
			if(s.getGrade() > max.getGrade()) {
				max = s;
			}
		}
		
		return max;
	}
	
	
	
	public void outputBarChart() {
		int[] frequency = new int[11];
		
		for(Student s : students) {
			frequency[s.getGrade() / 10]++;
		}
		
		for(int i = 0; i < frequency.length; i++) {
			if(i == 10) {
				System.out.printf("  100:  ");
			}else {
				System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);
			}
			
			for(int stars = 0; stars < frequency[i]; stars++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	
	
	public void displayGradeReport() {
		System.out.printf("\nClass average is %.2f\n", getClassAverage());
		
		Student min = findMin();
		Student max = findMax();
		
		System.out.println("\nLowest grade:");
		System.out.println(min);
		
		System.out.println("\nHighest grade:");
		System.out.println(max);
		
		outputBarChart();
	}
	

	
	
	

}
