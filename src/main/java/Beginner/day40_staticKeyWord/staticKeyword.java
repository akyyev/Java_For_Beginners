package Beginner.day40_staticKeyWord;

import java.util.Scanner;

public class staticKeyword {
			
		int a;
		static int b ;
		static Scanner scan = new Scanner(System.in);
		
	public static void main(String[] args) {
		
		
		staticKeyword obj1 = new staticKeyword();
			obj1.a = 100;	 
				
			
		staticKeyword obj2 = new staticKeyword();
			obj2.a = 200;
			
			System.out.println( obj1.a );  // 100
				// each object has its own copy of instance variables
			
			System.out.println( obj2.a ); //  200
			
		double num = 100.5;
		
		 obj1.b = 900;
		
		 System.out.println( staticKeyword.b ); //900
		System.out.println( obj1.b ); //900
		
		System.out.println( obj2.b ); // 900
		
		System.out.println("=======================");
		
		staticKeyword obj3 = new staticKeyword();
				obj3.a = 100;
				System.out.println(obj3.a);    // 100
				
				
		staticKeyword obj4 = new staticKeyword();		
		System.out.println(  obj4.a );   //  0
		
		
		obj3.b = 400 ;
		System.out.println( obj3.b ); // 400  
		
		System.out.println( obj4.b );  // 400
		
		
		
	}
	
	public static void method1(){
	//	System.out.println( num );  local variables only visible within the methods
		
		int a = staticKeyword.scan.nextInt();
	}
	
	
	public void printHello() {
		
		int a =  scan.nextInt();
		System.out.println("Hello learner");
	}
	
	
	
	
	
	
	
	

}
