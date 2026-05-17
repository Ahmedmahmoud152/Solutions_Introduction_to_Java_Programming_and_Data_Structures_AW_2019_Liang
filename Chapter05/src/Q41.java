import java.util.Scanner;

public class Q41 {
    public static void main(String[] args) {
        int count = 0;
        int max = Integer.MIN_VALUE;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a numbers: ");
        while (true) {
            int num = input.nextInt();
            if (num == 0) break;
            if(num > max){
                max = num;
                count=0;
            }
            if (num==max){
                count++;
            }

        }
        if (max == Integer.MIN_VALUE) {
            System.out.println("Invalid input");
        }
        else {
            System.out.println("The largest number is "+max);
            System.out.println("The occurrence count of the largest number is "+count);
        }
    }
}
