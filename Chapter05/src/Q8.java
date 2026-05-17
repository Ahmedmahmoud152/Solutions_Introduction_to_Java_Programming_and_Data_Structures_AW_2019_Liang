import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of Students: ");
        int num = in.nextInt();
        double score = Double.NEGATIVE_INFINITY;
        String name = "";
        for (int i = 0; i < num; i++) {
            System.out.println("Enter the name of " + (i + 1) + ": ");
            String nameInput = in.next();
            System.out.println("Enter the score of " + nameInput + ": ");
            double scoreInput = in.nextDouble();
            if (scoreInput > score) {
                score = scoreInput;
                name = nameInput;
            }
        }
        System.out.println("The student " + name + " has  highest score " + score);
    }
}
