import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        System.out.println("Enter two characters: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int num = Integer.parseInt(s.substring(1));
        if (s.charAt(0) != 'M' && s.charAt(0) != 'C' && s.charAt(0) != 'I') {
            System.out.println("Invalid input");
        } else if (num > 4) {
            System.out.println("Invalid input");
        } else {
            switch (s.charAt(0)) {
                case 'M':
                    System.out.print("Mathematics ");
                    break;
                case 'C':
                    System.out.print("Computer Science ");
                    break;
                case 'I':
                    System.out.print("Informatics ");
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
            switch (s.charAt(1)) {
                case '1':
                    System.out.print("Freshman");
                    break;
                case '2':
                    System.out.print("Sophomore");
                    break;
                case '3':
                    System.out.print("Junior");
                    break;
                case '4':
                    System.out.print("Senior");
                    break;
            }
        }
    }
}
