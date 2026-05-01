import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year: (e.g., 2012): ");
        int year = sc.nextInt();
        System.out.println("Enter month: (e.g., 12): ");
        int month = sc.nextInt();
        if (month==1||month==2){month=month+12;year--;}

        System.out.println("Enter the day of the month: ");
        int day = sc.nextInt();

        int  j =year/100;
        int k=year%100;
        int h =(day+(26*(month+1)/10)+k+(k/4)+(j/4)+5*j)%7;
        System.out.print("Day of the week is ");
        switch (h){
            case 0: System.out.println("Saturday");break;
            case 1: System.out.println("Sunday");break;
            case 2: System.out.println("Monday");break;
            case 3: System.out.println("Tuesday");break;
            case 4: System.out.println("Wednesday");break;
            case 5: System.out.println("Thursday");break;
            case 6: System.out.println("Friday");break;

        }
    }
}
