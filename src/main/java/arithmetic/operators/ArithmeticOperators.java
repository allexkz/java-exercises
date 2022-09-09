package arithmetic.operators;
import java.util.Scanner;

public class ArithmeticOperators {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int test1 = 1;
        int test2 = 85;
        float test3 = 1.48f;
        float test4 = 1.85f;
        long test5 = 10784L;
        long test6 = 13586L;
        double test7 = 1.87d ;
        double test8 = 1.95d ;

//        operators; + , ++ , - , -- , ! (logical operator, inverts boolean value)
        ++test1; // test1 = test1 + 1
        System.out.println(test1);
        test1++; // increments +1 in new 'test1' value of 2
        System.out.println(test1);

        --test1;
        System.out.println(test1);
        test1--;
        System.out.println(test1);

        System.out.println("\n");

        int kekp = 5;
        ++kekp;
        kekp += 1;
        System.out.println(kekp);

        System.out.println("\n");

        boolean test9 = false;
        System.out.println(test9);
        System.out.println(!test9); // "!" operator inverts the boolean value


        System.out.println("How many apples do you have?");
        int applesQty = read.nextInt();
        ++applesQty;
        System.out.println("You sister give you 1 more apple, so now you have: " + applesQty);
        System.out.println("You left to buy more, how much do you buy?");
        int applesMore = read.nextInt();
        applesQty += applesMore;

        System.out.println("Now you have " + applesQty + " apples left to eat!");
    }
}
