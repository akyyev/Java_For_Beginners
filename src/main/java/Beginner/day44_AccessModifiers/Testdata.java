package Beginner.day44_AccessModifiers;

public class Testdata {
	
	public static String Name ="Juline";
	public static String ID = "007";
	public static String SchoolName = "Learner";
	public static int age =20;   // access modifier is default
	
	
	private static String Password ="learner";
	
	
	 static double salary =100000;  // deafult access modifier
	 
	 protected double number = 123;  // protected access modifier
	
	
	public static void printHello() {
		System.out.println("Hello");
	}

}
