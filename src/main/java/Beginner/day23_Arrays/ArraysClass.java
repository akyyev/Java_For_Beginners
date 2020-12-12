package Beginner.day23_Arrays;

public class ArraysClass {
	public static void main(String[] args) {
	
		/*
		 Arrays:
		 
		 */
	// int a = "a";
		
		int[] arr = { 1,  2 };
		
		String[] names = { "Nora" ,"Glen", "Kelly", "Juline" } ;
		//					0          1        2          3
		
		System.out.println(  names[0]  );
		System.out.println(  names[1]  );
		
		String str1 = names[2] ;
		String str2 = names[3] ;
		
		System.out.println( str1 );
		System.out.println( str2 );
		
		//  System.out.println(names[4]);
		
		double[] myArray = { 1, 2, 3, 4, 5, 8, 0,  2};
		// index:            0  1  2   3  4  5  6  7
		
		for(int i=0; i < 8; i++ ) {
			System.out.print(  myArray[i] +"  ");
		}
		System.out.println();
		
//		length of Array:		
		String str="ABC";
			int A =	str.length();
			System.out.println(A);  // 3
			
			
			
	int[] Numbers = { 12, 24, 48, 96, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
	
			int B = Numbers.length;  // 14
				System.out.println(B);
				int HighestIndexNum = Numbers.length - 1;  // 13
				
			System.out.println( HighestIndexNum );
		
			for(int i=0; i < Numbers.length; i++ ) {
				int s1 =  Numbers[i];
				System.out.print( s1 +" " );
			}
			
			System.out.println();
			
		
			char[]  myChars = {'A','B','C','D'};
			int HighestIndexNum2 =  myChars.length -1;
			System.out.println(HighestIndexNum2);
			
			
		
			
			
			
		
	}

}
