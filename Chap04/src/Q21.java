import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a SSN: ");
        String ssn = sc.nextLine();
        if (ssn.matches("\\d{3}-\\d{2}-\\d{4}")) {
            System.out.println(ssn+" is a valid social security number");
        }
        else {
            System.out.println(ssn+" is not a valid social security number");
        }
    }
}
