import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a hex digit:");
        String hex = sc.nextLine();
        if (hex.length() != 1) {
            System.out.println(hex + " Invalid input");
        }
        char ch = hex.charAt(0);
        int decimal;

         if (ch >= 'A' && ch <= 'F') {
            decimal = ch - 'A' + 10;
        }
        else if (ch >= 'a' && ch <= 'f') {
            decimal = ch - 'a' + 10;
        }
        else {
            System.out.println(ch + " is an invalid input");
            return;
        }

        // تحويل لـ Binary مع 4 digits
        String binary = String.format("%4s", Integer.toBinaryString(decimal))
                .replace(' ', '0');

        System.out.println("The binary value is " + binary);
    }
}
