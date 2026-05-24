public class Q28 {
    public static void main(String[] args) {
        System.out.printf("p\t\t\t\t2^p-1\n");
        for (int i = 2; i <31 ; i++) {
            if (isPrime(i)) {
            System.out.println(i+"\t\t\t\t"+mersennePrime(i));}
        }
    }
    public static int mersennePrime(int number) {
        return (int) Math.pow(2,number)-1;
    }
    public static boolean isPrime(long number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
