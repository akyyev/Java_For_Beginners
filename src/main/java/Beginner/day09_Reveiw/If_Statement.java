package Beginner.day09_Reveiw;

public class If_Statement {
	
	/*
	 	if statements:
	 		
	 			single if statement:
	 			
	 				if( boolean expression ){
	 						 some codes to run
	 				}
	 					if block only gets executed if the condition is true
	 	
	 	
	 
	 */
	public static void main(String[] args) {
		
		
		if( 9 < 10 ) {
			System.out.println("Hello");
			System.out.println("Happy Friday");
			System.out.println("Tomorrow is day off");
			System.out.println("class starts on Monday");
		}
		
		
		
		int a= 1000; // 1001
		
		if( true ) {
	//		1000  == 1001   ==> false
			 a = 2000;
			 System.out.println("a is increased");
		}
		
		System.out.println(a+"\n\n\n");
		
		
		
		int X= 987654320;
		
		if( X%2 == 0 ) {
			// true
			System.out.println(X);
			System.out.println(" it's an even number");
		}
		
		if(  X%2 != 0 ) {
			//  false
			System.out.println(X);
			System.out.println("it's an odd number");
		}
		
		
		
		
		//   
		int Y = 23456780;
		if( Y % 5 ==0 ) {
			//
			System.out.println(Y+" can be divided by 5 \n\n");
		}
		
		if( Y % 5 != 0 ) {
			System.out.println(Y+" can't be divided by 5 \n\n");
		}
		
		
		
		String CEO ="Main Boss";
		String David ="Main Boss";
		
		System.out.println(CEO == David); // true
		
		if(David == CEO ) {
		//  true
			System.out.println("Great Person in the world");
			System.out.println("First if block");
		}
		
		if(David != CEO) {
		//	false
			System.out.println("Great Person in the world");
			System.out.println("Second if block");
		}
		
		
		
		
		int TotalNumber = 100;  
		boolean Learner =true;
		boolean BestSchool = true;
		
		if( Learner == BestSchool) {
			//		true
			TotalNumber += 500;  // TotalNumber = 600
		}
		
		
		if (Learner != BestSchool) {
			// false
			TotalNumber -= 50; // TotalNumber = 50;
		}
		
		
		System.out.println(TotalNumber);
		
		
		
		/*
		 1. Declare a variable, and initialize user age
		 2. Write a program if the user is eligible to vote for Donald Trump 
		 		vote age: 18
		 
		 */
		
		byte PersonAge = 18;
		byte voteAge = 18;
		
		if( PersonAge >= voteAge  ) {
			// true
			System.out.println("\n\n Yes you are eligible to vote");
			System.out.println("have fun with building the wall");
			System.out.println("MAGA");
		}
		
		if( PersonAge < voteAge) {
			// false
			System.out.println("You are not eligible to vote yet, please grow up");
		}
	
	}
	

}
