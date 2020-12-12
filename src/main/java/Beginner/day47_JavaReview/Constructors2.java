package Beginner.day47_JavaReview;

class Cinthya{
	
	public Cinthya(int a) {
		this(5.5);  // B
		//this("a");
		System.out.println("A");
		// this(5.5);
	}
	
	public Cinthya(double b) {
		//this(5.5);  cannot call itself
		 //this(10);  // cannot contain itself
		System.out.println("B");
	}
	
	public Cinthya(String str) {
		System.out.println("C");
	}	
	/*
	public Cinthya() {
		
	}
	*/	
}

public class Constructors2 extends Cinthya {
	
	public Constructors2() {
		super(5); //B
	}
	
	public static void main(String[] args) {
		Constructors2 obj = new Constructors2();  // C
		
		
		
	}
	

}
