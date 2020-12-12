package Beginner.day33_ArrayList;

import java.util.ArrayList;

public class ArrayListClass {

    public static void main(String[] args) {

// declaration of arraylist:
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<>();


        // add(object):
        ArrayList<String> shoppingList = new ArrayList<>();
        shoppingList.add("apple");  // index: 0 ,  size: 1
        shoppingList.add("orange"); //  index: 1,  size: 2
        shoppingList.add("grape");  // index: 2,   size: 3

        System.out.println(shoppingList);

        // add(index, object): adds the object at the given index number
        // WE CANNOT SKIP THE INDEXES

        //	shoppingList.add("Strawberry");
        shoppingList.add(1, "Strawberry");
        System.out.println(shoppingList);

        //	shoppingList.add(5 , "Toyota Corolla");  // it does not skip indexes
        System.out.println(shoppingList);

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(0, 5);  // [5]
        numbers.add(1, 10); // [5, 10]
        numbers.add(2, 15); // [5, 10, 15]

        numbers.add(1, 1);   // [5, 1, 10, 15]

        numbers.add(1, 6);  //[5, 6, 1, 10, 15]

        System.out.println(numbers);

        //	get(index number): returns the object
        ArrayList<String> names = new ArrayList<>();
        names.add("Joel");
        names.add("Meri");
        names.add(1, "Mikrigul");
        names.add(1, "Tabriz");
        names.add(0, "Ally");

        String str1 = names.get(1);
        System.out.println(str1);

        // size(): returns the length of the arrayList as an Int value
        int length = names.size();
        System.out.println(length);

        for (int i = 0; i < names.size(); i++) {
            String each = names.get(i) + " ";
            System.out.print(each);
        }

        System.out.println();

        for (String each : names) {
            System.out.print(each + " ");
        }

        System.out.println();

        // clear(): removes all the objects from the arraylist
        ArrayList<String> students = new ArrayList<>();
        students.add("Holly");
        students.add("Mary");
        students.add("Nicole");
        students.add("Sean");
        students.add("Myra");

        System.out.println(students);
        System.out.println(students.size());  // 5
        students.clear();
        System.out.println(students);
        System.out.println(students.size());  //0

        // set(index number, object): the given object will replace the object at the given index number
        ArrayList<String> Avengers = new ArrayList<>();
        Avengers.add("Daniel");
        Avengers.add(1, "Lexi");
        Avengers.add(1, "Ally");   // "Sandra"
        Avengers.add("Connor");
        Avengers.add("Alex");
        Avengers.add(0, "Sam");  // [Daniel, Lexi, Ally, Connor, Alex, Sam]
        //	["Sam", "Daniel",  

        System.out.println(Avengers);

        Avengers.set(1, "Sandra"); //[Daniel, Lexi, Sandra, Connor, Alex, Sam]

        System.out.println(Avengers);


        // contains(object):  checks if the given object is contained in the ArrayList or not, and returns boolean value	
        ArrayList<String> goodGuys = new ArrayList<>();
        goodGuys.add("Alen");
        goodGuys.add("Ruth");
        goodGuys.add("Tim");
        goodGuys.add("Abraham");
        goodGuys.add("Isaac");

        boolean result = goodGuys.contains("Tim");
        System.out.println(result);

        // equals(ArrayList): checks if the two arraylist are equal or not, returns boolean value
        ArrayList<String> badGuys = new ArrayList<>();
        badGuys.add("Alen");
        badGuys.add("Ruth");
        badGuys.add("Tim");
        badGuys.add("Abraham");
        badGuys.add("Isaac");

        boolean result2 = badGuys.equals(goodGuys);  // false
        System.out.println(result2);


        if (goodGuys.contains("Abraham")) {
            System.out.println("Abraham is good guy");
        }


        // remove(int): removes that index number
        ArrayList<Integer> lists = new ArrayList<>();
        lists.add(1); // auto-boxing   index: 0
        lists.add(2); // auto-boxing   index: 1
        lists.add(3); // auto-boxing   index: 2
        lists.add(4); // auto-boxing   index: 3
        lists.add(5); // auto-boxing   index: 4

        lists.remove(1);  //[1, 3 , 4, 5]
        lists.remove(2);   // [1, 3, 5]
        lists.remove(1);   // [1, 5]
        System.out.println(lists);
        System.out.println(lists.size());


        // remove(Integer):	removes the first matching object, 	at the same time returns boolean value

        ArrayList<Integer> lists2 = new ArrayList<>();
        lists2.add(1); // auto-boxing   index: 0
        lists2.add(2); // auto-boxing   index: 1
        lists2.add(3); // auto-boxing   index: 2
        lists2.add(4); // auto-boxing   index: 3
        lists2.add(5); // auto-boxing   index: 4

        // [1, 2, 3, 4, 5]
        Integer a = 8;
        boolean r1 = lists2.remove(a);  // [2, 3, 4, 5]

        System.out.println(lists2);
        System.out.println(r1);


        ArrayList<String> city = new ArrayList<>();
        city.add("Miami");
        city.add("Miami");
        city.add("Gotham");
        city.add("Azarbaijan");
        city.add("Istanbul");
        city.add("Urumqi");    // [Miami, Miami, Gotham, Azarbaijan, Istanbul, "Urumqi]

        //	city.remove("Miami");  // [Miami, Gotham, Azarbaijan, Istanbul, "Urumqi]

        if (city.remove("Miami")) {  // [Miami, Gotham, Azarbaijan, Istanbul, "Urumqi]
            city.remove(2);  // [Miami, Gotham, Istanbul, "Urumqi"]
        }

        city.add(3, "Azarbaijan"); // [Miami, Gotham, Istanbul, Azarbaijan,"Urumqi"]
        System.out.println(city);


        ArrayList<Integer> price = new ArrayList<>();
        price.add(1);// auto
        price.add(2);
        price.add(3);
        price.add(4);
        price.add(5);

        price.remove(Integer.parseInt("2"));  // parse method returns primitive,
        System.out.println(price);  // [1, 2, 4, 5]

        boolean r3 = price.remove(Integer.valueOf("3"));  // valueOf method returns wrapper class,
        System.out.println(price);
        System.out.println(r3);


    }


}
