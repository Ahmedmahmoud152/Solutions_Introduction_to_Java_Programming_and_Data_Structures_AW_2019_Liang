import java.util.Random;
import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("guess the flip of a coin");
        int guess = sc.nextInt();
        int flip = (int) (Math.random()*2);
        if (flip == guess) {
            System.out.println("You guessed the flip of a coin");
        }
        else {
            System.out.println("You lost the flip of a coin");
        }
    }
}
