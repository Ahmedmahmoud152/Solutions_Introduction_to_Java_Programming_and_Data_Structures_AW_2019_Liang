import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Loan Amount: ");
        double loanAmount = input.nextDouble();
        System.out.println("Number of Years: ");
        int numberOfYears = input.nextInt();
        System.out.println("Annual Interest Rate: ");
        double annualInterestRate = input.nextDouble();
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1
                - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
        System.out.println("Monthly Payment: "+ monthlyPayment);
        double totalPayment = monthlyPayment * numberOfYears * 12;
        System.out.println("Total Payment: "+ totalPayment);
        double interest,principal =0;
        double balance=loanAmount;
        System.out.println("Payment#"+ "\t\t" +"Interest"+ "\t\t" +"Principal"+ "\t\t" +" Balance");

        for (int i = 1; i <= numberOfYears * 12; i++) {
            interest = monthlyInterestRate * balance;
            principal = monthlyPayment - interest;
            balance = balance - principal;
            System.out.printf("%d    \t\t\t%.2f \t\t\t%.2f \t\t\t%.2f\n",i,interest,principal,balance);
        }

    }
}
