import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the  number: ");
        int num1 = input.nextInt();
        displayPattern(num1);
    }
    public static void displayPattern(int n){
        for (int i = 1; i <= n; i++){
            for (int j = n-i; j >= 1; j--){
                System.out.print("\t");
            }
            for (int j = i; j >= 1; j--){
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
}
