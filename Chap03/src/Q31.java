import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the exchange rate from dollars to RMB:");
        double rate = sc.nextDouble();
        System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa:");
        int num = sc.nextInt();
        double amount = 0;
        switch (num) {
            case 0:
                System.out.println("Enter the dollar amount:");
                amount = sc.nextDouble();
                System.out.printf("$ %.2f is %.2f yuan",amount,amount*rate);
                break;
            case 1:
                System.out.println("Enter the RMB amount");
                amount = sc.nextDouble();
                System.out.printf("%.2f yuan is $%.2f ",amount,amount/rate);
                break;
            default:
                System.out.println("CIncorrect input");

        }
    }
}
