public class Q26 {
    public static void main(String[] args) {
        int count = 0;
        int count2 = 0;
        int number = 2;
        while (count < 101) {
            if (isPalindrome(number) && isPrime(number)) {
                count++;
                count2++;
                System.out.print(number + " ");
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

    public static boolean isPalindrome(int number) {
        String temp = number + "";

        for (int i = 0; i < temp.length() / 2; i++) {
            if (temp.charAt(i) != temp.charAt(temp.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
