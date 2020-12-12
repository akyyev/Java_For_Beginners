package Beginner.day16_Recap;

import java.util.Scanner;

public class nextLine2 {
	public static void main(String[] args) {
		
		/*
 write a program that accepts zip-code, city, state,& phone number
		 
		  then displayed all those gathered information
		  
		  		Do not Use next() method
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your zip code");
		  int zipcode = input.nextInt();
		  // 123456 Enter
		  input.nextLine(); // takes out the Enter
	   System.out.println("Please enter your city name");
			String cityname = input.nextLine();
			
		
		System.out.println("Enter your phone number");
			int pn = input.nextInt();
			// 3456 Enter
			input.nextLine();
			System.out.println("Enter state name");
			String stateName = input.nextLine();
		
			
			System.out.println("zip code is: "+zipcode);
			System.out.println("city name is: "+cityname);
			System.out.println("Your city: "+cityname);
			System.out.println("Your State: "+stateName);
		
	}

}
