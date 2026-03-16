package lab2.problem1.problemC;

import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
		HashSet<Person> persons = new HashSet<>();
		persons.add(new Person("Assyl", 19));
		persons.add(new Person("Kuka", 18));
		persons.add(new Person("Nur", 14));
		persons.add(new Person("Assyl", 19));
		
		for(Person i : persons) {
			System.out.println(i);
		}
		
		Person a = new Person("Assyl", 19);
		System.out.println(persons.contains(a));
		
		HashSet<Employee> employees = new HashSet<>();
		employees.add(new Employee("Assyl", 19, 1));
		employees.add(new Employee("Bek", 19, 1));
		employees.add(new Employee("Nur", 19, 1));
		employees.add(new Employee("Assyl", 19, 1));
		
		System.out.println();
		
		for(Employee i : employees) {
			System.out.println(i);
		}
		
		Employee e = new Employee("Assyl", 19, 1);

		
		System.out.println(employees.contains(e));
	}

}
