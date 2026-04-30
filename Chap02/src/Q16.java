import java.util.Scanner;

public class Q16 {
    //2.16 (Geometry: area of a hexagon) Write a program that prompts the user to enter the
    //side of a hexagon and displays its area. The formula for computing the area of a
    //hexagon is
    //Area = (3*(3)^1/2 *s^2)/2
    public static void main(String[] args) {
        System.out.print("Enter the length of the side: ");
        Scanner sc = new Scanner(System.in);
        double length = sc.nextDouble();
        double area =(3*Math.sqrt(3)*Math.pow(length, 2))/2;
        System.out.println("\nThe area of the hexagon is "+area);
    }
}
