import java.util.Scanner;

public class Q37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = input.nextInt();
        System.out.println("Enter the width: ");
        int width = input.nextInt();
        System.out.println(format(n,width));
    }
    public static String format(int number, int width){
        String result = "";
        String numberString = ""+number;
        for(int i = 0 ; i<width-numberString.length() ; i++){
            result = result + "0";
        }
        result = result + number;
        return result;
    }
}
