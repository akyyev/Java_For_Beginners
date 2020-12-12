package Beginner.day08_ShortHand_Logical_Relational;

public class RelationalOperators {
	/*
	 Relational Operators: return boolean expression
	 	>  : greater than  
	 	>= : greater than or equal
	 	<  : less than
	 	<= : less than or equal
	 	== : equal
	 	!= : not equal
	 	
	 	=: assign
	 	!: Exclamation mark in java means the logical opposite
	 			NOT
	 */
	
	public static void main(String[] args) {
		
		System.out.println(  10 > 9   );  //
		boolean resultA = 10 > 9;
		System.out.println( resultA );
		
		
		System.out.println( 10 >= 9); // greater or equal
		
		boolean resultB = 10 >= 9;
		System.out.println( resultB );
		
		boolean resultC = 10 <= 9 ;  // less than or equal
		System.out.println( resultC );
		
		boolean resultD = 1100 < 1200; // less than
		System.out.println( resultD );
		
		boolean resultE  = 1000 < 1000; // less than
		System.out.println(resultE);
		
		boolean resultF = 1000 <= 1000;  // less than or equal
		System.out.println( resultF );  // true
		
		
		// == 
		
			boolean resultG = 19 == 19;  // equal
			System.out.println( resultG ); // true
			
		// !: NOT
			boolean resultH =  20 != 20;
			System.out.println(resultH);
			
			boolean A = ! false;   // true
			System.out.println(A);
			
			boolean B = !true ;   // false
		
			/*
			 in java:
			  	true == true, false == false	
			  	!false equal to true, !true equal to false
			  	so therefore :
			  		!false does not equal !true
			  		and
			  		true equal !false.
			 
			 */
			
			
			boolean C = !false != !true; 
			System.out.println(C);
			
			boolean D = true == !false ; 
			System.out.println(D);
			
			boolean E = !(!true);
			System.out.println(E);
			
			 boolean F = 10 > 9 == 9 <10 ; 
			 //			  true  ==	true  ==> true
			 System.out.println(F);  // !false
			 
		
			 
			 // practice ! (not):   
				 boolean g = false;
				 System.out.println( !g ); 
				 
			 System.out.println( !true == false );
			 //					false == false ==> true	
			 
			
			 boolean h = "Section12" == "Section13";  // false
			 System.out.println(h);
			 
			 System.out.println(  "section12" == "Section12" );  // java is case sensitive
			 
			 System.out.println( "learner" != "club" );  // true
			 
			 System.out.println("David" == "bad guy"); // false
			 
		System.out.println("Assistant teacher in class"  ==  "Awesome"); // false
		
		
		int num = 198;
		System.out.println( num %= 2 );
		
		
		
		byte ByteNum = 30;
	//	int Inum =  Inum +=ByteNum;  // we must give value to local variables
		
		String str;
	//	System.out.println(str);
		
		
		
		
		
		
		
	}

}
