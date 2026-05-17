import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number  ");
        int n1 = in.nextInt();
        System.out.println("Enter the second number  ");
        int n2 = in.nextInt();
        if (n1 <= 0 || n2 <= 0) {
            System.out.println("Enter positive integers only");
            return;
        }
        int n3 = (n1 > n2) ? n2 : n1;
        while ((n1 % n3 != 0) || (n2 % n3 != 0)) {
            n3--;
        }
        System.out.println(n3);
    }
}
