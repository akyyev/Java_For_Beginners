package Beginner.day23_Arrays;

public class WarmUp2 {
    /*
     2. write a program that can find the unique characters from a String.
        Ex: 
            input:
                AAABCDEEFF

            output:
                BCD
     
     */
    public static void main(String[] args) {

        String str = "ALL THE LETTERS";
        //			 i			
        String Unique = "";   // to store all the unique chars from str

        for (int j = 0; j < str.length(); j++) {

            int count = 0;  // count how many times the character is appeared

            for (int i = 0; i < str.length(); i++) {
                //		highest value of i:  str.length()-1
                if (str.substring(i, i + 1).equals(str.substring(j, j + 1))) {
                    // ""+str.charAt(j)
                    count++;
                }
            }

            if (count == 1) {
                Unique += "" + str.charAt(j);
            }

        }


        System.out.println(Unique);


    }
}
