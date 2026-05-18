import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
           System.out.println("Enter an integer: ");
           int num = input.nextInt();
        System.out.println("The "+num+" is Palindrome: "+isPalindrome(num));
    }
    public static int reverse(int number){
        int reversedNumber = 0;
        while (number != 0){
            reversedNumber = reversedNumber * 10 + number % 10;
            number = number / 10;
        }
        return reversedNumber;
    }
    public static boolean isPalindrome(int number) {
       return number==reverse(number);
    }
}
