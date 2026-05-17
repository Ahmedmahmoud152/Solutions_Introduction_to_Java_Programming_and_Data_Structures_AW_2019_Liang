import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = input.nextInt();
        System.out.println("Enter the first day");
        int first = input.nextInt();
        int dayMonth=30;
        int month=1;
        for ( month = 1; month <= 12; month++) {
            dayMonth= switch (month) {
                case 1 -> {
                    System.out.println("January " + year);
                    yield 31;
                }
                case 2 -> {
                    System.out.println("February " + year);
                    yield ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ? 29 : 28;
                }
                case 3 -> {
                    System.out.println("March " + year);
                    yield 31;
                }
                case 4 -> {
                    System.out.println("April " + year);
                    yield 30;
                }
                case 5 -> {
                    System.out.println("May " + year);
                    yield 31;
                }
                case 6 -> {
                    System.out.println("June " + year);
                    yield 30;
                }
                case 7 -> {
                    System.out.println("July " + year);
                    yield 31;
                }
                case 8 -> {
                    System.out.println("August " + year);
                    yield 31;
                }
                case 9 -> {
                    System.out.println("September " + year);
                    yield 30;
                }
                case 10 -> {
                    System.out.println("October " + year);
                    yield 31;
                }
                case 11 -> {
                    System.out.println("November " + year);
                    yield 30;
                }
                case 12 -> {
                    System.out.println("December " + year);
                    yield 31;
                }
                default -> month;
            };
            System.out.println("___________________________________");
            System.out.println("Sun\t\tMon\t\tTue\t\tWed\t\tThu\t\tFri\t\tSat");
            for (int i = 0; i <first ; i++) {
                System.out.print("\t\t");
            }

            for (int i = 1; i <=dayMonth; i++) {
                System.out.print(i+"\t\t");
              if ((i+first)%7==0){
                  System.out.println();}
            }
            first=dayMonth
            System.out.println();
        }
    }
}
