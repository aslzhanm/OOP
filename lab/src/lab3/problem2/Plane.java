package lab3.problem2;

public class Plane implements Flyable {
	
	public void move() {
		System.out.println("Plane moves");
	}
	
	public void fly() {
		System.out.println("Plane also flies");
	}

	public static void main(String[] args) {
		Plane p = new Plane();
		p.move();
		p.fly();
	}

}
