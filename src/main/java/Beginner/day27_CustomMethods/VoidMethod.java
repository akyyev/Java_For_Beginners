package Beginner.day27_CustomMethods;

public class VoidMethod {
	
	/*
	 	declaration of method:
	 	access-modifier   specifier   return-type  methodName() {
	 	 			statements;
	 	 		}
	 	
	 */

    public static void main(String[] args) {

        myFirstMethod();

        even1To100();
	/* 
	  	method is grouping a series of statements to perform specific task
	  	benefits: reusable, can avoid repeating the same set of statements
		
		*/


    }


    public static void even1To100() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }

    }


    public static void myFirstMethod() {

        //	public static void main(String[]) {  }  
        // methods must be declared within the class

        System.out.println("Hello World");
        System.out.println("Hello Learner");
        System.out.println("Hello Hugo");

    }
	

}
