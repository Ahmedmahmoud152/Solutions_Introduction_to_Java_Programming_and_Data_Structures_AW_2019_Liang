import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        System.out.println("Enter an integer, the input ends if it is 0:");
        Scanner sc = new Scanner(System.in);
        int a = 1;
        double count = 0;
        int numberOfPositives = 0;
        int numberOfNegatives = 0;
        double sum = 0;
        while (a != 0) {
            a = sc.nextInt();
            if (a == 0) {
                break;
            }
            if (a > 0) {
                numberOfPositives++;
            }
            if (a < 0) {
                numberOfNegatives++;
            }
            sum += a;
            count++;
        }
        if (count == 0) {
            System.out.println("No numbers are entered except 0");
        } else {
            System.out.println("The number of positives is " + numberOfPositives);
            System.out.println("The number of negatives is " + numberOfNegatives);
            System.out.println("The total is " + sum);
            System.out.println("The average is " + (sum / count));
        }
    }
}
