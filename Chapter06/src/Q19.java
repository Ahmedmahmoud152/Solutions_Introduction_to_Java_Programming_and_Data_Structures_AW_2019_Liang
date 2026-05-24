import java.util.Scanner;

public class Q19 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter side1: ");
        int side1 = input.nextInt();
        System.out.println("Enter side2: ");
        int side2 = input.nextInt();
        System.out.println("Enter side3: ");
        int side3 = input.nextInt();
        if (!isValid(side1, side2, side3)) {
            System.out.println("Invalid Sides");
        } else {
            System.out.println(" The Area: " + area(side1, side2, side3));
        }
    }

    public static boolean isValid(
            double side1, double side2, double side3) {
        if ((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1)) {
            return true;
        }
        return false;
    }

    public static double area(
            double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
