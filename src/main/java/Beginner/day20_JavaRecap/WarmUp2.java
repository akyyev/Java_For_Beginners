package Beginner.day20_JavaRecap;

import java.util.Scanner;

public class WarmUp2 {
	/*
	 4. write a program that asks user to enter number 5 times:
				1. find the sum of those 5 inputs
				
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
			
		for(int i = 1; i<=5 ; i++){
			
			System.out.println("Enter a number");
			int inputNum =scan.nextInt();
			sum += inputNum;
		
		}
		
		System.out.println("sum is: "+sum);
		
		
		
	}

}
