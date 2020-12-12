package Beginner.day08_ShortHand_Logical_Relational;

public class LogicalOperators {

    public static void main(String[] args) {
		/*
		 && : And  logic        true && true ==> true,   other wise ==> false
		 || : or  logic         
		          				true  || false  ==> true
		          				true  || true   ==> true
		          				false || false  ==> false
			if both conditions are false it will return false, other wise will return true
		 
		 
		 */


        // &&:

        boolean ResultA = 9 == 0 && "John" == "good";
        //				   false          false   ==> false

        System.out.println(ResultA);

        boolean ResultB = 8 > 5 && 7 == (8 - 2 + 1);
        //					true  &&  true  ==> true

        System.out.println(ResultB);

        boolean ResultC = !false != true && !false == !(!true);
        //					true != true   &&  true == !false
        //						false     &&    true  ==> false
        System.out.println(ResultC);


        //  ||:

        boolean A = "Monday" == "Fun-day" || 6 == 6;
        //					false  ||  true ==> true
        System.out.println(A);

        boolean B = true || false;  // ==> true
        System.out.println(B);

        boolean C = !(8 > 5) || !("Today" != "friday");
        //      	!true     ||  !true
        //			false     ||   false
        System.out.println(C);


        //   || &&	:

        boolean D = true && true || false;
        //				true   ||  false
        System.out.println(D);

        boolean E = !(7 > 5 && 6 != 5) && (9 > 5 || 10 > 4);
        //			!( true &&  true )  && ( true ||  true )
        //			! true              &&      true
        //           false              &&        true
        //							false
				
        System.out.println(E);

        //	CodingBat


    }

}
