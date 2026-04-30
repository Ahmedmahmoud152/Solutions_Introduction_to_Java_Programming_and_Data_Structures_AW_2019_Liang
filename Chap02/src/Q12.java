import java.util.Scanner;

public class Q12 {
    //(Physics: finding runway length) Given an airplane’s acceleration a and take-off
    //speed v, you can compute the minimum runway length needed for an airplane to
    //take off using the following formula:
    //length = v2
    //2a
    //Write a program that prompts the user to enter v in meters/second (m/s) and
    //the acceleration a in meters/second squared (m/s2), then, displays the minimum
    //runway length
    public static void main(String[] args) {
        System.out.println("Enter speed and acceleration:");
        Scanner sc = new Scanner(System.in);
        double speed = sc.nextDouble();
        double acceleration = sc.nextDouble();
        double length = (Math.pow(speed,2))/(2*acceleration);
        System.out.println("The minimum runway length for this airplane is "+length);
    }
}
