package pr1;

import java.util.Scanner;

public class t2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter side a: ");
		double a = sc.nextDouble();
		
		double area = a * a;
		double perimeter = 4 * a;
		double diogonal = a * Math.sqrt(2);
		
		System.out.println("Area: " + area);
		System.out.println("Perimeter " + perimeter);
		System.out.println("Diogonal " + diogonal);
		
		
	}

}
