package pr1;

import java.util.Scanner;

public class t6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a word: ");
		String s = sc.nextLine();
		
		String rvsd = "";
		
		for(int i = s.length() - 1; i>=0; i--) {
			rvsd += s.charAt(i);
		}
		
		if(s.equals(rvsd)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}

}
