import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        long number = input.nextLong();
        System.out.println(sqrt(number));
    }

    public static double sqrt(long n) {
        double lastGuess = 1;
        double nextGuess = (lastGuess + (n / lastGuess)) / 2;
        while (Math.abs(lastGuess - nextGuess) > 0.0001) {
            double temp = nextGuess;
            lastGuess = temp;
            nextGuess = (lastGuess + (n / lastGuess)) / 2;
        }
        return nextGuess;
    }
}
