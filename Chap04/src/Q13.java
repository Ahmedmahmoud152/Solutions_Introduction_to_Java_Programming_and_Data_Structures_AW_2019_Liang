import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(s.length() != 1){
            System.out.println("Not a single word");
        return;
        }
        char ch = s.charAt(0);
        Character ch1 = Character.toUpperCase(ch);
        if(ch1=='A'||ch1=='E'||ch1=='I'||ch1=='O'||ch1=='U'){
            System.out.println( ch+" is a vowel");}
        else if (ch1-65>=0 && ch1-65<=26) {
            System.out.println( ch+" is a consonant");}
        else {
            System.out.println(ch + " is an invalid input");
        }

    }
}
