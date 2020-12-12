
package Beginner.day17_StringClass;

import java.util.Scanner;  // imports 1 class only

//import java.util.*;   // imports all the classes from java.util

public class warmUp {

	public static void main(String[] args) {
		/*
		Task01:
		 1. Declare Scanner class' object
		 2. ask user to enter first and last name. 
		 3. declear a string variable called full name
		 4. concat firts and lastname and assign it to fullname
		 5. Display in the console total numbers of characters in full name
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first and last names");
		String firstName = scan.nextLine(); 
		String lastName = scan.nextLine();
		String fullName = firstName.concat(" "+lastName);
		
		String fullName2 = firstName+" "+lastName;
		
		String name ="Learner" + 12 + 'A' + 4.5;
	//	 String name2 ="Learner".concat(12);  
		 // in concat method you can only give String variable or String value
		
			int num = fullName.length();
			
		System.out.println(fullName2+" contains "+num+" characters");	
		int lastIdexNum = fullName2.length()-1;
		System.out.println(fullName2.charAt(lastIdexNum));
		
		scan.close();
		
	}

}