import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        System.out.println("Enter an ASCII code: ");
        Scanner sc = new Scanner(System.in);
        int ascii = sc.nextInt();
        System.out.println("The character for ASCII code"+ ascii +" is " + (char)(ascii));
    }
}
