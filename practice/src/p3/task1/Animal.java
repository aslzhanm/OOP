package p3.task1;

class Animal {
	
	String name;
	
	public Animal() {
		this.name = "Some animal";
	}
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void makeSound() {
		System.out.println("Animal makes a sound");
		
	}
	
	public void eat() {
		System.out.println("Animal eats a food");
	}

}


class Dog extends Animal{
	String breed;
	
	public Dog() {
		super();
		this.breed = "unknown breed";
	}
	
	public Dog(String name, String breed) {
		super(name);
		this.breed = breed;
	}
	
	@Override public void makeSound() {
		System.out.println("Dog barks: Woof! woof!");
	}
	
	public void eat(String food) {
		System.out.println(name + " eats a " + food);
	}
	
	public void getInfo() {
		 System.out.println("Dog's breed is: " + breed + "\nHe's name is " + name);
	}
	
	
	
}


