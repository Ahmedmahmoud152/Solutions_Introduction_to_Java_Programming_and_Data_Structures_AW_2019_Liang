import java.util.Scanner;

public class Q7 {
    //(Find the number of years) Write a program that prompts the user to enter the
    //minutes (e.g., 1 billion), and displays the maximum number of years and remain
    //ing days for the minutes. For simplicity, assume that a year has 365 days.
    public static void main(String[] args) {
        System.out.print("Enter the number of minutes:");
        Scanner sc = new Scanner(System.in);
        int minutes = sc.nextInt();
        int years=minutes/(60*24*365);
        int days=(minutes%(60*24*365))/(60*24);
        System.out.println();
        System.out.println(minutes+" minutes is approximately "+ years +" years and "+days+ " days.");
    }
}
