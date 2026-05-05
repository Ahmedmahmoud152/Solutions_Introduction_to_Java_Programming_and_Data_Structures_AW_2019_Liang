import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        System.out.println("Enter a character: ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        System.out.println("The Unicode for the character "+ ch +" is " + (int)(ch));
    }
}
