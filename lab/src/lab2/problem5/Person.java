package lab2.problem5;

public abstract class Person implements Comparable<Person>, Cloneable, Movable, Actionable {
	protected String name;
    protected int age;
    protected Animal pet; 

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.pet = null;
    }

    public void assignPet(Animal pet) {
        this.pet = pet;
    }

    public void removePet() {
        this.pet = null;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public abstract String getOccupation();

    @Override
    public String toString() {
        String petInfo = (pet != null) ? pet.toString() : "none";
        return name + " (" + getOccupation() + ") - Pet: " + petInfo;
    }
    

    public void leavePetWith(Person other) {

    	if (!hasPet()) {
    		System.out.println(name + " has no pet to leave.");
    		return;
    	}

    	if (other.hasPet()) {
    		System.out.println(other.name + " already has a pet.");
    		return;
    	}

    	if (other instanceof PhDStudent && pet instanceof Dog) {
    		System.out.println(other.name + " cannot take a dog!");
    		return;
    	}

    	Animal temp = pet;
    	other.assignPet(temp); 
    	removePet();          
     
    	System.out.println(name + " left " + temp + " with " + other.name);
    }

    public void retrievePetFrom(Person other) {

    	if (!other.hasPet()) {
    		System.out.println(other.name + " has no pet to retrieve.");
    		return;
    	}

    	if (hasPet()) {
    		System.out.println(name + " already has a pet, cannot retrieve.");
    		return;
    	}

    	Animal temp = other.pet;
    	assignPet(temp);
    	other.removePet();

    	System.out.println(name + " retrieved " + temp + " from " + other.name);
    }
    
//    lab3
    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public void move() {
        System.out.println(name + " идет по своим делам.");
    }
    
}
