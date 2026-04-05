package lab3.problem2;

public class Car implements Moveable {
	
	public void move() {
		System.out.println("Car moves");
	}

	public static void main(String[] args) {
		Car c = new Car();
		c.move();
	}

}
