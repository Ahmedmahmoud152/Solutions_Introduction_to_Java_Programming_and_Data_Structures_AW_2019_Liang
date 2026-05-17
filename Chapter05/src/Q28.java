import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = input.nextInt();
        System.out.println("Enter the first day");
        int first = input.nextInt();
        int dayMonth=30;
        for (int month = 1; month <= 12; month++) {
            dayMonth = switch (month) {
                case 1 -> {
                    System.out.print("January 1, " + year + " is");
                    yield 31;
                }
                case 2 -> {
                    System.out.print("February 1, " + year + " is");
                    yield ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ? 29 : 28;
                }
                case 3 -> {
                    System.out.print("March 1, " + year + " is");
                    yield 31;
                }
                case 4 -> {
                    System.out.print("April 1, " + year + " is");
                    yield 30;
                }
                case 5 -> {
                    System.out.print("May 1, " + year + " is");
                    yield 31;
                }
                case 6 -> {
                    System.out.print("June 1, " + year + " is");
                    yield 30;
                }
                case 7 -> {
                    System.out.print("July 1, " + year + " is");
                    yield 31;
                }
                case 8 -> {
                    System.out.print("August 1, " + year + " is");
                    yield 31;
                }
                case 9 -> {
                    System.out.print("September 1, " + year + " is");
                    yield 30;
                }
                case 10 -> {
                    System.out.print("October 1, " + year + " is");
                    yield 31;
                }
                case 11 -> {
                    System.out.print("November 1, " + year + " is");
                    yield 30;
                }
                case 12 -> {
                    System.out.print("December 1, " + year + " is ");
                    yield 31;
                }
                default -> dayMonth;
            };

            switch (first) {

                case 0:
                    System.out.println(" Sunday");
                    break;
                case 1:
                    System.out.println(" Monday");
                    break;

                case 2:
                    System.out.println(" Tuesday");
                    break;
                case 3:
                    System.out.println(" Wednesday");
                    break;
                case 4:
                    System.out.println(" Thursday");
                    break;
                case 5:
                    System.out.println(" Friday");
                    break;
                case 6:
                    System.out.println(" Saturday");
                    break;
            }
            first=(first +dayMonth)%7;
        }
    }
}
