import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q33 {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter format =
                DateTimeFormatter.ofPattern("MMMM dd, yyyy HH:mm:ss");

        System.out.println("Current date and time is "
                + now.format(format));
    }
}