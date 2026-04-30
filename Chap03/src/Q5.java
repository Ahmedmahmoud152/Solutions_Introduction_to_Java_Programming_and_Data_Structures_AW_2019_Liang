import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        System.out.println("Enter today’s day: ");
        Scanner sc = new Scanner(System.in);
        int today = sc.nextInt();
        System.out.println("Enter the number of days elapsed since today: ");
        int elapsed = sc.nextInt();
        System.out.print("Today is ");
        switch (today) {
            case 0: System.out.print("Sunday");break;
            case 1: System.out.print("Monday");break;
            case 2: System.out.print("Tuesday");break;
            case 3: System.out.print("Wednesday");break;
            case 4: System.out.print("Thursday");break;
            case 5: System.out.print("Friday");break;
            case 6: System.out.print("Saturday");break;
        }
        System.out.print(" and the future day is ");
        switch (today+elapsed%7) {
                case 0: System.out.print("Sunday");break;
                case 1: System.out.print("Monday");break;
                case 2: System.out.print("Tuesday");break;
                case 3: System.out.print("Wednesday");break;
                case 4: System.out.print("Thursday");break;
                case 5: System.out.print("Friday");break;
                case 6: System.out.print("Saturday");break;
        }
    }
}
