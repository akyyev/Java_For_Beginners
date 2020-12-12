package Beginner.day27_CustomMethods;

public class PracticeMethods {
	
	/*
	 
	  write a method that can remove duplicates from the string and prints out the 
	  		result
	 			
	 			Ex: RemoveDuplicates("aabbcccccddddaaa")
	 			output: abc
	 			
	 */
	
	public static void main(String[] args) {
		/*
		String str ="abcabcabcDDDEEEFFFF";
		
		String result = "" ;  //"abc"
		for(int i=0; i < str.length(); i++) {
			if( ! result.contains( str.substring(i, i+1)) ) {
				result += str.substring(i, i+1);
			}
		}
		
		System.out.println(result);
		
			*/
		
		
		
		RemoveDuplicates("carcarcarcar");  // abc
		
		
	}
	
	
	public static void RemoveDuplicates (String a) {
		
		String result = "" ;  //"abc"
		for(int i=0; i < a.length(); i++) {
			if( ! result.contains( a.substring(i, i+1)) ) {
				result += a.substring(i, i+1);
			}
		}
		
		System.out.println(result);
		
	}
		
	

}
