package Beginner.day22_NestedLoop;

public class NestedLoop {
	
	public static void main(String[] args) {
		/*
		 12345
		 12345
		 12345
		 12345
		 12345
		 */
		 
	for(int z = 1 ; z <= 5 ; z++)	{
		
		for(int i = 1; i <= 5; i++) {
			System.out.print(i);
		}
		System.out.println();
		
		
	}
		
	
		/*  
		  *****
		  *****
		  *****
		  *****
		  *****
		  
		 */
		int z = 5;
		while( z > 0 ) {
			
			int i = 1;
			while(i <=5) {
					System.out.print("*");
				i++;
			}
			System.out.println();
			
			z--;
		}
	
		/*
		  	
		 		*
		 		**
		 		***
		 		****
		 		*****
		 		******
		 		*******	
		 	
		 */
		System.out.println("\n\n");
		
		
		
		
		
		int A =1;
		while(A <= 7) {
			
			int B= 1;
			while(B <= A) {
				System.out.print("*");	
				B++;
			}
			System.out.println();
			
			A++;
		}
		
		
		
		int i =1;
		do	{
			
			for(int j =1; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
			
			i++;
		} while(i <= 5);
		
		
		
		
	}

}
