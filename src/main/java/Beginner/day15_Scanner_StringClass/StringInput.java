package Beginner.day15_Scanner_StringClass;

import java.util.Scanner;

public class StringInput {
	
	/*
	 next() vs nextLine();  ==> returns String value
	 			nextLine: takes the entire inputs
	 			next: takes the first word
	 */
	public static void main(String[] args) {
		
		Scanner  scan = new Scanner(System.in);
		System.out.println("Enter your first name");
			String firstname = scan.next();
			
		System.out.println("Enter your last name");
		String lastname = scan.next();
		
		System.out.println("first name is: "+firstname);
		System.out.println("last name is: "+lastname);
			
		System.out.println("Enter char value");
			char ch = scan.next().charAt(0);
		
		
	}

}
