package p3.task2;

import java.util.Scanner;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Vector<Person> users = new Vector<>();
		
		while(true) {
			System.out.println("\n1. Add a new person\n2. Show info about all people");
			int choice = in.nextInt();
			in.nextLine();
			
			if(choice == 1) {
				System.out.println("Who to add? (1 - Person, 2 - Student, 3 - Staff");
				int who = in.nextInt();
				in.nextLine();
				
				System.out.print("Name: "); 
				String name = in.nextLine();
				
				System.out.print("Address: ");
				String address = in.nextLine();
				
				if(who == 1) {
					users.add(new Person(name, address));
				} else if(who == 2) {
					System.out.print("Program: ");
					String pr = in.nextLine();
					
					System.out.print("Year: ");
					int year = in.nextInt();
					
					System.out.print("Fee: ");
					double fee = in.nextDouble();
					
					users.add(new Student(name, address, pr, year, fee));
				} else if(who == 3) {
					System.out.print("School: ");
					String sch = in.nextLine();
					
					System.out.print("Pay: ");
					double pay = in.nextDouble();
					
					users.add(new Staff(name, address, sch, pay));
				}
				
			} else if(choice == 2) {
				for(Person p : users) {
					System.out.println(p);
				}
			} else {
				break;
			}
			

			
			
			
			
			
		}
	}

}
