package Beginner.day43_JavaRecap;

public class Static_VS_Ins_VS_Constructor {
	
	static {
		System.out.println("Static Block");
		// executed as soon as the class is loaded, only once
	}
	
	{
		System.out.println("Instance block");
		// executed when the object is created, runs before the constructor
	}
	
	public Static_VS_Ins_VS_Constructor() {
			System.out.println("Constructor");
		// executed when the object is created, runs after the instance block
	}
	
	public static void main(String[] args) {
		
	Static_VS_Ins_VS_Constructor obj = new Static_VS_Ins_VS_Constructor();
	Static_VS_Ins_VS_Constructor obj2 = new Static_VS_Ins_VS_Constructor();
	
	// number of execution of constructor and instance block depends on the number of the objects
		
		System.out.println("hello");
	
	}

}
