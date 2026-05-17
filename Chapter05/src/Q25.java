public class Q25 {
    public static void main(String[] args) {
        double sum = 0; int count = 0;
        for (int i = 10000; i <= 100000; i += 10000) {
            for (int j = 1; j < i; j += 1) {
                sum += (Math.pow(-1, (j + 1))) / (2.0 * j - 1.0);
            }
            System.out.println("PI OF "+i +" = " + 4.0*sum);
            sum = 0.0;
        }
    }
}