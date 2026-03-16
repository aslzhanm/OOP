package lab2.problem1.problemC;

public class Person {
	private String name;
	private int age;
	
	Person(String name, int age){
		this.age = age;
		this.name = name;
	}
	
	String getName() {
		return name;
	}
	
	void setName(String n) {
		this.name = n;
	}
	
	int getAge() {
		return age;
	}
	
	void setAge(int a) {
		this.age = a;
	}
	
	public String toString() {
		return "\nname: " + name + "\nage: " + age;
	}
	
	@Override public boolean equals(Object o) {
		if(this == o)
			return true;
		if(!(o instanceof Person))
			return false;
		Person second = (Person) o;
		boolean equalsName = (this.name == null && second.name == null) || (this.name != null && this.name.equals(second.name));
		return this.age == second.age && equalsName;
	}
	
	@Override public int hashCode() {
		int hash = 7;
		hash = 31 * hash + age;
		hash = 31 * hash + (name == null ? 0 : name.hashCode());
		return hash;
	}

}

class Employee extends Person {
	private int employeeId;
	
	Employee(String name, int age, int id){
		super(name, age);
		this.employeeId = id;
	}
	
	int getId() {
		return employeeId;
	}
	
	void setId(int id) {
		this.employeeId = id;
	}
	
	@Override public boolean equals(Object o) {
		if(this == o)
			return true;
		if(o == null)
			return false;
		Employee second = (Employee) o;
		if(!super.equals(o))
			return false;
		return this.employeeId == second.employeeId;
		
	}
	
	@Override public int hashCode() {
		int hash = 7;
		super.hashCode();
		hash = 31 * hash + (int) employeeId;
		return hash;
	}
		
	@Override public String toString() {
		return super.toString() + "\nid: " + employeeId;
	}
			

}
