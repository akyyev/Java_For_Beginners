package Beginner.day35_Constructors;

public class ConstructorMethod {
	

	public ConstructorMethod(int a) {
		this(10.5);
		System.out.println("constructor with argument: "+a);
		
	}
	
	public ConstructorMethod(double a) {
	//	this(10.5);  // constructor cannot call it self 
		
	//	this(10);  // constructor cannot contain itself
		System.out.println("constructor with argument: "+a);
	
		
	}
	
	public ConstructorMethod(boolean a) {
		// ConstructorMethod(9);   // constructor cannot be called by constructorname
	
	//		System.out.println("constructor with argument of: "+a);
							// the constructor call HAS to be the priority in the constructor
			
	//	this(100);
		this(10.5);
		
		System.out.println("constructor with argument of: "+a);
	}
	
	
	public static void main(String[] args) {
		
		// ConstructorMethod obj = new ConstructorMethod("Hello");
										// the constructor is not exist
		
	//	ConstructorMethod obj2 = new ConstructorMethod();
							// the constructor is not exist
		
		ConstructorMethod obj3 = new ConstructorMethod(100);
		
		System.out.println("====================================");
		
		method1();
		
	//	ConstructorMethod();
		
		ConstructorMethod obj4 = new ConstructorMethod(true);
		
	}
	
	
	public static void method1() {
		
		
	}
	
	

}