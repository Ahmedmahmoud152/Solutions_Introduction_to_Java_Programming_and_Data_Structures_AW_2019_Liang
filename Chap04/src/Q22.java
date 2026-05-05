import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string s1:");
        String s1 = sc.nextLine();
        System.out.println("Enter string s2:");
        String s2 = sc.nextLine();
        if(s1.contains(s2)){
            System.out.println(s2 +" is a substring of "+s1);
        }
        else{
            System.out.println(s2 +" is not a substring of "+s1);
        }
    }
}
