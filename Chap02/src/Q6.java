import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {
        System.out.println("Enter a number between 0 and 1000:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum=0;
        sum=num%10;
        num=num/10;
        sum=sum+num%10;
        num=num/10;
        sum=sum+num%10;
        System.out.println("The sum of the digits is "+sum);
    }
}
