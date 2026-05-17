import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter monthly saving amount: ");
       double amount = input.nextDouble();
        System.out.print("Enter annual interest rate: ");
       double rate = input.nextDouble()/12/100;
        System.out.print("Enter number of months: ");
       int numOfMonths = input.nextInt();
       double sum=0;

       for (int i = 1; i <= numOfMonths; i++) {
           sum= (amount+sum)*(rate+1);
       }
       System.out.printf("The amount in savings account: %.3f", sum);
    }
}
