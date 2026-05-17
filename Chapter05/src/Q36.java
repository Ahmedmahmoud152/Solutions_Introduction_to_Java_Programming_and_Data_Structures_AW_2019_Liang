import java.util.Scanner;

public class Q36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first 9 digits of an ISBN as integer: ");
        String ISBN = input.nextLine();
        int sum = 0;
        if (ISBN.length() != 9) {
            System.out.println("Invalid ISBN number");
        } else {
            for (int i = 1; i <= 9; i++) {
                int c = ISBN.charAt(i - 1) - 48;
                sum += c * i;
            }
            sum = sum % 11;
            if ((sum % 10 == 0)) {
                System.out.println("ISBN number is " + ISBN + "X");
            } else {
                System.out.println("ISBN number is " + ISBN + sum);
            }
        }
    }
}
