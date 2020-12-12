package Beginner.day18_StringClass_Continue;

public class StringMethods_Boolean {
	public static void main(String[] args) {
		/*
		 isEmpty():	checks if the String is empty
		 		retunrs boolean expressions	
		 		empty ==> true,  !empty ==> false
		 */
		
		String str = "Learner";
			boolean R1 = str.isEmpty();  // false
			System.out.println( R1 );  // false
			
			String str2 = "";
			if( str2.isEmpty() ) {
				// true
				System.out.println("it's empty String");
			} else {
				System.out.println("it's not empty");
			}
			
		
	/*
	 equals(str): checks if the two String' visible text are 
	 		equal or not, then returns boolean expression
	 		
	 		equal ==> true       !equal ==> false
	 		
	 		
	 */
			String A1 = "Learner";
			String A2 = new String("Learner");
			System.out.println(A1 == A2);  // false
			
				boolean R2 = A1.equals(A2);
				System.out.println(R2);
				
		System.out.println( "java".equals("Java")  ); 
				// false, case sensitivity
			
		/*
		 equalsIgnoreCase(str):checks if the two String' visible 
		 text are equal or not, then returns boolean expression
		 		Case sensitivity does not matter
		 
		 */
		
		String s1 = "JAVA";
		String s2 = new String("java");
		System.out.println( s1 == s2 ); // false, different location
		System.out.println( s1.equals(s2) );  // false, case sensitivity
		System.out.println( s1.equalsIgnoreCase(s2) ); // true
		
		
		/*
		 contains(str): checks if the str is contained in the String 
		 or not,  then returns boolean expression
		 
		 conatined ==> true       !conatined ==> false
		 		
		 */
		
		String name ="John";
			boolean Result = name.contains("ABC"); // false
		System.out.println( Result); // false
		
		String name2 ="Gabriel";
	System.out.println(name2.contains("m"));// false, case sensitivity
		
		
		/*
		 startsWith(str): checks if the String is started with 
		 	the given str or not, then retunrs boolean expressions
		 
		 startedwith ==> true       !startedwith ==> false
		 
		 */
	
	String Today = "Java";
		boolean Result2 = Today.startsWith("J");  // true
		System.out.println(Result2);
	
		
String names = "Learner School is a great palce to learn java";
	
System.out.println(names.startsWith("Learner School"));  // true
	

	/*
	 endsWith(str): checks if the String is ended with 
	the given str or not, then retunrs boolean expressions
	
	endedwith ==> true        !endedwith ==> false
	 
	 */
		
			String B1 ="John";
			System.out.println( B1.endsWith("r") ); // true
			System.out.println(B1.endsWith("M"));   // false
	


	
			
		
	}

}
