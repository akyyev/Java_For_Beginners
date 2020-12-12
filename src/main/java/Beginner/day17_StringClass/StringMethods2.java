package Beginner.day17_StringClass;

public class StringMethods2 {
	public static void main(String[] args) {
		
		/*
		 replace(old char, new char ):
		 			replaces all the old char values with the 
		 			given new char value in the String and 
		 			returns it as NEW String value
		 			
		 */
			String str1 = "Java is Fun Programming Language";
					str1 = str1.replace('a', '1');
					System.out.println( str1 );
					
		
		/*
		 replace(old str, new str):
		 		replace all the old str values with the given new 
		 		str values in the String and 
		 		returns it as NEW String value
		 			
		 */
		
		String str2 ="Today is gonna be a great day to learn java java";
		    str2 =	str2.replace("Today", "Tomorrow");
		    System.out.println(str2);
		    
		    str2 = str2.replace("java", "");
		    System.out.println(str2);
		    
		    
		    
	    /*
	     replaceFirst(old str, new str):
	     			it replaces the first occurred old str with the 
	     			new str in the String and returns it as 
	     			a NEW String value	     				
	     
	     */
		  
		    String s1 ="Java is fun and great, Java is good";
		    //							             S G
		    		s1 = s1.replaceFirst("Java", "Python");
	    		System.out.println(s1);
	    		
	    		s1 = s1.replaceFirst("is good", "iS Good");
	    		System.out.println(s1);
		    
		    
		String s2 ="Java is programming language, Java is Java";
			s2 = s2.replace("Java is J", "C# is j");
			System.out.println(s2);
		
		
		
			
	}

}
