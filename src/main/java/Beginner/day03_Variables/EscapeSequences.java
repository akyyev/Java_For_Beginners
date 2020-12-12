package Beginner.day03_Variables;

public class EscapeSequences {
	/*
	  \n (or \r): starts from a new line
	   \t :  horizontal tab
	   \\: prints a back slash
	   \': prints single quote
	   \": prints double quote
	 
	 
	 \: backslash
	 /:front slash
	 */
	
	public static void main(String[] args) {
		System.out.println("Hello World\n Welcome to Java Learning Course");
		
		System.out.print("Tomorrow is off \n");
		System.out.print("True\r");
		System.out.println("False\n\n\n");
		
		System.out.println("\tClass starts tomorrow");
		
		System.out.println("\\John");
		System.out.println("\'Java ");
		
		System.out.println("Book is called \"Game of Throne\" ");
		
	}
	

}
