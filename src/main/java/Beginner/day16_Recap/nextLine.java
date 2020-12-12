package Beginner.day16_Recap;

import java.util.Scanner;

public class nextLine {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// nextLine method accepts the "enter" from the keyboard
		System.out.println("Enter your phone number");
		// 911 Enter
		int pn = scan.nextInt();
		System.out.println(pn);
		
		scan.nextLine();  // this will take out the Enter
		System.out.println("Enter your name");
		String name = scan.nextLine();
		/*
		 nextLine() method will take everything in scanner' 
		 memory up-to the new line
		 */
		
		
		
	}

}
