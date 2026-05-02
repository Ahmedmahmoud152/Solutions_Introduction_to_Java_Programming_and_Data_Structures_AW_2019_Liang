import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter circle1’s center x-, y-coordinates, and radius:");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double r1 = sc.nextDouble();
        System.out.println("Enter circle2’s center x-, y-coordinates, and radius:");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double r2 = sc.nextDouble();
        if(Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)) <= Math.abs(r1-r2)){
            System.out.println("circle2 is inside circle1");
        }
        else if ( Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)) <= Math.abs(r1+r2)){
            System.out.println("circle2 overlaps circle1");
        }
        else{
            System.out.println("circle2 does not overlap circle1");
        }

    }
}
