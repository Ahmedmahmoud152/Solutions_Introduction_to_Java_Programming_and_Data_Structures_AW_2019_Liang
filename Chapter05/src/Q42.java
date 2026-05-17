import java.util.Scanner;

public class Q42 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter commission sought: ");
        double target = input.nextDouble();

        double baseSalary = 5000;

        for (int sales = 0; ; sales++) {

            double commission = 0;

            if (sales <= 5000) {
                commission = sales * 0.08;
            }
            else if (sales <= 10000) {
                commission = 5000 * 0.08
                        + (sales - 5000) * 0.10;
            }
            else {
                commission = 5000 * 0.08
                        + 5000 * 0.10
                        + (sales - 10000) * 0.12;
            }

            double income = baseSalary + commission;

            if (income >= target) {
                System.out.println("Minimum sales = " + sales);
                break;
            }
        }
    }
}
