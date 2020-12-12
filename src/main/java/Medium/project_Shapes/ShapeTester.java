package Medium.project_Shapes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShapeTester {


    public static void main(String[] args) {

        System.out.println("This program calculates area, volume and perimeter of shapes\n");

        Shape obj = new Square(5);
        Shape obj2 = new Rectangle(10,20);
        Shape obj3 = new Cylinder(10,2);
        Shape obj4 = new Circle(10); // area = 314  perimeter = 62.8   volume = 0;
        Shape obj5 = new RectangularPrism(1,2,10);

        System.out.println(obj);
        System.out.println(obj2);
        System.out.println(obj3);
        System.out.println(obj4);
        System.out.println(obj5);

        List<Shape> list = new ArrayList<Shape>();
        list.add(obj5);
        list.add(obj4);
        list.add(obj3);
        list.add(obj2);

        System.out.println("----------------------");
        Collections.sort(list);
        list.forEach(System.out::println);
    }
}
