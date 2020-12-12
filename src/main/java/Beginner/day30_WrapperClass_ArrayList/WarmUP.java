package Beginner.day30_WrapperClass_ArrayList;

public class WarmUP {
	
	/*
	 
	 1. write a return method that accepts a String and removes duplicate 
	 	values from the String
	Ex:
		RemoveDuplicate("aaabbbccc") ==> "abc"


	2. write a return method that accepts String and returns the unique 
	values from the String
	Ex: 
			Unique("AABBCDEEE")  ==> "CD"
			
			
	 */

    public static void main(String[] args) {

        String str = RevDup("aabbccDDDEEEEEE");

        System.out.println(str);   // abcDE


        String str2 = UniqueValue("AABBCDEEE"); // "CD"
        System.out.println(str2);


    }

    // task01
    public static String RevDup(String str) {
        // "aabbcc";   ==>  "abc"
        String result = "";  // to store the non duplicated values
        for (int i = 0; i < str.length(); i++) {
            if (!result.contains(str.substring(i, i + 1))) {
                result += str.substring(i, i + 1);
            }
        }

        return result;
    }


    // task02
    public static String UniqueValue(String str) {
        // "AABBCDEEE"   ==> "CD"
        String result = "";  // to store unique characters

        for (int j = 0; j < str.length(); j++) {

            int count = 0;  // to count number of appearances
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            if (count == 1) {
                result += "" + str.charAt(j);
            }

        }

        return result;

    }


    public static void method1() {
        return;
    }


}
