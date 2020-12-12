package Medium.interviewQuestions;

public class PasswordValidation {

	public static void main(String[] args) {
	
		String password = "asDe1~mn";
		System.out.println(isValidPassword(password));
	}
	
	/*
	 * @param   regex
     *          the regular expression to which this string is to be matched
     *
     * @return  {@code true} if, and only if, this string matches the
     *          given regular expression
	 * 
	 * A regular expression is a special sequence of characters that helps you match or find other 
	 * strings or sets of strings, using a specialized syntax held in a pattern. 
	 * They can be used to search, edit, or manipulate text and data.
	 */
	
	
	public static boolean isValidPassword(String str) {
		
		return 	str.length()>=6 && 
				!str.contains(" ") && 
				str.matches(".*[a-z].*") && 
				str.matches(".*[A-Z].*") && 
				str.matches(".*[0-9].*") &&
				str.matches(".*[!~#$%^&*@].*");
	}

}
