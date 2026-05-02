import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter r1’s center x-, y-coordinates, width, and height: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double w1 = sc.nextDouble();
        double h1 = sc.nextDouble();
        System.out.println("Enter r2’s center x-, y-coordinates, width, and height: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double w2 = sc.nextDouble();
        double h2 = sc.nextDouble();

        if ((Math.abs(x2-x1)+0.5*w2<=0.5*w1)&&(Math.abs(y2-y1)+0.5*h2<=0.5*h1)){
            System.out.println("r2 is inside r1");
        }
        else if ((Math.abs(x2-x1)>0.5*w2)&&(Math.abs(y2-y1)>0.5*h2)){
            System.out.println("r2 does not overlap r1");
        }
        else if ((Math.abs(x2-x1)+0.5*w2>=0.5*w1)&&(Math.abs(y2-y1)+0.5*h2>=0.5*h1)){
            System.out.println("r2 overlaps r1");
        }


    }
}
