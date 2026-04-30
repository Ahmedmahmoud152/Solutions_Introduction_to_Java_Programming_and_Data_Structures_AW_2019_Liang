import java.util.Scanner;

public class Q9 {
    //(Physics: acceleration) Average acceleration is defined as the change of velocity
    //divided by the time taken to make the change, as given by the following formula:
    //a = (v1- v0)/t
    //Write a program that prompts the user to enter the starting velocity v0 in meters/
    //second, the ending velocity v1 in meters/second, and the time span t in seconds,
    //then displays the average acceleration.
    public static void main(String[] args) {
        System.out.print("Enter v0, v1, and t:");
        Scanner in = new Scanner(System.in);

        double v0 = in.nextDouble();
        double v1 = in.nextDouble();
        double t = in.nextDouble();
        double acc = Math.abs(v1 -v0) / t;
        System.out.println("The average acceleration is " + acc);

    }
}
