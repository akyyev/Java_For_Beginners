package Beginner.day30_WrapperClass_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<String> nameList = new ArrayList<>();

        // add method:
        nameList.add("Joel");
        nameList.add("Apple");

        System.out.println(nameList);
		
		
		/*
		  create an Arraylist called studentNames
		  create scanner object called scan
		 */

        Scanner scan = new Scanner(System.in);
        ArrayList<String> studentNames = new ArrayList<>();


        while (true) {
            System.out.println("Enter a name");
            String name = scan.nextLine();
            studentNames.add(name);

            System.out.println("do you want to add another name");
            String answer = scan.nextLine().toLowerCase();

            if (!(answer.equals("yes") || answer.equals("no"))) {
                System.out.println("Invalid");
                break;
            }

            if (answer.equals("no")) {
                break;
            }

        }

        System.out.println(studentNames);


    }

}
