package lab1.p4;

import pr2.Student;
import java.util.Scanner;

public class GradeBookTest {
	
	

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		Course course = new Course(
				"OOP",
				"Object Oriented Programming",
				5,
				"None");
		
		GradeBook gb = new GradeBook(course);
		
		System.out.print("How many students do you wanna add? ");
		int count = in.nextInt();
		
		for(int i = 0; i < count; i++) {
			System.out.println("\nStudent #" + (i + 1));
			in.nextLine();
			
			System.out.print("name: ");
			String name = in.nextLine();
			
			System.out.print("id: ");
			int id = in.nextInt();
			
			System.out.print("grade: ");
			int grade = in.nextInt();
			
			gb.addStudent(new Student(name, id, grade));
		}
		
		
		gb.displayMessage();
		gb.displayGradeReport();
	}

}
