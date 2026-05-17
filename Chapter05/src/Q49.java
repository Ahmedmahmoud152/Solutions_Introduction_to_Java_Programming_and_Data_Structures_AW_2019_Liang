import java.util.Scanner;

public class Q49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        int vowels = 0;
        int consonants = 0;
        str=str.toLowerCase();
        str=str.replace(" ", "");
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') vowels++;
            else consonants++;
        }

        System.out.println("The number of vowels is "+vowels);
        System.out.println("The number of vowels is "+consonants);
    }
}
