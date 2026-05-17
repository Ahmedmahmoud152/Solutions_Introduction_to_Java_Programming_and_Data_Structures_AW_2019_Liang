public class Q26 {
    public static void main(String[] args) {
        double sum = 0.0;
        double factor = 1.0;
        for (int i = 1; i < 20; i++) {
            for (int j = 1; j < 20; j++) {
                for (int k = 1; k < j; k++) {
                    factor=factor*k;
                }
                sum+=1/factor;
                factor=1.0;
            }
            System.out.println("The sum is "+sum);
            sum=0.0;
        }

    }
}
