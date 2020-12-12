package Beginner.day18_StringClass_Continue;

import java.util.Scanner;

public class WarmUp2 {
	/*
		Ex:
		 enter your first name
		 	john
		 enter your last name
		 	learner
		 
		 output:
		 	John Learner
		 
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name");
		String firstName = scan.nextLine();
		//		john
		firstName = firstName.substring(0,1).toUpperCase()
					+ firstName.substring(1).toLowerCase();
		
		System.out.println("Enter your last name");
		String lastName = scan.nextLine();
		
		lastName = (""+lastName.charAt(0)).toUpperCase()
					+ lastName.substring(1).toLowerCase();
		
		String FullName = firstName+" "+lastName;
		System.out.println(FullName);
		
		
		
	}
	
	

}
