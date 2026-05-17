public class Q24 {
    public static void main(String[] args) {
        double sum=0;
        for (int i = 0; i <=50000 ; i+=2) {
            sum+=(1.0+i)/(i+3);
        }
        System.out.println("Sum: "+sum);
    }
}

