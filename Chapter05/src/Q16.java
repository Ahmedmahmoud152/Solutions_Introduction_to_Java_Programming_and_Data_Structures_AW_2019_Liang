import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int divisor = 2;
        if (N <= 0) {
            System.out.println(0);
        }
        while (N != 1) {
            if (N/divisor==1){
                System.out.print(N+".");
                break;
            }
            if(N % divisor == 0) {
                System.out.print(divisor+", ");
                N /= divisor;
            }
            else {
                divisor++;
            }
        }
    }
}
