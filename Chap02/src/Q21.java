import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        double amount = sc.nextDouble();
        System.out.println("Enter annual interest rate in percentage: ");
        double rate = sc.nextDouble();
        System.out.println("Enter number of years: ");
        int years = sc.nextInt();
        double futureValue = amount * Math.pow(1.0+(rate/1200),years*12);
        System.out.println("Future value is $"+futureValue);



    }
}
