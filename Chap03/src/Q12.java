import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int clone = num;
        int sum = 0;
        sum=sum+(clone%10)*100;
        clone=clone/10;
        sum=sum+(clone%10)*10;
        clone=clone/10;
        sum=sum+(clone%10);
        if (sum==num){
            System.out.println(num+" is a palindrome");
        }
        else{ System.out.println(num+" is not a palindrome");}

    }
}
