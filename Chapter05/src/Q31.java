import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the initial deposit amount: ");
        double deposit = input.nextDouble();
        System.out.println("Enter annual percentage yield: ");
        double annualPercentage = input.nextDouble();
        System.out.println("Enter maturity period (number of months): ");
        double maturityPeriod = input.nextDouble();

        for(int i = 0; i < maturityPeriod; i++){
           deposit = deposit + deposit*(annualPercentage/1200);
            System.out.printf("%d \t\t\t %.2f \n",i,deposit);
        }
    }
}
