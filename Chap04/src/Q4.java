import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length from the center to a vertex:");
        double length = sc.nextDouble();
        double Area =(6*Math.pow(length,2))/(4*Math.tan(Math.PI/6));
        System.out.printf("The area of the pentagon is %.2f",Area);
    }
}
