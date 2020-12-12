package Beginner.day27_CustomMethods;

public class VoidMethod_WithArgument {
	
	/*
	 
	 methods with argument:
	 
	 	access-modfier  specifier  return-type name(parameter){

				
		}
	 
	 	parameters: any data-type
	 */

    public static void main(String[] args) {
        //	oddOrEven();  
        // method was designed to take an argument. 
        // the method needs the argument in order to perform its task

        //	oddOrEven( 8.5 ); 
        // need to provide a value that can be assigned to the parameter of the method

        oddOrEven(50);

        int z = 100;  // local variables MUST be initialized before we use it

        oddOrEven(z);   // variable z' value will be assigned to parameter variable a 
        //int z = 100;


        //	SumOfTwoNums(); // not enough information was provided for the method to perform its task

        //	SumOfTwoNums(10); // still not enough information 

        SumOfTwoNums(10, 20);


    }


    public static void SumOfTwoNums(int a, int b) {
        System.out.println("Sum of " + a + " and " + b + " is : " + (a + b));
    }


    public static void oddOrEven(int a) {

        if (a % 2 == 0) {
            System.out.println(a + " is Even number");
        } else {
            System.out.println(a + " is Odd number");
        }
    }


}
