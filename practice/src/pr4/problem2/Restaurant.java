package pr4.problem2;

public class Restaurant {
	
	boolean servePizza(CanHavePizza eater) {
			eater.eatPizza();
			
			if (eater instanceof Person) {
				System.out.println("Processing payment..");
			}
			
			return true;
	}
	
	public static void main(String[] arg) {
		Cat cat = new Cat();
		Student stu = new Student();
		
		Restaurant r = new Restaurant();
		
		r.servePizza(cat);
		r.servePizza(stu);
				
	}

}
