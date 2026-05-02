import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = in.nextInt();
        boolean divisibleByFive = n % 5 == 0;
        boolean divisibleBySix = n%6 == 0;
        System.out.println("Is "+n+" divisible by 5 and 6?" +(divisibleByFive && divisibleBySix) );
        System.out.println("Is "+n+" divisible by 5 or 6?" +(divisibleByFive || divisibleBySix) );
        System.out.println("Is "+n+" divisible by 5 or 6, but not both?"+(divisibleByFive ^ divisibleBySix) );

    }
}
