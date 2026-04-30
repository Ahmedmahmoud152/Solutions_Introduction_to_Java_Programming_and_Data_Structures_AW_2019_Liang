import java.util.Scanner;

public class Q14 {
    //(Health application: computing BMI) Body Mass Index (BMI) is a measure of
    //health on weight. It can be calculated by taking your weight in kilograms and divid
    //ing, by the square of your height in meters. Write a program that prompts the user to
    //enter a weight in pounds and height in inches and displays the BMI. Note one pound
    //is 0.45359237 kilograms and one inch is 0.0254 meters
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in pounds:");
        double weight = sc.nextDouble();
        double pound=weight*0.45359237;
        System.out.println();
        System.out.print("Enter height in inches:");
        double height=sc.nextDouble();
        double inches=height*0.0254;
        System.out.println();
        double BMI=pound/Math.pow(inches,2);
        System.out.print("BMI is "+BMI);
    }
}
