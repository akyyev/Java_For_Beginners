package Beginner.day28_JavaRecap;

import java.util.Arrays;

public class ArraysReveiw {

    public static void main(String[] args) {
	
	/*
	 	single dimensional array:
	 	    three ways to declare:
	 			int[] arr1D = { 1, 2, 3, 4 };
	 			int arr1D[] = { 1, 2, 3, 4 };
	 			int arr1D[]  = new int[]{ 1, 2, 3, 4 };
	 */
        // int[] arr1D = new int[]{ 1, 2, 3, 4 };
        int arr1D[] = {1, 2, 3, 4};
        //    index:    0  1  2  3
        System.out.println(arr1D[2]);  //3

        // initialize the size of 1D array: int[] arr = new int[Length number]
        int[] arr = new int[3];   // [0, 0, 0]
        // this array can contain three values
        arr[1] = 10;                 // [0, 10, 0]
        arr[0] = 30;                 // [30, 10, 0]
        arr[2] = 40;                 // [30, 10, 40]
        //	arr[3] = 50;   // Array's size is fixed

        // to print the array: array needs to be converted to String
        System.out.println(Arrays.toString(arr));


        int[] numbers = {10, 20, 30, 40};

        for (int eachValues : numbers) {

            if (eachValues == 20) {
                continue;  // skips every single statements after the continue
            }

            System.out.print(eachValues + " ");

            break;  // exits the loop immediately

        }

        System.out.println();

        int[] nums = {100, 200, 300, 400};

        for (int i = 0; i < nums.length; i++) {
			/*
			if(nums[i] == 300) {
				break;   // 100 200 
			}
			*/

            System.out.print(nums[i] + " ");


            if (nums[i] == 300) {
                break;   // 100 200 300 
            }


        }
        System.out.println();
		/*
		 Arrays Util class:  toString() , sort(), deepToString()
		 	
		 		toString(): converting single dimensional array to String
		 		sort(): sorting single dimensional array in ascending order
		 		deepToString(): converting Multi-Dimensional array to String
		 */

        // sort():
        long[] LongArr = {20, 400, 500, 300, 10, 20};
        System.out.println(Arrays.toString(LongArr));

        Arrays.sort(LongArr);
        System.out.println(Arrays.toString(LongArr));


        // deepToString():

        int[][] arr2D = {{1, 2}, {3, 4}};
        //  index			0          1

        System.out.println(Arrays.toString(arr2D)); // arrays.toString cannot convert MD arrays to String

        System.out.println(Arrays.deepToString(arr2D));

        //in 2d array: [index number of 1D arrays][index number of values]

        // print: {3, 4} 
        System.out.println(arr2D[1]);  // needs to be converted to string
        System.out.println(Arrays.toString(arr2D[1]));

        // print :4
        System.out.println(arr2D[1][1]);


        // arr2D = {  {1 , 2} ,  {3, 4}   };
        for (int[] each1DArray : arr2D) {
            for (int eachValue : each1DArray) {
                System.out.println(eachValue);
            }

            //	System.out.println(Arrays.toString(each1DArray) );
        }


    }

}