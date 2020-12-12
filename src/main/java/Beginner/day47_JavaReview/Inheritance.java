package Beginner.day47_JavaReview;

class A {
	
	public String name1 = "Amy";
	
	public void mm() {
		// super.name1 = "Alen";  // super keyword MUST be used in sub class
	}
	
	public static void N() {
		
	}
	
}

class B extends A{
	
 // public String name1 = "Amy"; // Alisa
	public String name2 = "Rose";
	public String name3 = "Mary";
	
	public static void J() {
		
	}
	
	public void method1() {
		super.name1 ="Alisa";
		super.mm();
		super.N();
		this.J();
	}
	
}

public class Inheritance  extends B {
	
//  public String name1 = "Amy";
//	public String name2 = "Rose";
//	public String name3 = "Mary";
	
	public String name4 = "Mike";
	public String name5 ="Danya";
	
	
	public static void main(String[] args) {
		
		Inheritance obj = new Inheritance();
		
		System.out.println( obj.name1  ); 
		System.out.println( obj.name2  ); 
		System.out.println( obj.name3  ); 
		System.out.println( obj.name4  ); 
		System.out.println( obj.name5  ); 
		
		System.out.println("===================");
		
		B obj2 = new B();
		System.out.println( obj2.name1  ); 
		System.out.println( obj2.name2  ); 
		System.out.println( obj2.name3  ); 
	//	System.out.println( obj2.name4  );   //super class cannot inherit anything from the sub class
	//	System.out.println( obj2.name5  );  //super class cannot inherit anything from the sub class
		
		System.out.println("=============================");
		
		A obj3 = new A();
		System.out.println( obj3.name1 );
//		System.out.println( obj3.name2  ); //super class cannot inherit anything from the sub class
//		System.out.println( obj3.name3  ); //super class cannot inherit anything from the sub class
	//	System.out.println( obj3.name4  );   //super class cannot inherit anything from the sub class
	//	System.out.println( obj3.name5  );  //super class cannot inherit anything from the sub class
		
		
		
		
		
		
		
	}
	
	
	

	
}
