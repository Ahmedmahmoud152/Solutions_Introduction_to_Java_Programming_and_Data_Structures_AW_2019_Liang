import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        int count = 0;
        for (int year = 101; year <=2100 ; year++) {
         if ( (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
             System.out.print(year + " ");
             count++;
         }
         if(count == 10){
             System.out.println();
             count=0;
         }
        }
    }
}
