import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        double l = 0;
        double i = 0;
        double mp = 0;
        double bal = 0;
        int trm;

        System.out.printf("Enter the loan amount: ");
        l = keyboard.nextDouble();  // The amount that you are borrowing

        System.out.printf("Enter the interest rate on the loan: ");
        i = keyboard.nextDouble();  // The interest rate on your loan

        System.out.printf("Enter the term (years) for the loan payment: ");
        trm = keyboard.nextInt();   // The term of the loan

        System.out.printf("\n======================================\n");
        keyboard.close();

        mp = processSomething(l, i, trm);
        bal = -(mp*(trm*12));
        System.out.format("%-30s$%-+10.2f%n", "Balance owed to bank: ", bal);
        System.out.format("%-30s$%-+10.2f%n", "Minimum monthly payment: ", mp);
    }

    public static double processSomething(double l, double i, int trm) {
        // calculates the monthly payment.
        // Note that the first parameter '1' is used to calculate the base
        double rate = (i/100) / 12; // monthly rate
        double base = (1 + rate);
        double months = trm* 12;    // number of months you need to make payments
        double result = 0.0;
        result = ((rate * l) / (1 - Math.pow(base, -months)));

        return result;  // Min monthly payment
    }
}
