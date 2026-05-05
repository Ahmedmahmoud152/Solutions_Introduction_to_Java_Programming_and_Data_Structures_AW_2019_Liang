import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = sc.nextInt();
        System.out.println("Enter a month: ");
        String month = sc.next();
        if (Character.isLowerCase(month.charAt(0))|| month.length()>3) {
            System.out.println(month+" is not a correct month name");
        }
        else {
            System.out.print(month +" "+year+" has ");
            month = month.toUpperCase();
            switch (month) {
                case "JAN":case "MAR":case "MAY":case "JUL":case "AUG":case "OCT":case "DEC":
                    System.out.println("31 days");break;
                case "APR":case "JUN":case "SEP":case "NOV":
                    System.out.println("30 days");break;
                case "FEB":
                    System.out.println((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? 29:28 +" days");break;
            }

        }

    }
}
