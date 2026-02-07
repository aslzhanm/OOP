package pr1;

import java.util.Scanner;

public class t3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter score: ");
		int s = sc.nextInt();
		
		if(s >= 95) {
			System.out.println("A");
		} else if(s >= 90) {
			System.out.println("-A");
		} else if(s >= 85) {
			System.out.println("B+");
		} else if(s >= 80) {
			System.out.println("B");
		} else if(s >= 75) {
			System.out.println("C+");
		} else if(s >= 70) {
			System.out.println("C");
		} else if(s >= 50) {
			System.out.println("C-");
		} else {
			System.out.println("F");
		}
		
	}

}
