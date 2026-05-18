public class Q10 {
    public static void main(String[] args) {
        for (int i = 2; i <10000 ; i++) {
            if(isPrime(i))
            System.out.println("The number " + i + " is prime: "+isPrime(i) );
        }
    }
    public static boolean isPrime(int number) {
        int count = 0;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count==1;
    }
}
