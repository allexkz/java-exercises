package overloading;

public class Overloading {

    public static void main(String[] args) {

//        Square Area Calculus
        System.out.println("\nSquare Area Calculation: ");
        Calculus.getArea(5);
        Calculus.getArea(18);
        Calculus.getArea(45);

//        Rectangle Area Calculus
        System.out.println("\nRetangle Area Calculation: ");
        Calculus.getArea(1.2f, 4.2f);
        Calculus.getArea(3.5f, 4.2f);
        Calculus.getArea(1.7f, 4.2f);

//        Trapezoid Area Calculus
        System.out.println("\nTrapezoid Area Calculation: ");
        Calculus.getArea(5.2d, 3.4d, 4d);
        Calculus.getArea(3.4d, 5.7d, 4d);
        Calculus.getArea(3.7d, 5.1d, 4d);
    }
}
