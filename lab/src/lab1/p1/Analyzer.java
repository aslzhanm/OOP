package lab1.p1;

import java.util.Scanner;

public class Analyzer {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Data d = new Data();
		
		while(true) {
			System.out.println("Enter number (Q to quit): ");
			if(in.hasNext("q") || in.hasNext("Q")) {
				break;
			}
			
			if(in.hasNextDouble()) {
				d.add(in.nextDouble());
			}else {
				System.out.println("ERROR! Enter number or quit!");
				in.next();
			}
			
		}
		
		System.out.println("Average is: " + d.avg());
		System.out.println("Max is: " + d.maxR());
	}

}
