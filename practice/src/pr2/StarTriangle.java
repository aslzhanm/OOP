package pr2;

import java.util.Scanner;

public class StarTriangle {
	private int width;
	
	public StarTriangle(int width) {
		this.width = width;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i <= width; i++) {
			for(int j = 1; j <= i; j++) {
				sb.append("[*]");
			}
			sb.append("\n");
		}
		
		return sb.toString();
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter height: ");
		int h = sc.nextInt();
		
		StarTriangle small = new StarTriangle(h);
		System.out.println(small);
	}

}
