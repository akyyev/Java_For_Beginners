package Beginner.day20_JavaRecap;

public class quizeReveiw {
	public static void main(String[] args) {
		// q1:
		
		String str = "Hello World";
		//			  012345678910
		
	System.out.println( str.substring( 0, 5 ) );
	
	System.out.println(str.substring( 10%2*3/2 , 10*2/4 ));
	//									0  ,       5
				int a1=5;
	System.out.println(str.substring( a1 -= a1/1, a1+=5));
	//								a1=a1-5
	//								a1=0    ,    a1 = 5
	
				int a2=5; // a2= 6
	System.out.println( str.substring( (++a2 - a2--) % 1, 11%6 )  );
	//									 6   -	6 %1  ,   	5

		int a3=5;
	System.out.println( str.substring( a3 *a3 % a3 , a3 ) );
	//									25 % 5  , 5
	
	
	// Q3:
	String s1 ="Java";
	String s2 ="java";
	System.out.println(  s1.equals(s2) ); // false
	System.out.println( s1.equalsIgnoreCase(s2) ); // true
	
	
	//Q4:
	String str2 = " ";
	System.out.println( str2.trim().isEmpty() ); // true
		//					""
	
	System.out.println( str2.isEmpty() );  // false
	
		str2 = str2.trim();  // str2 ="";
		System.out.println( str2.isEmpty() );  // true
	
	
		// Q5:
		String A1 ="java";   // String pool
		String A2 = new String("java"); // heap
		
		System.out.println(A1 == A2);  // false,  different location
		System.out.println( A1.equals(A2) ); // true, same visible text
	
	
	// Q6:
		String B1 = "Learner";   // String pool
	
		String B2 = new String(B1); // heap
		String B3 = B2;      // heap, same with B2
		
		String B4 ="Learner";
		
		System.out.println(B3 == B2);
		
	
		
	// Q10:
		int z = 5 ;
		for(int i =5; i > 0 ; i--) { // i: 5,   4,   3,   2,   1
			z += i;			       //   z: 10,  14,  17,  19,  20    		
		}
		
		System.out.println(z);
		
	
	// Q11:
		/*
		 for( initialization; condition; iterator )
		 */
		int i =0;
		for( i =5 ; i < 10; ) { // i: 5, 7, 9
				i += 2;     //  final value of i : 9 +2 =11 
		}
		System.out.println(i);
		
		
		for(int j = 1; j < 5; ) { // j:1,2,3,4
			++j; // J: 2,3,4,5 
			System.out.print(j+" ");
		}
		
		System.out.println();
		
		for(int j = 1; j < 5; ) { // j:1,2,3,4
			
			System.out.print(j+" ");
			j++;
		}
		
		
		
		
		
	
	
	
	
		
	}

}
