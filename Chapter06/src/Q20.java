import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String word = input.nextLine();
        System.out.println("The number of characters in the word is: " + countLetters(word));
    }
    public static int countLetters(String s){
        s=s.replaceAll(" ", "");
        return s.length();
    }
}
