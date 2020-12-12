package Beginner.day48_MethodOverRiding;

class Danya{
	
	void methodA() {   
		// the method we are going to override MUST be inheritable to the sub class
		System.out.println("Method A");
	}
	
	
	public String methodB() {
		return "B";
	}
	
	/*
	public String methodB() {
		return "C"
	}
	*/
	
	
	protected double salary(double bonus) {
		return bonus+100000;
	}
	
}

public class AccessModifiers extends Danya {
	/*
	 protected double salary(double bonus) {
		return bonus+100000;
	}
	 */
	
	@Override
	protected double salary(double bonus) {
		return bonus+20000;
	}
	
	
	/*
	@Override
	private void methodA() {
		System.out.println("Method A");
	}
		override method' access modifiers need to be same or more visible
	*/	
	
	@Override
	 void methodA() {		//  same or more visible
		System.out.println("Method A");
	}
	
	@Override
	public String methodB() {
		return "C";
	}
	
	
}
