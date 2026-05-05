import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length from the center to a vertex:");
        double length = sc.nextDouble();
        double Area =(5*Math.pow(length,2))/(4*Math.tan(Math.PI/5));
        System.out.println("The area of the pentagon is "+Area);
    }
}
