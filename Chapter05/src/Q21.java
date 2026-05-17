import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Loan Amount: ");
        double loanAmount = sc.nextDouble();
        System.out.println("Number of Years: ");
        int numberOfYears = sc.nextInt();
        System.out.print("Interest Rate    Monthly Payment    Total Payment");
        System.out.println();
        double annualInterestRate = 5;


        while (annualInterestRate <= 8) {
            double monthlyInterestRate = annualInterestRate / 1200;
            double monthlyPayment = loanAmount * monthlyInterestRate / (1
                    - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
            double totalPayment = monthlyPayment * numberOfYears * 12;
            System.out.printf("%.3f            %.2f             %.2f \n", annualInterestRate, monthlyPayment, totalPayment);

            annualInterestRate += (1.0 / 8.0);
        }
    }
}
