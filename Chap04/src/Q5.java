import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of sides: ");
        double n = sc.nextDouble();
        System.out.println("Enter the side: ");
        double s = sc.nextDouble();

        double Area= (n*Math.pow(s,2)/(4*Math.tan(Math.PI/n)));
        System.out.println("The area of the polygon is "+ Area);

    }
}
