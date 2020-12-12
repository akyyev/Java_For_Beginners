package Beginner.day22_NestedLoop;

public class practice {
	
	/*
	  
			  *
			  **
			  ***
			  ****
			  *****
	  
	  
	 */
	
		public static void main(String[] args) {
			
			
		for(int j = 1; j <= 5 ; j++) {
			
			for(int i = 1; i <= j;  i++  ) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		/*
		 
		 		******
		 		*****
		 		****
		 		***
		 		**
		 		*
		 
		 */
			
			
	for(int z=6; z >= 0; z--) {
		
	
		for(int i =1; i <= z; i++) {
			System.out.print("*");
		}
		System.out.println();
		
	}
		
			
			
			
			
		}
			

}
