import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double edge1 = sc.nextDouble();
        double edge2 = sc.nextDouble();
        double edge3 = sc.nextDouble();
        if (((edge1+edge2)>edge3)&&((edge1+edge3)>edge2)&&((edge3+edge2)>edge1)){
            System.out.println("The perimeter of triangle is: " + (edge1+edge2+edge3));}
        else {
            System.out.println("Invalid");
        }
    }
}
