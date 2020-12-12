package Beginner.day20_JavaRecap;

import java.util.Scanner;

public class warmup4 {
	/*
	 4. write a program that asks user to enter number 5 times:
				1. find the maximum number 
	 */
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int min = 99999999;  // initialize the minimum value
		// min = 1; , min = -900
	for(int i = 1; i <= 5; i++)	{
		
		System.out.println("Enter a number");
		int InputNum = scan.nextInt();  // 1 , 7 , -900 , 2000
			if(InputNum < min ) {  
				min = InputNum;
			}
		// min = 100; min =-7
		}
		
		System.out.println("min value is: "+min);
		

		}
}
