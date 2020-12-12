package Beginner.day36_JavaReveiw;

public class ConstructorsReveiw {
	
	public ConstructorsReveiw() {
		
		System.out.println("default constructor");

	}
	
	public ConstructorsReveiw(int a) {
		
		System.out.println("Constructor with argument int: "+a);
		
	}
	
	
	public static void main(String[] args) {
		
		
		ConstructorsReveiw obj = new ConstructorsReveiw(); 
		
	//	ConstructorsReveiw obj2 = new ConstructorsReveiw("Section 12"); 
							// the constructor with arg of String is not exist
		
		ConstructorsReveiw obj2 = new ConstructorsReveiw(10); 
		
		
	}

}
