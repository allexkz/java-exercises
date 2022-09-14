package control.statement;
import java.util.Scanner;

public class ControlStatement {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


//        Control Statement study

        String name;
        double balance;
        double withdrawRequest;

        System.out.print("What's your name? ");
        name = in.nextLine();

        System.out.print("How much do you have in your balance? ");
        balance = in.nextDouble();

        System.out.print("How much do you want to withdraw? ");
        withdrawRequest = in.nextDouble();

        if (withdrawRequest < balance) {
            balance = balance - withdrawRequest;
            System.out.println("Withdraw in progress...");

        } else
            System.out.println("Insufficient balance.");

        System.out.println("\n" + name + ", you have " + balance + " in your account.");

//        Compost

        int grade;
        System.out.println("\nHow much did you get in this test?");
        grade = in.nextInt();

        if(grade >= 7)
            System.out.println("Approved!");

        else if (grade >= 5 && grade < 7) //true or false condition
            System.out.println("You have one more chance!");

        else
            System.out.println("Reproved, unfortunately.");

//      -
        System.out.println("\nHow much did you get in your 2nd test? ");
        grade = in.nextInt();
        String finalResult = grade >= 7 ? "Approved!" : grade <=5 && grade < 7 ? "You have a third chance" : "Reproved, try again next year";

        System.out.println(finalResult);
    }
}
