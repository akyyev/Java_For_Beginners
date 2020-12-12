package Beginner.day29_ReturnMethods;

public class returnStatement {
	
	public static void main(String[] args) {
		
		System.out.println("Hello");
		
		/*
		if(true) {
			return;
		}
		*/
		
		System.out.println("Hola");  // once return statement is executed, it exits the method
		
		
		
		for(int i=0; i < 5; i++) {
			if(i == 3) {
				return;
			}
		System.out.println(i);
		
		}
		
		System.out.println("Completed");
		
		
		
	//	return "text";
	}

}
