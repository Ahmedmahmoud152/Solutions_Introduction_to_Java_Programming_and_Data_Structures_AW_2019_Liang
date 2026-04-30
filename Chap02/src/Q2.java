import java.util.Scanner;

public class Q2 {
    //(Compute the volume of a cylinder) Write a program that reads in the radius
    //and length of a cylinder and computes the area and volume using the following
    //formulas:
    public static void main(String[] args) {
        System.out.println("Enter the radius and length of a cylinder:");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double length = sc.nextDouble();
        double area =radius*radius*Math.PI;
        double volume=area*length;
        System.out.println("The area is "+area);
        System.out.println("The Volume is "+volume);
    }
}
