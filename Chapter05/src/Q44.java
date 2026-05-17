import java.util.Scanner;

public class Q44 {
    public static void main(String[] args) {
        System.out.println("Enter an integer:");
        Scanner input = new Scanner(System.in);
        short num = input.nextShort();
        String str = "";
        for (int i = 15; i >= 0; i--){
            int bit =(num>>i)&1;
            System.out.print(bit);
        }
        System.out.println();
    }
}
