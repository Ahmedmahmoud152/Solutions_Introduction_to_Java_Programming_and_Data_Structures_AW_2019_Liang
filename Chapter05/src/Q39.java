public class Q39 {
    public static void main(String[] args) {

        double baseSalary = 5000;
        double target = 30000;

        int sales = 0;

        while (true) {

            double commission = 0;

            if (sales <= 5000) {
                commission = sales * 0.08;
            }
            else if (sales <= 10000) {
                commission = 5000 * 0.08 + (sales - 5000) * 0.10;
            }
            else {
                commission = 5000 * 0.08
                        + 5000 * 0.10
                        + (sales - 10000) * 0.12;
            }

            double income = baseSalary + commission;

            if (income >= target) {
                System.out.println("Minimum sales = " + sales);
                break;
            }

            sales++;
        }
    }
}
