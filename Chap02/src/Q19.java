import java.util.Scanner;

public class Q19 {

        public static void main(String[] args) {
            System.out.println("Enter the coordinates of three points separated by spaces\n" +
                    "like x1 y1 x2 y2 x3 y3:");
            Scanner in = new Scanner(System.in);
            double x1 = in.nextDouble();
            double y1 = in.nextDouble();
            double x2 = in.nextDouble();
            double y2 = in.nextDouble();
            double x3 = in.nextDouble();
            double y3 = in.nextDouble();
            double side1 =Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            double side2 =Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
            double side3 =Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
            double side =(side1 + side2 + side3)/2;
            double area =Math.sqrt(side*(side-side1)*(side-side2)*(side-side3));
            System.out.println("The area of the triangle is " + area);

        }
    }

