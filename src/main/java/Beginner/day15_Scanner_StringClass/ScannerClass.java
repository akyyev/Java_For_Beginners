
package Beginner.day15_Scanner_StringClass;

import java.util.Scanner;

// imports scanner class only from java.util

  
	// imports all the classes from Java.util

/*
 		package name: java.util
 		class name  : Scanner
 		
 */

public class ScannerClass {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter byte value");	
		byte num = input.nextByte();  // returns the user input as byte value
		
		System.out.println("Enter short value");
		 short num2	 = input.nextShort(); // returns the user input as short value
		 
		 System.out.println("Enter int value");
		  	int num3 = input.nextInt();  // returns the user input as int value
		 
		 System.out.println("Enter long value");
		 	long num4 = input.nextLong(); // returns the user input as long value
		 
		 System.out.println("Enter boolean value");	
		 	boolean result  = input.nextBoolean();  // returns the user input as boolean value
		 	
		 System.out.println("Enter float value");	
		 	float num5	=	input.nextFloat(); // returns the user input as float value
		 	
 		 System.out.println("Enter double number");
		 	double num6 = input.nextDouble();   // returns the user input as double value
		 		
		
		
		
		
	}
	
	
	

}
