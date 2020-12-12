package Beginner.day14_Scanner;

import java.util.Scanner; 
// this imports Scanner class only from java.util package

// this imports all the class from Java.util package

// everything in scanner class is imported

public class ScannerClass {
	
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);  // declaration
			
			System.out.println("Enter a Byte Value 1");
				byte byteNum =	input.nextByte(); 
					// only allows user to enter byte value
				
		System.out.println("You have entered: "+byteNum);
		
		System.out.println("Enter another Byte Value");
			byte byteNum2 = input.nextByte();
			
			System.out.println("You have entered: "+byteNum2);
			
	System.out.println("Addition is: "+ (byteNum +byteNum2) );
			
			
		}	

}