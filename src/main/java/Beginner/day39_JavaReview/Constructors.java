package Beginner.day39_JavaReview;

public class Constructors {
	
	public Constructors() {
		//this("Hello");
		System.out.print("Mary ");
	}
	
	public Constructors(int a) {  // Mary Ali
		this(); // Mary
		System.out.print("Ali ");  // Ali
	}
	
	public Constructors(double a) {  //  Mary Ali Sandra
		this(100); // Mary Ali
		System.out.print("Sandra ");
		// this(10);	  constructor call must be the first step
	}
	
	public Constructors(boolean a) {   //  Mary Ali Sandra Daisy
		this(2.5);   //  Mary Ali Sandra
		System.out.print("Daisy ");
	}
	
	
	public Constructors(String str) {  // Mary Ali Sean
		this(100); // Mary Ali
		// this(true); // one constructor can only ccall one constructor 
		System.out.print("Sean ");
	}
	
	public Constructors(byte a) { // Mary Ali Sean Sabir
		this("hello"); // Mary Ali Sean
		System.out.print("Sabir ");
	}
	
	
	
	public static void main(String[] args) {
		
		Constructors obj = new Constructors( (byte)2 );
		
		
		
	}	
		
	

}
