package Medium.project_2_Fraction_Calculator;

import java.util.Scanner;


public class FractionCalculator {

	public static void main(String[] args) {

		System.out.println("\t\tThis program is a fraction calculator"
				+ "\nIt will add, subtract, multiply and divide fractions"
				+ " until you type Q to quit");
		
		System.out.println("------------------------------------------------------------------------------------------");
		
		Scanner sc = new Scanner(System.in);
		
		FIRST : while( true ) {
			System.out.print("Please enter an operation (+, -, *, /, = or Q to quit): ");
			String a1 = sc.next();
			

			if(a1.equalsIgnoreCase("Q")) break;
			
			while(!(a1.equals("+")|| a1.equals("-") || a1.equals("/") || a1.equals("*") || a1.equals("=") ))
			{
				System.out.print("Invalid input (+, -, *, /, = or Q to quit): ");
				 a1 = sc.next();
				 if(a1.equalsIgnoreCase("q")) break FIRST;
					 //System.exit(0);
			}

			sc.nextLine();

			
			Fraction fr1 = getFraction(sc);
			Fraction fr2 = getFraction(sc);
			
			System.out.println(calculate(fr1, fr2, a1));
				
		
			System.out.println("------------------------------------------------------------------------------------------");
			
		}
		sc.close();
	}
	
	static String calculate(Fraction fr1, Fraction fr2, String operation) {
		
		String print = fr1.toString()+" "+operation+" "+fr2.toString();
		
		switch(operation) {
			case "+":
				return print + " = "+ fr1.add(fr2);
			case "-":
				return print + " = "+ fr1.subtract(fr2);
			case "/": 
				if(fr2.toDouble()==0) return print + " = Invalid divisor! Can't be zero.";
				else return print + " = "+ fr1.divide(fr2);
			case "*":
				return print + " = "+fr1.multiply(fr2);
			case "=":
				return print + " ?: "+fr1.equalTo(fr2);
			default:
				return "Invalid operation";
		}
	}

	public static boolean validFraction(String input) {
		// To solve: 1/
		if(input.charAt(input.length()-1)=='/') return false;
		
		String[] arr = input.split("/");
		if(arr.length>2) return false;
		
		try {
			Integer.parseInt(arr[0]);
			if(arr.length==2) {
				int last = Integer.parseInt(arr[1]);
				if(last==0) return false;
			}
		} catch(NumberFormatException e) {
			return false;
		}
		return true;
	}
	
	public static Fraction getFraction(Scanner input) {
		
		System.out.print("Please enter a fraction (a/b) or (a): ");
		String fr = input.nextLine();
		
		while(!validFraction(fr)) {
			System.out.print("Invalid fraction. Please enter (a/b) or (a), where a and b are integers and b is not zero: ");
			fr = input.nextLine();
		}
		
		String[] arr = fr.split("/");
		
		int num = Integer.parseInt(arr[0]);
		int den = 1;
		
		if(arr.length==2) den = Integer.parseInt(arr[1]);
		
		return new Fraction(num, den);
	}

}

	
	
	






