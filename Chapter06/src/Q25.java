import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the time by milliseconds: ");
        long milliseconds = input.nextLong();
        System.out.println("The time by miliseconds is " + convertMillis(milliseconds));
    }

    public static String convertMillis(long millis) {
        long time = millis / 1000;
        long seconds = time % 60;
        time /= 60;
        long minutes = time % 60;
        time /= 60;
        long hours = time;
        return String.format("%1d:%1d:%1d", hours, minutes, seconds);
    }
}
