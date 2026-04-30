import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the driving distance: ");
        double drivingDistance = sc.nextDouble();
        System.out.println("Enter miles per gallon:");
        double milesPerGallon = sc.nextDouble();
        System.out.println("Enter price per gallon:");
        double pricePerGallon = sc.nextDouble();
        double cost=(drivingDistance/milesPerGallon) * pricePerGallon;
        System.out.println("The cost of driving is $"+cost);
    }
}
