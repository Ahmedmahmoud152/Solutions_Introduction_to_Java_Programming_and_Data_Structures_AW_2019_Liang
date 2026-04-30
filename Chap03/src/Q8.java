import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b && a>c && b>c){System.out.println( c+"<"+b+"<"+a);}
        if(a>b && a>c && c>b){System.out.println( b+"<"+c+"<"+a);}
        if(b>a && b>c && a>c){System.out.println( c+"<"+a+"<"+b);}
        if(b>a && b>c && c>a){System.out.println( a+"<"+c+"<"+b);}
        if(c>a && c>b && a>b){System.out.println( b+"<"+a+"<"+c);}
        if(c>a && c>b && b>a){System.out.println( a+"<"+b+"<"+c);}
    }
}
