package pr4.problem4;


import java.util.*;

public class Main {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		
		students.add(new Student("Ali", 3.3));
		students.add(new Student("Bek", 2.9));
		students.add(new Student("Arai", 3.8));
		
		Collections.sort(students);
		System.out.println(students);
		
		Collections.sort(students, new NameComparator());
		System.out.println(students);


		
	}

}
