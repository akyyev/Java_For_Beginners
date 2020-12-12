package Beginner.day30_WrapperClass_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPractice2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i <= 30; i++) {
            if (i % 2 != 0) {
                continue;
            }
            list.add(i);
        }

        System.out.println(list);


        System.out.println(list.size());


        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();


        for (int each : list) { // unboxing
            System.out.print(each + " ");
        }
        System.out.println();


        int num = list.get(7);  // unboxing,   there is no primitives in ArrayList

        System.out.println(num);

        //list.clear();  // the size of list becomes 0:   []

        System.out.println(list.get(2));


        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 20; i >= 0; i--) {
            list2.add(i);
        }

        System.out.println(list2);


        // sorting the arraylist:
        Collections.sort(list2);
        System.out.println(list2);


    }


}
