package Beginner.day18_StringClass_Continue;

import java.util.Scanner;

public class WarmUp {
	/*
	 1. Write a program that asks user' first and last names and then prints out the initials of the user
	Ex: Enter your first and last names:
		Learner
		section12

		output: initial is: C.B
	 */
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your first and last names");
		 String firstName = input.next();
		 // cmsac Enter
		 	input.nextLine();  // takes out the "Enter" from scanner' memory
		 String lastName = input.nextLine();
		String initials = firstName.substring(0,1).concat(".")
						+ lastName.substring(0,1);
		 // Learner
//			01234567	
				
//String initials2 = "" + firstName.charAt(0) + "."+lastName.charAt(0);
				
		initials = initials.toUpperCase();
		System.out.println("Initial is: "+initials);
				
				
		//		'A'+'B' ==> 'AB' (Wrong)
		//       65+66 = 131  (correct)		
				int FirstNameIndex = firstName.length()-1;
				int LastNameIndex = lastName.length()-1 ;
		
String LastLetters = ""+firstName.charAt( FirstNameIndex )
				  + "." + lastName.charAt( LastNameIndex );

   LastLetters	= LastLetters.toLowerCase();
   
String LastLetters2 = firstName.substring(FirstNameIndex )
		   			+ lastName.substring(LastNameIndex );

LastLetters2	= LastLetters2.toLowerCase();		
				
System.out.println("Last letters are: "+LastLetters2);
			
		
		
	}
	

}
