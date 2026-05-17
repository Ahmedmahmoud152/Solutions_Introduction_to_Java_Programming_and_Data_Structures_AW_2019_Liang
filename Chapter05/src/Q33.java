public class Q33 {
    public static void main(String[] args) {
        for (int j = 2; j < 10000; j++) {
            int sum = 0;
            for (int k = 1; k < j; k++) {
                if (j % k == 0) {
                    sum += k;
                }
            }
            if (sum == j) {
                System.out.println("The number " + j + " is a perfect number ");
            }
        }
    }
}
