package pr1;

import java.util.Scanner;

public class t4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a: ");
		double a = sc.nextDouble();
		
		System.out.print("Ente b: ");
		double b = sc.nextDouble();
		
		System.out.print("Enter c: ");
		double c = sc.nextDouble();
		
		double D = b*b - 4 * a * c;
		
		if (D < 0) {
			System.out.println("No roots");
		} else {
			double sqrtD = Math.sqrt(D);
			double x1 = (-b + sqrtD)/(2*a);
			double x2 = (-b - sqrtD)/(2*a);
			
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		}

	}

}
