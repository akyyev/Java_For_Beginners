package Beginner.day05_Recap;

public class Quizes {

    public static void main(String[] args) {
        // main method  is the entry point of java application
		
		/*
		 	multiple ways to declare main method:
				 1. public static void main(String[] args)  {   }
				 2. static public void main(String[] args)  {   }
				 3. public static void main(String...  args) {   }
		 */
		

        //	int 7num = 10;   cannot start with digits
        //	Range: double > float > long > int > short > byte

        double num = 10L;
        // long value can be assigned to double and float


        double b = 5.5F;  // double > float


        float num2 = 10;

        // float num3 = 5.5;  // double > float
        float num4 = 5.5f;

        double num5 = 10l;
        System.out.println(num5);
        // float and double designed for decimals


        int _variableName = 10;
        int $VariableName2 = 20;
        //	int %VariableName3 =40;


        // 1,000,000
        int accountNum = 1_000_000_000;


        int iNum = 10;
        long LNum = iNum; // 10

        long LNum2 = 10L;
        System.out.println(LNum2);// 10

        float FNum = 5.5F;
        System.out.println(FNum);  // 5.5


        int myNum = '9';
        System.out.println(myNum);  // numbers

        //	int myNum2 = 'AWS';

        // boolean result ='C'; 
        // boolean takes true or false boolean expressions


        // Self quiz:
        int i = 100;
        double d = 300L;
        float f = 200f;

        // i =f;   // int is smaller than float
        f = i;
        d = f;
        //	 f = d;   double > float
        d = i;
        //	 i = d;  double > int


        double num1 = 10F;
        
        // int int = 100;


        System.out.print("Hello");
        System.out.print(" Section12");
        System.out.println(" Learner");
        System.out.println("School");
		 
		 
		 /*
			  \n (or \r): new line
			  \t: horizontal tab
			  \\: prints a single slash
			  \' : prints single quote
			  \" :  prints double quote
		  */

        System.out.println("Today is great Day\nFriday");
        System.out.println("\tTomorrow is Saturday, it's a day off");
        System.out.println("\\");
        System.out.println("\'Game of Throne\'");
        System.out.println("I like to read \"Books\"");
    }

}
