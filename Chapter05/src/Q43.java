import java.util.Scanner;

public class Q43 {
    public static void main(String[] args) {
        int sum=0;
        for(int a=0;a<=7;a++){
            for(int b=1+a;b<7;b++){
                System.out.println(b+" "+(b+1));
                sum++;
            }
        }
        System.out.println("The total number of all combinations is "+sum);
    }
}
