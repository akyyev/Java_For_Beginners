package Beginner.day03_Variables;

public class println_vs_print {
    
    // the only characters we can give for any name is: _ and $
    
    public static void main(String[] args) {
        System.out.println("Hello Learner");  // prints from a new line
        System.out.println("School");

        System.out.println("===========================");

        System.out.print("Hello Learner");
        System.out.print("School");
        // printing takes place from where it's left off
        System.out.println();

        System.out.println("===========================");

        System.out.println("Today is ");
        System.out.print("great day ");

    }


}