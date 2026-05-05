import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String str = input.next();

        char ch = str.charAt(0);

        if (Character.isLetter(ch)) {
            ch = Character.toUpperCase(ch);

            int number;

            if (ch >= 'A' && ch <= 'C')
                number = 2;
            else if (ch >= 'D' && ch <= 'F')
                number = 3;
            else if (ch >= 'G' && ch <= 'I')
                number = 4;
            else if (ch >= 'J' && ch <= 'L')
                number = 5;
            else if (ch >= 'M' && ch <= 'O')
                number = 6;
            else if (ch >= 'P' && ch <= 'S')
                number = 7;
            else if (ch >= 'T' && ch <= 'V')
                number = 8;
            else
                number = 9;

            System.out.println("The corresponding number is " + number);
        } else {
            System.out.println(ch + " is an invalid input");
        }
    }
}
