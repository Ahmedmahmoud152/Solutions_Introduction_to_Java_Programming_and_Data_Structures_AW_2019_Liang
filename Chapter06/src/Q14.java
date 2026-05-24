import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int n = input.nextInt();
        estimatePI(n);
    }
    public static void estimatePI(int n) {
        double sum = 0;
        System.out.println("i \t\t\t m(i)");
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(-1,i+1) /(i*2-1);
            System.out.printf("%-4d \t\t\t %.4f \n",i,4*sum);
        }
}}
