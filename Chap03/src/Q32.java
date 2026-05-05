import java.util.Scanner;

public class Q32 {
    public static void main(String[] args) {
        System.out.println("Enter three points for p0, p1, and p2:");
        Scanner sc = new Scanner(System.in);
        double x0 = sc.nextDouble();
        double y0 = sc.nextDouble();
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        if ((x1- x0)*(y2- y0)- (x2- x0)*(y1- y0)>0){
            System.out.println("p2 is on the left side of the line");
        }
        else if ((x1- x0)*(y2- y0)- (x2- x0)*(y1- y0)<0) {
            System.out.println("p2 is on the right side of the line");
        }
        else {
            System.out.println(" p2 is on the same line");
        }
    }
}
