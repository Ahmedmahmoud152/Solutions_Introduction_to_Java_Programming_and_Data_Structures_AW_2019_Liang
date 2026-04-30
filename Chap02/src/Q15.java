import java.util.Scanner;

public class Q15 {
    //(Geometry: distance of two points) Write a program that prompts the user to
    //enter two points (x1, y1) and (x2, y2) and displays their distance.
    //The formula for computing the distance is 2(x2- x1)2 + (y2- y1)2. Note you can use
    //Math.pow(a, 0.5) to compute a^1/2
    public static void main(String[] args) {
        System.out.println("Enter x1 and y1:");
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.println("Enter x2 and y2:");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double distance =Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.println("The distance between the two points is "+distance);
    }

}
