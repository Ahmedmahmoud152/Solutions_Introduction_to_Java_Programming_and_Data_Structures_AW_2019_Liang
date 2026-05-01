import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a point with two coordinates:");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        if (Math.sqrt(Math.pow(x,2)+Math.pow(y,2)) <= 10)
            System.out.println("Point ( "+x+" ,"+  y+" ) is in the circle");
        else System.out.println("Point ( "+x+" ,"+  y+" ) is not in the circle");
    }
}
