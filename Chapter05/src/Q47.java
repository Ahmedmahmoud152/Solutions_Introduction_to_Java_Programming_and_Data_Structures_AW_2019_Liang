import java.util.Scanner;

public class Q47 {
    public static void main(String[] args) {
        System.out.println("Enter the first 12 digits of an ISBN-13 as a string: ");
        Scanner input = new Scanner(System.in);
        String ISBN = input.nextLine();
        int sum = 0;
        if (ISBN.length() != 12) {
            System.out.println("Invalid ISBN number");
        } else {
            for (int i = 1; i <= 12; i++) {
                int c = ISBN.charAt(i - 1) - 48;
                if (i % 2 == 0) {
                    sum += 3 * c;
                } else {
                    sum += c;
                }
            }
            sum = 10 - (sum % 10);
            if ((sum == 10)) {
                System.out.println("ISBN number is " + ISBN + "0");
            } else {
                System.out.println(ISBN + "is an invalid input");
            }
        }
    }
}
