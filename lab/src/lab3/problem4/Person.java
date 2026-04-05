package lab3.problem4;

public class Person {
	
	protected String name;
	
	public Person(String n) {
		this.name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return "Name: " + name;
	}
	
	public boolean equals(Object o) {
		if(o == this) return true;
		if(!(o instanceof Person)) return false;
		
		Person second = (Person) o;
		return name.equals(second.name);
	}
}
