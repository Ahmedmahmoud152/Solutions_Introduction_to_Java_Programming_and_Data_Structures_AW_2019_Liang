import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberPerLine = input.nextInt();
        sumSeries(numberPerLine);
    }
    public static void sumSeries(int n) {
        double sum = 0;
        System.out.println("i \t\t\t m(i)");
        for (int i = 1; i <= n; i++) {
            sum += (double) i /(i+1);
            System.out.printf("%-2d \t\t\t %.4f \n",i,sum);
        }
    }
}
