package p3.task1;

public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog("Arlan", "German Shephard");
		
		dog.getInfo();
		dog.makeSound();
		dog.eat("bone");
		
		
		Dog dog2 = new Dog("Tuzik", "Hasky");
		
		System.out.println();
		dog2.getInfo();
		dog2.eat("Chappi");
	}

}
