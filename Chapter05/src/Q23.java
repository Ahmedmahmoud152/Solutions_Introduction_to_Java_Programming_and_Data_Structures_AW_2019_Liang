public class Q23 {
    public static void main(String[] args) {

        double sum1 = 0, sum2 = 0;

        // Left to right
        for (int i = 1; i <= 50000; i++) {
            sum1 += 1.0 / i;
        }

        // Right to left
        for (int i = 50000; i >= 1; i--) {
            sum2 += 1.0 / i;
        }

        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);

        System.out.println("Cancellation Error = "
                + Math.abs(sum1 - sum2));
    }
}

