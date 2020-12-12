package Beginner.day07_Unary;

public class UnaryOperators {

    public static void main(String[] args) {
		
		/*
             +: positive
             -: negative
             ++:  increment
             --:  decrement 
             
            for  + & -: 
                 + - ===> -
                 - - ===> +
                 + + ===> +
                 - + ===> -
		 */

        int a = 10;
        int b = -a;
        System.out.println(b);

        int c = +b;  //  + (-10)  ==> -10
        System.out.println(c);

        int d = -c;  // - (-10) ==> 10
        System.out.println(d);

        int f = -(10);
        System.out.println(f);

        // increment:
        //pre increment:  operator is placed before the variable; increase the value by 1 immideitly
        int num1 = 100;

        ++num1;  // 101

        int num2 = ++num1;   // ++(101) ==> 102

        System.out.println(num2);


        // post increment: operator is placed after the variable:

        int IntNum = 100;

        System.out.println(IntNum++);  // 100
        System.out.println(IntNum);   // 101


        int IntNum2 = IntNum++;  // IntNum2 = 101
        //	 IntNum2 =	101	

        System.out.println(IntNum2);

        System.out.println(IntNum); // 102


        int x = 100;
        int y = x++ - 1;
        //  y = 100 - 1;

        System.out.println(y);


        // decrement: decreases the value by 1
        //  pre-decrement: operator is placed before the variable.
        //				decreases the value by 1 immediately


        int Z = 100;

        System.out.println(--Z); //99


        // Post-decrement: operator is placed after the variable;
        //	it will pass the current value, and then decrease it by 1


        int Y = 95;

        System.out.println(Y--);  //95
        System.out.println(Y);  // 94


        int T = 25;
        System.out.println(++T); //26
        System.out.println(--T);  // 25


        int P = 50; // 50
        P = --P + P++ + P-- + P++;
        //   pre     post     post     post
        //    49  +   49   +   50   +  49
        //   P = 197


        System.out.println(P);


        short S = 4;  // 3
        int R = S * 4 - S--;
        //		   16     -    4  = 12

        System.out.println(R);  // 12
        System.out.println(S);


        int W = 1; //0
        W = -W-- + W++ / -W-- * --W;
        //		 post    post  post   pre	

        //  	- 1   +   0 / -1  *  -1
        //   -1   +    0   *  -1
        //  -1  +  0   
        //  = -1

        System.out.println(W);


    }


}
