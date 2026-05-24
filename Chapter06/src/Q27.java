public class Q27 {
    public static void main(String[] args) {
        int count = 0;
        int count2 = 0;
        int number = 10;
        while (count < 101) {
            if (isPrime(number)) {
                if(isPrime(reverse(number)) &&(number!=reverse(number))) {
                count++;
                count2++;
                System.out.print(number + " ");}
            }
            if (count2 % 10 == 0 && count2 != 0) {
                System.out.println();
                count2 = 0;
            }
            number++;
        }

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
    public static int reverse(int number) {
        int result = 0;
        while (number != 0) {
            result = result * 10 + number % 10;
            number /= 10;
        }
        return result;
    }
}
