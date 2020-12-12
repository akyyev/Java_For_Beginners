package Beginner.day23_Arrays;

import java.util.Scanner;

public class ArraysPractice {
	public static void main(String[] args) {
		String student1 = "Abraham";
		String student2 = "Oscar";
		String student3 = "Blake"; // .....
		
		String[] AllStudents = {"Abraham", "Oscar", "Blake"}; 
		//						 0            1          2
			AllStudents[0] = "Gabriel";
		//	AllStudents[3] = "John";  // Array's size is fixed
			System.out.println(  AllStudents.length );
		
			
		// initialize the size only without giving value:
			int[] array = new int[4];  // we haven't given values to the array
				// this array can contain four values, it's length is 4
			
			System.out.println( array.length );
			System.out.println( array[0] );
			System.out.println( array[1] );
			System.out.println( array[2] );
			
				// give values to the array:
			array[1] = 100;
			System.out.println(array[1]);
			
			array[0] =200;
			System.out.println(array[0]); 
		
			/*
			array[5]  = 500;
			System.out.println( array[5] );
			    ARRAY' size is fixed
		*/	
			
			
			
	//		int[] array2;
	//		System.out.println( array2[0] );  // Array's size MUST be initialized
			
			Scanner scan= new Scanner(System.in);
				int[] Inputs = new int[5];  
					// in this array we can store 10 elements, highest number of index: 9
				
				for(int i=0; i <Inputs.length; i++) {
					System.out.println("Enter a number");
						Inputs[i] = scan.nextInt();
				}
				
				for(int i=0; i <Inputs.length; i++) {
					System.out.print( Inputs[i] +" ");
				}
				
			String[] AllStudentsNames = new String[358];
					AllStudentsNames = new String[1000];
			
		//	this new Keyword in array is used to give the size of the array only
			
		
	}

}
