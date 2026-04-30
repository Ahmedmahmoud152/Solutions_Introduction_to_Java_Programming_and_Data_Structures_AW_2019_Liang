import java.util.Scanner;

public class Q1 {
    //2.1 (Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in a
    //double value from the console, then converts it to Fahrenheit, and displays the
    //result.
    public static void main(String[] args) {


    Scanner in = new Scanner(System.in);
        System.out.println("Enter a degree in celsius: : ");
         double celsius= in.nextDouble();
         double fahrenheit= (9*celsius)/5 + 32;
         System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
}}
