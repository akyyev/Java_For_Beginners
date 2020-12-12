package Beginner.day25_ArraysContinue;

import java.util.Arrays;

public class StringMethods {
	
	/*
	 split(str): splits the String by the given value, and returns it as String array
	 
	 
	 toCharArray():
	 
	 */
	public static void main(String[] args) {
		
		String sentence = "Today is great day Good day to learn java";
		
				 String[] arr = sentence.split(" ");
			System.out.println( Arrays.toString(arr) );	 
			
			
			String email ="FirstName_LastName";
				 String[] arr2 =  email.split("_");
				 
				 String str = Arrays.toString(arr2);
		System.out.println( str.replace("[", "").replace("]", "")  );
				 
		
			String	 fullname  = "Learner School Section12";
			
					 String[] array1 = fullname.split(" "); // there are two spaces
					 System.out.println(  Arrays.toString(array1) );
	 
			
			String  Java = " Java I love Java and Java is fun, Java is Life Java ";
			//				I love  |   and   |  is fun,   | is Life  |
			
			String[]  array2  =  Java.split("Java");
				
			System.out.println(Arrays.toString(array2));
			System.out.println(array2.length-1); // java is occurred 3 times in the sentence
		
		
			String Python = " Python is good, I Love Python, Python is life ";
				// 			[     |   is good, I Love   | ,    |     is life      ]  
			String[]  array3 = Python.split("Python");
			System.out.println( array3.length-1 );   // retunrs the total number of python in STring
			
			
			
			String emailAddress ="Learner.school.bacth12@Gmail.com";
				emailAddress =  emailAddress.substring(0, emailAddress.indexOf("@") );
				String[] array = emailAddress.split("\\.");
				
				System.out.println(Arrays.toString(array));
			
				
				String word = "ABCDEFG";
				String[] AllCharacters =word.split(""); // all characters from the string as an array
						 		// splits the STring character by character
			
			System.out.println(Arrays.toString(AllCharacters));
			
		/*
		 toCharArray(): reteuns a char array from the String
		 */
			
			String Str ="Java";
				char[] ch =	Str.toCharArray();
				
				System.out.println(Arrays.toString(ch));
				
		
		
	}

}
