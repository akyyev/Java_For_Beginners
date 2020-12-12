package Beginner.day48_MethodOverRiding;

class Credentials{
	
	private final String UserName = "learner";
	private final String PassWord = "Section12";
	
	
	public String getUserName() {
		return UserName;
	}
	
	/*
	public void setUserName(String UserName ) {
		this.UserName = UserName;    
		// final variables cannot be re-assigned
	}
	*/
	
}


class Holly {
	
	 public  final void printName() {
		System.out.println("Mary");
	}
	
}




public class FinalKeyword extends Holly {
	
	/*
	@Override
	public void printName() {
		System.out.println("Kelly");
	}
			final methods cannot be override
	*/
	
		final int AGE =100;
	
	public final static void main(String[] args) {
		
		final String SSN = "123456";
		// SSN = "654321";   
			// final variables are constant and cannot be reassigned
			
		System.out.println(SSN);
		
		final String DateOfBirth;
		
	//	System.out.println(DateOfBirth);
		
		FinalKeyword obj = new FinalKeyword();
		
		System.out.println( obj.AGE );
	
		
	}
	
	
	public final static void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public static double add(double x, double y ) {
		return x+y;
	}
	
	
	
	
	
	

}
