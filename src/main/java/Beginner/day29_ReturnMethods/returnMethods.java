package Beginner.day29_ReturnMethods;

public class returnMethods {
	/*
	 access-modifier specifier  returnType name(parameter){
	 				statements;
	 }
	 */
	
	public static void main(String[] args) {
		
		name();  // this is a String value
	//	"z"
		
		System.out.println( name() ); // return methods are either printed or assigned to the variable
	
		String str = name();
		
		System.out.println( str );
	
	
	}
	
	
	public static boolean result( ) {
		return 8 >9;
	}
	
	
	
	// if return type is void:
		public static void method1() {
			System.out.println("Hello");
			return;
		}
	
	// if the return type of the method is not void:
		public static String name() {
			return "bacth12";
		//	System.out.println();	
			//	once return statement executed it exits the method immedietly
		}

}
