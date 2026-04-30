import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        System.out.println("Enter balance and interest rate (e.g., 3 for 3%): ");
        Scanner sc = new Scanner(System.in);
        int balance = sc.nextInt();
        double interestRate = sc.nextDouble();
        double interest = balance * (interestRate/1200);
        System.out.println("The interest rate is " + interest);
    }
}
