package Beginner.day33_ArrayList;

import java.util.ArrayList;

public class ArrayListMethodsPractice {

    public static void main(String[] args) {

        //set(index number, Object):
        ArrayList<String> Avengers = new ArrayList<>();
        Avengers.add("Jena");  // 0
        Avengers.add("Mary");  // 1
        Avengers.add("Tarah"); // 2
        Avengers.add("Dany"); // 3

        Avengers.set(1, "Sean");  // [Jena, Sean, Tarah, Dany]
        // Pilot Christopher

        Avengers.remove(0);
        Avengers.add(0, "Pilot Christopher");
        System.out.println(Avengers);


        // remove(int):	 removes the index
        // remove(Object): removes the first matching object and retuns boolean value
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1); //0
        numbers.add(2);    //1
        numbers.add(3);    //2
        numbers.add(4);    //3
        numbers.add(5);    //4

        numbers.remove(3);  // removes index 3 ==>[1, 2, 3, 5]
        System.out.println(numbers);

        //	numbers.remove( Integer.parseInt( "3" ) );  // parse method returns primitives  
        boolean result = numbers.remove(Integer.valueOf("3")); // value of method returns wrapper class

        System.out.println(numbers);
        System.out.println(result);


    }

}
