import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        System.out.println("Enter n and displays an n-by-n matrix");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((int)(Math.random()*2)+" ");
            }
            System.out.println();
        }
    }
}
