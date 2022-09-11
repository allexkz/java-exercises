package methods;

public class Calculator {

    public static void getSum(double number1, double number2) {

        double result = number1 + number2;
        System.out.println("The result of your sum: " + number1 + " + " + number2 + " = " + result);
    }

    public static void getSubt(double number1, double number2) {

        double result = number1 - number2;
        System.out.println("The result of your subtract: " + number1 + " + " + number2 + " = " + result);
    }

    public static void getMult(double number1, double number2) {

        double result = number1 * number2;
        System.out.println("The result of your multiply: " + number1 + " + " + number2 + " = " + result);
    }

    public static void getDivide(double number1, double number2) {

        double result = number1 / number2;
        System.out.println("The result of your divide: " + number1 + " + " + number2 + " = " + result);
    }
}
