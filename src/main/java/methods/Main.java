package methods;

public class Main {

    public static void main(String[] args) {

//        Calculator
        System.out.println("\nCalculator Exercise:");
        Calculator.getSum(5, 9);
        Calculator.getSubt(28.6, 4.87);
        Calculator.getMult(7.689, 6.58);
        Calculator.getDivide(16, 8);

//        Time of day messages
        System.out.println("\nMessage Exercise:");
        TimeClock.getMessage(9);
        TimeClock.getMessage(14);
        TimeClock.getMessage(23);

//        Loan
        System.out.println("\nLoan Exercise:");
        Loan.loanCalc(1000, 2);
        Loan.loanCalc(1000, 3);
        Loan.loanCalc(1000, 45);

    }
}
