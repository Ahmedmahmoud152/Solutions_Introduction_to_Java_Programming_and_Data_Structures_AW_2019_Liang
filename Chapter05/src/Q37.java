import java.util.Scanner;

public class Q37 {
    public static void main(String[] args) {
        System.out.println(" Enter a decimal integer");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String binary = "";
        while(num!=0){
             binary =binary+num%2;
             num/=2;
        }
        String binaryInv = "";
        for(int i=0;i<binary.length();i++){
            binaryInv+=binary.charAt(binary.length()-i-1);
        }
        System.out.println(" Binary value: "+binaryInv);
    }
}
