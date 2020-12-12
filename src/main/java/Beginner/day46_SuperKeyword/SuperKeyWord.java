package Beginner.day46_SuperKeyword;

class A {
	
	String name = "Kelly";
	
	public void methodA() {
		
	}
	
	
	public A ( int a ) {
		
	}
	
}


public class SuperKeyWord extends A {
		//      sub               super
	
	public SuperKeyWord() {
		super(10);  // super class' constructor MUST be called in the sub class
	}
		  	
	
	/*
	 	String name  = "Kelly";
	 */
	
	public void method() {
		super.name = "Miranda";
		this.name = "Ruth";
		super.methodA();
		this.methodA();
	}
	
	
}
