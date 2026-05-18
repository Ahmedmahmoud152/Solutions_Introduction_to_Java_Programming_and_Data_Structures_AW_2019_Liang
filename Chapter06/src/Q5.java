import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
              Scanner input = new Scanner(System.in);
              System.out.println("Enter a number1: ");
              double number1 = input.nextDouble();
              System.out.println("Enter a number2: ");
              double number2 = input.nextDouble();
              System.out.println("Enter a number3: ");
              double number3 = input.nextDouble();
               displaySortedNumbers(number1,number2,number3);
    }

    public static void displaySortedNumbers(
            double num1, double num2, double num3) {
        if (num1 >= num2 && num1 >= num3 && num2 >= num3) {
            System.out.println("The sorted number are " + num3 + ", " + num2 + ", " + num1);
        }
        else if (num1 >= num2 && num1 >= num3 && num3 >= num2) {
            System.out.println("The sorted number are " + num2 + ", " + num3 + ", " + num1);
        } else if (num2 >= num1 && num2 >= num3 && num1 >= num3) {
            System.out.println("The sorted number are " + num3 + ", " + num1 + ", " + num2);

        }
        else if (num2 >= num1 && num2 >= num3 && num3 >= num1) {
            System.out.println("The sorted number are " + num1 + ", " + num3 + ", " + num2);

        }
        else if (num3 >= num1 && num3 >= num2 && num2 >= num1) {
            System.out.println("The sorted number are " + num1 + ", " + num2 + ", " + num3);

        }
        else if (num3 >= num1 && num3 >= num2 && num1 >= num2) {
            System.out.println("The sorted number are " + num2 + ", " + num1 + ", " + num3);

        }

    }
}
