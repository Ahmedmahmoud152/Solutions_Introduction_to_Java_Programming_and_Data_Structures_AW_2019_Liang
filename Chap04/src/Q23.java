import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee’s name: ");
        String name = sc.nextLine();
        System.out.println("Enter number of hours worked in a week: ");
        double hours = sc.nextDouble();
        System.out.println("Enter hourly pay rate: ");
        double payRate = sc.nextDouble();
        System.out.println("Enter federal tax withholding rate: ");
        double federalTaxRate = sc.nextDouble();
        System.out.println("Enter state tax withholding rate: ");
        double stateTaxRate = sc.nextDouble();

        System.out.println("Employee Name: "+name);
        System.out.println("Hours Worked: "+hours);
        System.out.println("Pay Rate: $"+payRate);
        System.out.println("Gross Pay: $"+(payRate * hours));
        System.out.println("Deductions: ");
        System.out.println("Federal Withholding ("+(federalTaxRate*100)+"%): $"+((payRate * hours)*federalTaxRate));
        System.out.println("State Withholding  ("+(stateTaxRate*100)+"%): $"+((payRate * hours)*stateTaxRate));
        System.out.println("Total Deduction: $"+(((payRate * hours)*stateTaxRate)+((payRate * hours)*federalTaxRate)));
        System.out.println("Net Pay: $" +(((payRate * hours))-(((payRate * hours)*stateTaxRate)+((payRate * hours)*federalTaxRate))));
    }
}
