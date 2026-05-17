import java.util.Scanner;

public class Q50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        int upper=0;
        str=str.replace(" ", "");
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i)-65<=26 && str.charAt(i)-65>=0) {
                upper++;
            }
        }
        System.out.println("The number of uppercase letters is "+upper);
    }
}
