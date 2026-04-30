import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        System.out.println("Enter a, b, c, d, e, f:");
        Scanner sc = new Scanner(System.in);
       double a = sc.nextDouble();
       double b = sc.nextDouble();
       double c = sc.nextDouble();
       double d = sc.nextDouble();
       double e = sc.nextDouble();
       double f = sc.nextDouble();
       if(a*d-b*c==0){
           System.out.println("The equation has no solution");
       }
       else{
           System.out.println("x is "+(e*d -b*f)/(a*d -b*c)+" and y is "+(a*f -e*c)/(a*d -b*c));
       }
    }
}
