import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        System.out.println("Enter a, b, c: ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (Math.pow(b, 2) - 4 * a * c > 0) {
            System.out.println("The equation has two roots " +
                    (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a) + " and " +
                    (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a));
        } else if (Math.pow(b, 2) - 4 * a * c < 0) {
            System.out.println("The equation has no real roots");
        } else {
            System.out.println("The equation has one root " + -b / 2 * a);
        }
    }
}
