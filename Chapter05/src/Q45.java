import java.util.Scanner;

public class Q45 {
    public static void main(String[] args) {
        System.out.println("Enter 10 numbers:");
        Scanner input = new Scanner(System.in);
        double sum=0;
        double sumOfSquare=0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter " + i + "th number: ");
            double num = input.nextDouble();
            sum+=num;
            sumOfSquare+=num*num;
        }
        double mean= sum/10;
        double variance=(sumOfSquare-Math.pow(sum,2)/10)/(10-1);
        double deviation=Math.sqrt(variance);
        System.out.println("The mean is "+mean);
        System.out.println("The variance is "+variance);
        System.out.println("The standard deviation is "+deviation);

    }
}
