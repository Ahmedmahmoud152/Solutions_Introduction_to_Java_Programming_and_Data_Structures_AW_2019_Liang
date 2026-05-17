import java.util.Scanner;

public class Q51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String first = input.nextLine();
        System.out.println("Enter the second string:");
        String second = input.nextLine();
        String common = "";
        int i = 0;
        int j = 0;
        while (i < first.length() && j < second.length()) {
            if (first.charAt(i) == second.charAt(j)) {
                common += first.substring(i, i + 1);
                i++;
                j++;
            } else {
                break;
            }
        }
        if (0 == common.length()) {
            System.out.println(first + " and " + second + " have no common prefix");
        } else {
            System.out.println("The common prefix is " + common);
        }

    }
}
