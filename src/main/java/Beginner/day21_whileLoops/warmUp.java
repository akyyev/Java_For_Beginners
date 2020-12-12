package Beginner.day21_whileLoops;

public class warmUp {
	/*
	 1. write a java program that can count how many time 
	 	the word "book" is appeared in a String
	    Ex:
		input: I like books, I have books, I need book
		output: 3
	 */
	
	public static void main(String[] args) {
		
String sentence ="book book book book book";
		// index:        z
	int count = 0;
	for(int z= 0; z < sentence.length() - 3 ; z++) {

		if(sentence.substring(z, z+4 ).equals("book") ) {
				//			  0, 4
				//			  1, 5
			     //           2, 6
			//				 ...
			//				  16,  20  ==> 16, 19
			
			count++;
		}
		
	}
	
	System.out.println(count);
		
		
	
	
String words ="Learner is school, Learner is great, I love Learner";
//	index:		i,  i+7
// substring (i, i+7+1)    ending index is excluded in substring
	int nTimes = 0;
	for(int i = 0; i < words.length()-7; i++) {
		//					
		if(words.substring(i  ,  i+8 ).equals("Learner")) {
			//					 i+7
			nTimes++;
		}
		
	}
	
	System.out.println(nTimes);
	
	
	/*
	 write a java program that can remove duplicated values from String
		EX:
			input: aabbcc
			output: abc
	 */
	
		String s1 = "aabbcc";
		//		     i
		//	a:	(0, 1)	
	//			(i, 1+1)
		String result = "";  //abc  // to store the new String value that does not have duplicates
		
		for(int i=0; i < s1.length(); i++) {
			if(! result.contains( ""+s1.charAt(i) )) {
							//     s1.substring(i, i+1 )  
				//							(5, 6) ==> c
				result += s1.substring(i, i+1);
			}
		}
		System.out.println(result);
		
		// break till : 11: 15am
		
		
	}

}
