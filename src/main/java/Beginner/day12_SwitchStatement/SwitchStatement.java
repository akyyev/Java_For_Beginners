package Beginner.day12_SwitchStatement;

public class SwitchStatement {
	
	/*
	 swicth statement does the similar thing like multi-branch if statement
	 
	 		switch(Expression){
	 			case CaseVale: 
	 					statements1
	 					statements2
	 					break;
	 					
				default: 
					statement;
	 		
	 		}
	 
	 
	 */
	public static void main(String[] args) {
		
	
	int score =1; 
	if( score ==1 ) {  // MUSt give boolean expression
		System.out.println("1");
	} 
	else if (score == 2) {
		System.out.println("2");
	} else {
		System.out.println("Invalid");
	}
	
	
	switch(score) { // Must give an Expression: data
		case 1:
			System.out.println("1");
			break;
			
		case 2:
			System.out.println("2");
			break;
		
		default:
			System.out.println("Invalid");
			break;
		
	}
	
	
	switch(score) { // Must give an Expression: data
		case 2:
			System.out.println("2");
			break;		
	
		case 1:
			System.out.println("1");
			break;  // closing statement
		
		
			
		default:
			System.out.println("Invalid");
			break;
	}
	
	
		String str ="Java";
		
		switch (str) {
			
			case "C#":
				System.out.println("C# programming Language");
				break;  
			// System.out.println("C# programming Language"); 
					// case was closed at line 76
				
			case "Python":
				System.out.println("Python programming language");
			
			default:  // else
				System.out.println("Invalid");
		}
	
	
	
	char grade = 'A';
	
	switch(grade) {
				
		case 'B': 
				System.out.println("Passed with B");
				
		case 'C':
				System.out.println("Passed with A");
				
		default:
			System.out.println("Failed");
			
	}  // switch statement only exits when there is break statement or }
	
	
	
	
	
	
	
	
	
	

}
}
