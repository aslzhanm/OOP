package lab2.problem5;

public class Dog extends Animal {
	public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String getSound() {
        return "Woof";
    }
    
    @Override
    public void move() {
        System.out.println(name + " бежит на четырех лапах!");
    }
    
}
