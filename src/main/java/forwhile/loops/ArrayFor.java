package forwhile.loops;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayFor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        String products[] = { "Pencil", "Eraser", "Pen", "Sketchbook" };

        for(int x = 0; x < products.length; x++) {

            System.out.println("We have " + products[x] + " in stock." + "\n");

            for(String product : products) {
                System.out.println(product);
            }}

        String[] basket = new String[] { "Apple", "Grape", "Lemon", "Starfruit" };
        double[] fruitsPrices = { 1.25, 2.50, 3.50, 2.40 };
        System.out.println("\nWe have those fruits right now in the basket: ");
        Arrays.stream(basket).forEach(System.out::println);

        int chooseFromBasket;

        System.out.print("\nWhich one do you want? The options are 1, 2, 3 and 4 respectively: ");
        chooseFromBasket = in.nextInt();

        switch (chooseFromBasket) {
            case 1: {
                System.out.println("You've choose " + basket[0]);
                break;
            }
            case 2: {
                System.out.println("You've choose " + basket[1]);
                break;
            }
            case 3: {
                System.out.println("You've choose " + basket[2]);
                break;
            }
            case 4: {
                System.out.println("You've choose " + basket[3]);
                break;
            }
        }
        for(double prices = 0; prices < fruitsPrices.length; prices++); {
            System.out.println(fruitsPrices);
        }
    }
}
