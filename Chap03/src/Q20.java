import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F:");
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();
        System.out.println("Enter the wind speed (>= 2) in miles per hour:");
        double windSpeed = sc.nextDouble();
        if (temp >= -58 && temp <= 41 &&windSpeed>=2) {
        double twc=35.74+0.6215*temp-35.75*Math.pow(windSpeed,0.16)+0.4275*temp*Math.pow(windSpeed,0.16);
        System.out.print("The wind chill index is" + twc);}
        else {
            System.out.print("The wind speed  invalid");
        }
    }

}
