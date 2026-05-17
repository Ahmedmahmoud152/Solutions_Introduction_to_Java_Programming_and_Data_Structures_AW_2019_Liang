import java.util.Scanner;

public class Q48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        String oddChars="";
        for(int i=0;i<str.length();i++){
            if(i%2==0){
                oddChars+=str.charAt(i);
            }
        }
        System.out.println("The odd characters are: "+oddChars);
    }
}
