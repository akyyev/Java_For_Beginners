package Beginner.day25_ArraysContinue;

import java.util.Arrays;

public class ArraysMethods {

    public static void main(String[] args) {

        int num1 = 10;
        System.out.println(num1);

        int[] arr = {1, 2, 3};
        System.out.println(arr);
		
		/*
		  to print entrire array as whole, we need to convert the array to String
		  			Arrays.toString( VairableName ): used for converting single
		  			 	 dimensional arrays to  String  value
		  			 	 
		  			Arrays class: Utility of all the arrays, 
		  				 		Arrays class is presented in "Java.util"package
		  			 	 
		  			 	 
		 */


        String str = Arrays.toString(arr);
        System.out.println(str);

        String[] names = {"Elvira", "Zoe", "Philip", "Spencer", "Alen"};

        System.out.println(names[0]);
        System.out.println(names);  // hash code
        System.out.println(Arrays.toString(names));
			
			
			/*
			 Arrays.sort(variableName): 
			 			sorts the values of the array in ascending order (smallest to largest)
			 
			 */
        int[] Numbers = {9, 8, 100, 3000, 4, 5, 6};

        System.out.println(Arrays.toString(Numbers));

        Arrays.sort(Numbers);   // sort all the values of the array in ascending order

        // sort method does: 	Numbers = [4, 5, 6, 8, 9, 100, 3000];


        System.out.println(Arrays.toString(Numbers));

        System.out.println("Maximum: " + Numbers[Numbers.length - 1]);
        System.out.println("Minimum: " + Numbers[0]);


        String[] nameLists = {"Francis", "Alice", "Myra", "Smith", "Jane", "Lexi", "ABC"};
        Arrays.sort(nameLists); // alphabetical order ( from AsCII table)

        System.out.println(Arrays.toString(nameLists));

        char[] ch = {'0', '9', '8', '5', '3', '2', '1'};
        Arrays.sort(ch);

        System.out.println(Arrays.toString(ch));


        int[] nums = {2000, 90, 89, 78, 65, 5555, 444, -5};

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("Minimum number: " + nums[0]);
        System.out.println("Maximum Number: " + nums[nums.length - 1]);
        System.out.println("Second Maximum Number: " + nums[nums.length - 2]);
        System.out.println("Second Minimum Number: " + nums[1]);
			
	/*
	 write a program that can print the arrays in Descending order (largest to smallest)
	 
	 */
        int[] MyNumbers = {99, 10, 200, 3000, 40, 50, 5000};
        Arrays.sort(MyNumbers);
        // MyNumbers -> [10, 40, 50, 99, 200, 3000, 5000]
        //				 0   1   2   3   4    5      6

        System.out.println(Arrays.toString(MyNumbers));

        String result = "[";
        for (int i = MyNumbers.length - 1; i >= 0; i--) {

            result += MyNumbers[i] + ", ";

        }
        System.out.println();

        result = result.substring(0, result.length() - 2) + "]";

        System.out.println(result);


        int[] arr2 = {99, 10, 200, 3000, 40, 50, 5000};
        Arrays.sort(arr2);  //  array will be sorted in Ascending order
        //	arr2 -> [10, 40, 50, 99, 200, 3000, 5000]
        //	      0  1   2    3   4    5     6

        int[] Descending = new int[arr2.length];
		/*
			Descending[0] = arr2[6];
			Descending[1] = arr2[5];
			Descending[2] = arr2[4];
			Descending[3] = arr2[3];
			Descending[4] = arr2[2];
			Descending[5] = arr2[1];
			Descending[6] = arr2[0];
		*/

        int z = 0;
        for (int i = arr2.length - 1; i >= 0; i--) {
            Descending[z] = arr2[i];
            z++;
        }

        System.out.println("Ascending order: " + Arrays.toString(arr2));

        System.out.println("Descending order: " + Arrays.toString(Descending));


    }
}
