package pr4.problem2;

public class Student extends Person implements CanHavePizza {
	
	@Override public void eatPizza() {
		System.out.println("Student eats pizza");
	}
}
