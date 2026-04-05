package lab2.problem5;

public abstract class Animal implements Comparable<Animal>, Cloneable, Movable {
	protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String getSound();

    
    public String toString() {
        return name + " (" + age + ")";
    }
    
//    lab3
    
    @Override
    public int compareTo(Animal other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public void move() {
        System.out.println(name + " бежит за хвостом.");
    }
    
}
