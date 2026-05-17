import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i*=2) {
            for (int j = n/i; j > 1; j/=2) {
                System.out.printf("   ");
            }
            for (int j = 1; j <= i; j=j*2) {
                System.out.printf("%-3d",j);
            }
            for (int j = i/2; j >=1; j/=2) {
                System.out.printf("%3d",j);
            }

            System.out.println();
        }
    }
}
