package Beginner.day08_ShortHand_Logical_Relational;

public class warmup {
	
	/*
	 Task2:
	 		write a java program that converts gallons to liters
	 					1 gallon = 3.785 liters
	 					1 litter = 1/3.785
	 
	 		write a java program that converts litters to gallons
	 					1 gallon = 3.785 liters
	 					1 litter = 1/3.785
	 */
	
	public static void main(String[] args) {
		// Task 2:
		int gallon = 1000;
		double liters = gallon * 3.785;  // 
		String result1 = gallon +" gallons equal to " + liters + " litters";
		
		System.out.println(result1);
	
	
		int L = 100;
		double G = L / 3.785;  //  100/3.785
		String result2 =  L +" litters equal to "+ G +" gallons";
		
		System.out.println( result2 );
		
			
		// Task1: 
		int x = 2;
		int y=  x++;  // y = 2; x=3
			//  post: pass the current value and then increases the value by 1
		System.out.println(y+" "+x);
		
		
		int x2 =2;
		System.out.println( x2++ );  //2
		System.out.println( x2 );  // 3
		
		int x3 = 2;
		System.out.println( --x3 ); // 2-1=1
		//					pre : decreases the value by 1 immediately
		
		int x4 = 8;
		int y4 = x4--; // y4=8 , x4=7
		System.out.println( y4 );  //8
		System.out.println( x4 ); //7
		System.out.println( y4 );  //8
	
		
		
		
			
			
			
	}
}
