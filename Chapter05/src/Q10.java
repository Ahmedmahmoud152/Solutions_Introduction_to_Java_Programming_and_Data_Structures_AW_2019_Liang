import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        int count=0;
        for (int x = 100; x <= 1000; x++){
            if (x % 5 == 0 && x % 6 == 0) {
                System.out.print(x + " ");
                count++;
            }
            if (count == 10) {
                System.out.println();
                count = 0;
            }
        }
    }
}
