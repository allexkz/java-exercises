package overloading;
import org.w3c.dom.ls.LSOutput;

import java.lang.Math;

public class Calculus {

    static void getArea (int sides) {

        double pow2 = 2;
        double squareArea = Math.pow(sides, pow2);
        System.out.println("The area of this square is: " + squareArea);

    }

    static void getArea(float height, float length) {

        double rectangleArea = height * length;
        System.out.println("The area of your rectangle is: " + rectangleArea);

    }

    static void getArea(double bigBase, double smallBase, double height) {

        double trapezoidArea = ((bigBase + smallBase) * height) / 2;
        System.out.println("The area of your rectangle is: " + ((bigBase + smallBase) * height) / 2);

    }
}
