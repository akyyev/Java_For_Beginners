package Beginner.day09_Reveiw;

public class quiz {
	
	public static void main(String[] args) {
		// Question 01:
		boolean a = !!!!!false;
			//			!!!!true
		//				!!! false
		//				!!true
		//					!false
		//					true
		System.out.println(a); // true
		System.out.println(!!true); // true
		
		
		// question 02:
	boolean result= !false != ( "Section12" != "Best Section Ever") ;
		//			true   !=  true
		//				false
		System.out.println(result);
		
	// Question 03:
		int x = 100;
		double y =  x += 100/20;   // x= 105,  y = 105   
		//				x=x+(100/20) = 105
		//		y=  100 += 5  ==> 105
		System.out.println(x);
		
		System.out.println(105.0 > 105 );  // false
		System.out.println( 105.1 > 105);  // true
		

	// question 05:
		
		boolean A = 128 > '9'  || 128 == 127;
					// true    ||  false  ==> true
		System.out.println(A);
		
	// Question 06:
			boolean StupidOperators = 10 >= 20 && 'a' > 'b';
						//				false &&   false  ==> false
	//	System.out.println(StupidOperators);
			
			
	// question 07:
				int num1 =9999999;
				int num2 =10;
				
				System.out.println(num1 * num2 / 10 % num1 );
		//									9999999 % 9999999 =0;
		
				
	// question 09:
				int z= 100;
				// System.out.println(" z > 100 is :" + H); 
							// H is not defined before this line
				boolean H = z>100; // false
				
	// question 10:
				System.out.println( 5 + 7 + "8" );
				//				    12 +"8"	 ==> "128" 	
				
				System.out.println( "8"+5+7 );
				//					"85"+7
				//					"857"
	
				System.out.println( 5+7 +"8"+ 5 + 7);
				//				     12+"8"+5+7			
				//					"128"+5+7
				//					"1285"+7
				//					"12857"
				
				System.out.println(  5+7 +"8"+ (5 + 7) );
				//					"128"+12
				//					"12812"
				
				
				System.out.println( "5+7" +"8"+ 5 + 7);
					//				5+7857					
				
	//	Question 11:
					
				System.out.println( 1+11+"3" == "123");
				//					12+"3"  =="123"	
				//					"123" == "123";  ==> true
		
				
				String str ="learner";
				str = str +"2019"+"true"+"A";
				System.out.println(str);
				
	// QUestion 12:
				int numberA = 100;
					numberA += 300;  // 400
					
			System.out.println( numberA++ + "\n"+numberA); // 401
			//					 400	 		 401
			
			
	// Question 13:
				// local variables MUST be initialized
			
			
	// Question 14:
			System.out.println( (10 * 2) / (5 * 4) * 1000 / 10 % 100 );
			//					 20 / 20 * 1000 / 10 % 100
			//						1000 / 10 % 100
			//						 100%100
			//						 0
				
				
				
				
				

	}

}
