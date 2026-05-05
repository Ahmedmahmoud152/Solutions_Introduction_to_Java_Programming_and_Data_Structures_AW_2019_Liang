import java.util.Scanner;

public class Q33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight and price for package 1:");
        double w1 = sc.nextDouble();
        double p1 = sc.nextDouble();
        System.out.println("Enter weight and price for class 2:");
        double w2 = sc.nextDouble();
        double p2 = sc.nextDouble();
        if((w1/p1)>(w2/p2)){
            System.out.println("Package 1 has a better price.");
        }
        else if ((w1/p1)<(w2/p2)) {
            System.out.println("Package 2 has a better price.");
        }
        else {
            System.out.println("Two packages have the same price");
        }
    }
}
