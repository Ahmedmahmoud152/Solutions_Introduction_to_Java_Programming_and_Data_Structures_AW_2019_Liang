import java.util.Scanner;

public class Q4 {
//(Convert pounds into kilograms) Write a program that converts pounds into ki
//lograms. The program prompts the user to enter a number in pounds, converts it
//to kilograms, and displays the result. One pound is 0.454 kilogram
    public static void main(String[] args) {
        System.out.print("Enter a number in pounds: ");
        Scanner sc = new Scanner(System.in);
        double pounds = sc.nextDouble();
        double kilograms = pounds * 0.454;
        System.out.println();
        System.out.println(pounds + " pounds is " + kilograms + " kilograms");

    }
}
