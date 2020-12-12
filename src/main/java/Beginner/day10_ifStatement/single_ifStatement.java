package Beginner.day10_ifStatement;

public class single_ifStatement {
	
	public static void main(String[] args) {
		/*
		 single if:
		 		if ( boolean expression)  { 
		 				// A
		 		}
		 */
		
		if( 9 > 8 ) {
			// true
			System.out.println("9 is greater than 8");
				
		}	
		
		if( 9 < 8) {
		//  false	
			System.out.println("8 is greater than 9");
			
		}
			
		System.out.println("Test Completed"); // does not belong to any if block
		
		
		// Task01:
		int num1=500;
		int num2=100;
		
		int max = 0; // local variables needs to be initialized before use
		
		if( num1 > num2 ) {  // means that num1 is greater than num2
			// false
			// max = num1;
			max += num1;

		}
		
		if( num2 > num1 ) {	
			// true
			
			// max = num2;  // max=300;
			 max += num2;
		}
		
		if( num1 == num2 ) {
		//	max = num2;
			max += num2;
			System.out.println("both numbers are equal");
		}
		
		
	System.out.println("Maximum number between "+num1 +" and "+num2+" is "+max);

		
	
	// task02:
		int hours = 14;  //   2 pm
		int minutes = 45;
		int seconds = 30;
		
		String amOrPm ="pm";
		
	System.out.println( hours + ":" +minutes + ":"+seconds+" "+amOrPm );   
		// hours:minutes:seconds am
	
	
	// task03:
	
		// solution 1:
	int n1=8000, n2= 3000, n3 = 19000000;	
	
	int maximum = 0;  // local variable must be initialized before use
	
	/* 
	 in order to n1 be the maximum :  n1 > n2 && n1 > n3
	 in order to n2 be the maximum :  n2 > n1 && n2 > n3
	 in order to n3 be the maximum :  n3 > n1 && n3 > n2
	
	*/
	
	if ( n1 > n2 && n1 > n3 ) {
		maximum = n1;
	}
	
	if(n2 > n1 && n2 > n3) {
		maximum = n2;
	}
	
	if(n3 > n1 && n3 > n2 ) {
		maximum = n3;
	}
	
String result =	"Maximum number between "+n1+", "+n2+", "+n3+" and is: "+maximum;
	System.out.println( result ); 
	
	
	// 5000
	
	
			// solution 2:
	if(n1 > n2 && n1 > n3) {
		System.out.println("Maximum number is " +n1);
	}
	
	if (n2>n1 && n2 > n3) {
		System.out.println("Maximum number is "+n2);
	}
	
	if(n3 > n1 && n3 > n2) {
		System.out.println("Maximum number is "+n3);
	}
	
	
	
		int A;
		if(true) {
			A=12;
		}
		System.out.println(A);// local variables MUST be initialized BEFORE USE
	
		
		
	
	double B;
	
		if(false) {
			B =100;
		}
	
	//  System.out.println(B);  // B is not initialized
	
		
	
	// Task04:
		int statusCode = 404;
		String finalResult = "Invalid Status code";
		
		if(statusCode == 200) {
			finalResult = "ok";
			System.out.println("status code "+ statusCode+" is: "+finalResult);
		}
		
		if( statusCode == 201) {
			finalResult ="created";
			System.out.println("status code "+ statusCode+" is: "+finalResult);
		}
		
		if( statusCode == 404) {
			finalResult ="not found";
			System.out.println("status code "+ statusCode+" is: "+finalResult);
		
		}
		
		
		// task05:
			int number = 999 - 4000 ;
			String str ="zero";
			
			/*
			 	number to be positive: number >0 
			 	number to be negative: number < 0
			 	number to be zero: number ==0
			 
			 */
			if( number > 0) {
				str ="positive";
				
			}
			
			if(number < 0) {
				str ="negative";
				
			}
			
			System.out.println(number +" is "+str);
			
	
			
			int number2=5000;
			
			if(number2 > 0  ) {
				
				System.out.println("Positive");
			}
			if(number2 < 0) {
				System.out.println("Negative");
			}
			if(number2 ==0 ) {
				System.out.println("Zero");
			}
		
	}

}
