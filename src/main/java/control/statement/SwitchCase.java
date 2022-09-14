package control.statement;
import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int option;
        System.out.println("1 - Eggs and Bacon" + "\n2 - Biscuits" + "\n3 - Waffles");
        System.out.print("Which option do you want for breakfast today: ");
        option = in.nextInt();

        switch(option) {
            case 1:{
                System.out.println("You have choose Eggs and Bacon!");
                break;
            }
            case 2:{
                System.out.println("You have choose Biscuits!");
                break;
            }
            case 3:{
                System.out.println("You have choose Waffles!");
                break;
            }
            default:
                System.out.println("Please choose a valid option.");
        }
    }
}
