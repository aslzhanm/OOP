package lab2.problem5;

public class Main {

	public static void main(String[] args) {
		System.out.println("=== Creating people and pets ===");
        Person john = new Employee("John", 30, "Engineer");
        Person alice = new PhDStudent("Alice", 26, "Comp. Science", "AI");
        Person bob = new Student("Bob", 22, "Math");

        Animal murka = new Cat("Murka", 5);
        Animal rex = new Dog("Rex", 3);
        Animal fish = new Fish("Nemo", 1);
        Animal doggo = new Dog("Doggo", 4);

        john.assignPet(murka); 
        bob.assignPet(fish);   

        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(john);
        registry.addPerson(alice);
        registry.addPerson(bob);

        System.out.println("\n=== Initial Registry ===");
        System.out.println(registry);

        System.out.println("\n=== Test 1: John leaves Murka with Alice ===");
        john.leavePetWith(alice); 
        System.out.println(registry);

        System.out.println("\n=== Test 2: John tries to leave pet when he has none ===");
        john.leavePetWith(bob);

        System.out.println("\n=== Test 3: Bob tries to leave Nemo with Alice (PhDStudent) ===");
        bob.leavePetWith(alice);

        System.out.println("\n=== Test 4: John tries to give dog to PhDStudent ===");
        john.assignPet(doggo);
        john.leavePetWith(alice);

        System.out.println("\n=== Test 5: Retrieving pets ===");
        john.retrievePetFrom(alice);
        System.out.println(registry);

        System.out.println("\n=== Test 6: Try retrieving when owner already has pet ===");
        john.assignPet(rex);
        bob.assignPet(new Cat("Kitty", 2));
        bob.retrievePetFrom(john); 

        System.out.println("\n=== Final Registry ===");
        System.out.println(registry);
    }

	

}
