package methods;

public class Loan {

    public static double getTwoInstallments() {

        return 0.3;
    }

    public static double getThreeInstallments() {

        return 0.45;
    }

    public static void loanCalc(double value, int parcel) {

        if (parcel == 2) {

            double finalValue = value + (value * getTwoInstallments());

            System.out.println("The value for two-time payment is: R$ " + finalValue);
        } else if (parcel == 3) {

            double finalValue = value + (value * getThreeInstallments());

            System.out.println("The value for three-time payment is: R$ " + finalValue);
        } else {
            System.out.println("Invalid value.");
        }

    }
}
