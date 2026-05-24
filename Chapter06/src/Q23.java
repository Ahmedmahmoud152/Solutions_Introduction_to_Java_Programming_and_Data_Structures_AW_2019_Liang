import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a text: ");
        String text = input.nextLine();
        System.out.println("Please enter a letter: ");
        char letter = input.next().charAt(0);
        System.out.println("The number of "+letter+" in "+text +" is "+count(text,letter));
    }
    public static int count(String str, char a){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a)
                count++;
        }
        return count;
    }
}
