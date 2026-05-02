import java.util.Scanner;

// idea slope of
public class Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a point’s x- and y-coordinates:");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

       if ((x>=0 && y>=0)&&(100-(1.0/2.0)*x>=y)) {
           System.out.println("The point is in the triangle");
       }
       else {
           System.out.println("The point is not in the triangle");
       }
    }
}
