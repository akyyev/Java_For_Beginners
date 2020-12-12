package Beginner.day06_ArithmaticOperators;

public class Review {


    public static void main(String[] args) {

        // Task 04:
        int a = 10; // 15
        int b = 15;  // 10
		
		/*	
			a = b;  // a = 15
			b = a;   // b = 15
		*/

        a = a + b;    // a =25;
        b = a - b; 	  // 25 -15 =10;    b=10;
        a = a - b;    // 25 -10 =15;     a = 15

        System.out.println(a + "\n" + b); //  15, 10


        // Task01: 

        int city1 = 2345673;
        int city2 = 5688944;
        int city3 = 16189445;

        System.out.println("\t\t" + city1 + " " + city2 + " " + city3);


    }


}
