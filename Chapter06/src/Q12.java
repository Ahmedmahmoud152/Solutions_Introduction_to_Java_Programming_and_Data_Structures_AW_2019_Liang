import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first char: ");
        char first = input.next().charAt(0);
        System.out.print("Enter the second char: ");
        char second = input.next().charAt(0);
        printChars(first,second,10);
    }
    public static void printChars(char ch1, char ch2, int numberPerLine){
        int count = 0;
        for (char ch = ch1; ch <= ch2; ch++) {
            System.out.print(ch+" ");
            count++;
            if (count == numberPerLine) {
                System.out.println();
                count = 0;
            }
        }
    }
}
