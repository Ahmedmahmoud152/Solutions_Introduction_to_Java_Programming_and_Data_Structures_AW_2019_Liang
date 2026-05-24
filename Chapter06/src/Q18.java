import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Password: ");
        String password = input.nextLine();
        System.out.println(checkPassword(password));
    }

    public static String checkPassword(String password) {
        if (password.length() < 8) {
            return "Invalid Password";
        }
        int countNum = 0;
        int countLetter = 0;
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isDigit(password.charAt(i))&& !Character.isLetter(password.charAt(i))) {
                return "Invalid Password";
            }
            if (Character.isDigit(password.charAt(i))) {
                countNum++;
            }

            if (Character.isLetter(password.charAt(i))) {
                countLetter++;
            }

        }
        if (countNum < 2) {
            return "Invalid Password";
        }
        if (countLetter < 2) {
            return "Invalid Password";
        }

        return "Valid Password";

    }
}
