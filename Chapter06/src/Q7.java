import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The amount invested: ");
        double amount = input.nextDouble();
        System.out.println("Annual interest rate: ");
        double annualInterestRate = input.nextDouble();
        System.out.println("Year \t\tFuture Value");
        for (int i = 0; i <30 ; i++) {
            System.out.printf("%2d\t\t\t %.2f%n",
                    (i + 1),
                    futureInvestmentValue(amount, annualInterestRate, (i + 1)));
        }
    }
    public static double futureInvestmentValue(double amount, double annualInterestRate,int year) {
        return  amount * Math.pow(1.0+(annualInterestRate/1200),year*12);

    }
}
