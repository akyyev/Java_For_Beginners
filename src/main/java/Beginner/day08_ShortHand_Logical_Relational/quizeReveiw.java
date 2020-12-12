package Beginner.day08_ShortHand_Logical_Relational;

public class quizeReveiw {
	/*
	 		Assesment quiz 02:
	 		
	 */

    public static void main(String[] args) {
        // question01
        int ivar = 100;
        double dvar = 200;
        float fvar = 300;

        //  ivar = fvar;  // float > int

        fvar = ivar;  // !false compiles

        dvar = fvar; // !false .   double > float

        //	  fvar = dvar;  // !can .   double > float


        String str1 = "Result A" + 1 + 2;
        //			"Result A12"

        // String str2 ="Result A" + 7 - 2;
        //				"Result A7" - 2

        //  System.out.println(str2);

        String str3 = "Result A" + 7 * 2;
        //			"result A" + 14
        //			"result A14";

        String str4 = "Result A" + 8 % 2;
        //			"Result A" + 0
        //			"Result A0";


        System.out.println(str1);
        System.out.println(str3);
        System.out.println(str4);


        System.out.println("Result A" + (1 + 2));
        //					"Result A"+	3   ==> Result A3

        System.out.println("result A" + (1) + (2));
        //				"Result A"	+ 1  +      2


        // question 4:
        long L = 30L;
        long L2 = (byte) L;  // !can't == can
        System.out.println(L2);


        // question 5:  
        double J, K, P = 10;
        System.out.println(P);

        //	  J =K ;  // local variable MUST be initialized before use  ==  !false
        //	P = K;  // local variables MUST be initialized before use

        //  K=J;

        //	  System.out.println( 9/0 );


        // question 6: 
        float a = 100.987_6543f;
        short S = (byte) a;  // float > short
        byte B = (byte) S;

        System.out.println(B);


        // Question 8:
        int X = 3, Y = 2;

        long c = (X + Y) * 2 / 3 % 2;
        //			5 *2 / 3 %  2
        //			10/3 %2
        //			3 % 2 ==> 1


        //Question 10:
        // 1,000,000,000   ==>  1_000_000_000
        long Lnu_m$ = 3_000L;

        double Dnum$ = (float) Lnu_m$;    // 3000.0

        int Inum = (short) Dnum$;
        System.out.println(Inum % 1000);  //0


        // question 11:
        System.out.println(10 / 3); //3
        System.out.println(10 / (double) 3); // 3.3333333..

        System.out.println(10.0 / 3);  // same

        System.out.println((int) (10.0 / 3)); // 3


        double T = 10 / 3;
        //		T = 3; ==> 3.0
        System.out.println(T);  // 3.0

        // Question 14:

        String str = "10.5" + 3;  // 10.53

        //	int I = (int)str;    


        // Question 15:
        int x = 10;

        int y = x++; // y=10, x = 11
        //		  post: 

        System.out.println(y++ + "  " + x++ + "  " + y);  // y=11, x =12
        //					10               	11      11

        System.out.println(x + " " + y);
        
    }

}
