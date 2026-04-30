import java.util.Scanner;

public class Q3 {
    //(Convert feet into meters) Write a program that reads a number in feet, converts it
    //to meters, and displays the result. One foot is 0.305 meter
    public static void main(String[] args) {
        System.out.println("Enter a value for feet: ");
        Scanner in = new Scanner(System.in);
        double feet = in.nextDouble();
        double meters=feet*0.305;
        System.out.println(feet+" feet is "+meters +" meters");

    }
}
