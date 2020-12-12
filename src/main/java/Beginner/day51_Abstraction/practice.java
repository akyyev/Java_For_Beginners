package Beginner.day51_Abstraction;

abstract class Test{
	
	public Test(){
		
	}
	
	abstract void m();
	
	protected abstract void m(int a);
	
	public static void main(String[] args) {
		
	}
		
}


public class practice extends Test{
	
	// abstract void m();
	
	@Override
	void m() {
		practice obj = new practice();
	}
	
	@Override
	public void m(int a) {
		
	}
	
		final int num2 = 30;
		final static int num3 = 40;
	
	public static void main(String[] args) {
		final int num;  // constant
			num = 10;	
		System.out.println(num);
		
		
	}


}



final class A{
	
}

// class B extends A{}  final class cannot be super class

abstract class C{
	
	int num;
	static int num2;
	
	public static void main(String[] args) {
		
	}
	
	public static String main(String[] arr, String str) {
		return "A";   // return type doesn't matter in method overloading
	}
	
	static {
		
	}
	
	{
		
	}
	
	abstract void absmethod();
	
}

abstract class D extends C{
	/*
	@Override
	void absmethod() {
		
	}
	*/
	
	
	// final abstract void methodA();
	
	public abstract void methodB();
	protected abstract void methodC();
	abstract int methodD();
	
//	private abstract double methodE(); 
	// private is not visible outside the class
	
	
	// public abstract static void methodF();
	
}


class credentials{
	
	private  String username = "123";
	
	// getter (read only): return method
	public String getUserName() {
		return username;
		
	}
	
	// setter (modify): return type is void, has parameter
	public void setUserName(String username) {
			this.username = username;
			
	}

	
	
	
	
}





