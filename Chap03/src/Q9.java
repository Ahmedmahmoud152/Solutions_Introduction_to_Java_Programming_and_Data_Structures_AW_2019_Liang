import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        System.out.println("Enter the first 9 digits of an ISBN as integer:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1=num;
        int reminder = num % 10;
        int checkSum = reminder * 9;
        num = num / 10;
        reminder = num % 10;
        checkSum += reminder*8;
        num = num / 10;
        reminder = num % 10;
        checkSum += reminder*7;
        num = num / 10;
        reminder = num % 10;
        checkSum += reminder*6;
        num = num / 10;
        reminder = num % 10;
        checkSum += reminder*5;
        num = num / 10;
        reminder = num % 10;
        checkSum += reminder*4;
        num = num / 10;
        reminder = num % 10;
        checkSum += reminder*3;
        num = num / 10;
        reminder = num % 10;
        checkSum += reminder*2;
        num = num / 10;
        reminder = num % 10;
        checkSum += reminder*1;
        if (checkSum%11 == 10){
            System.out.println("The ISBN-10 number is 0"+num1+"X");
        }else {System.out.println("The ISBN-10 number is 0"+num1+""+(checkSum%11));}




    }
}
