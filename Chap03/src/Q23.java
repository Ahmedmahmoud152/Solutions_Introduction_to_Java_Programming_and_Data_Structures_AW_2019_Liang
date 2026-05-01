import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        if ((Math.abs(x) <= 10.0/2.0)&&(Math.abs(y) <= 5.0/2.0))
        {System.out.println("Point ( "+x+" ,"+  y+" ) is in the Rectangle");}
        else{ System.out.println("Point ( "+x+" ,"+  y+" ) is not in the Rectangle");}
    }
}
