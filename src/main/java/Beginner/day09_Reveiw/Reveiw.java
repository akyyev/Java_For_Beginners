package Beginner.day09_Reveiw;

public class Reveiw {
	
	/*
	 	relational :
 			>  : greater     X=10 Y=9 : only return true when x > y
 			>= : greater than or equal     true:  either greater or equal
 			<  : less than    X=10 Y=9 : only return true when Y < x
 			<= : less than equal       true: either less  or equal
 			== :  equal            X =10, Y=10 ,  true:	X==Y;   
 			!= :  not equal        X =9, Y=10;  true: x != y
 			
 			
		 logical operators:
		 		&& :  true: if both conditions are true
		 		|| :	true: as long as one condition is true
 			
	 */
	public static void main(String[] args) {
	
		
		System.out.println( 'Z' > 'A' );   // true
		
		System.out.println( 'Z' >= 'A' );  // true
		
		System.out.println('a' >= 'A' );  // true 
		
		
		System.out.println('a' < 'A' );  // false
		
		char ch1 = 123 ;
		System.out.println(ch1);
		
		System.out.println( 'A' <= 'A');  // !false
		System.out.println('A' <= 'a' );  //  true
		//					65 <=  97
			
		System.out.println( false ==  false ); // true
		System.out.println( !(false != true) );  
		//					!true ==> false
		
		
		
		System.out.println( true == true  &&  false !=true );
		//					true       &&    true   ==> true
		
		System.out.println( true != true  ||  false == true );
		//						false      ||   false  ==> false
		
		System.out.println( "Monday" == "Funday" || true == !false);
					//			false            ||    true  ==> true
		

		
		/*
		byte X =10;  int Y = 10;
		System.out.println( X == Y  );  // for primitives, yes.
		*/
		
		
		
	
	}
	
	
	

}
