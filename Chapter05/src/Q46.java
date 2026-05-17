import java.util.Scanner;

public class Q46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        String strRev="";
        for(int i=str.length()-1;i>=0;i--){
            strRev+=str.charAt(i);
        }
        System.out.println("The reversed string is "+strRev);
    }
}
