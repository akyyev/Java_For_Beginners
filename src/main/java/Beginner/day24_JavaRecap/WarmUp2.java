package Beginner.day24_JavaRecap;

public class WarmUp2 {
	
	/*
	 3. write a program that return the minimum value from an int array

	 4. write a program that return the second minimum value from an int array
	 
	 */
	
	public static void main(String[] args) {
		int[] arr = { 100, 2 , 2 , 3, 4, 5, 6 };
				int min = 999999999 ; // min = 100, min = 2
		for(int i=0; i < arr.length; i++) {
			// highest number of i :  i < 9 ==> 8 ( 8 is the highest index number)
			
				if(arr[i] < min) {
					min = arr[i];
				}
		}
				
		System.out.println("minimum number is: "+min);	
		
		int secondMinimum = 99999999;
		for(int j=0; j < arr.length; j++) {
			
			if(arr[j] < secondMinimum && arr[j] != min) {
				secondMinimum = arr[j];
			}
		}
		System.out.println("Second Minimum is: "+secondMinimum);
				
				
				
		
		
		
		
	}

}
