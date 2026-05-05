import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        System.out.println("Enter a decimal value (0 to 15):");
        Scanner sc = new Scanner(System.in);
        int dec =sc.nextInt();
         if (dec<=15){
             if (dec <= 9) {
                 System.out.println(dec);
             }
             else {
                 System.out.println((char)(dec-10+65));
             }
         }
         else{
             System.out.println("Invalid decimal value");
         }
    }
}
