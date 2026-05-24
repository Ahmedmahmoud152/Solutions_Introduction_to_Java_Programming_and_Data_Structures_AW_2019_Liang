import java.util.Scanner;

public class Q31 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a credit card number as a long integer:");
        long creditCardNumber = input.nextLong();

        if (isValid(creditCardNumber)) {
            System.out.println("The card number is valid.");
        } else {
            System.out.println("The card number is invalid.");
        }
    }

    /** Return true if the card number is valid */
    public static boolean isValid(long number) {

        int size = getSize(number);

        int total =
                sumOfDoubleEvenPlace(number)
                        + sumOfOddPlace(number);

        return (size >= 13 && size <= 16) &&
                (prefixMatched(number, 4) ||
                        prefixMatched(number, 5) ||
                        prefixMatched(number, 6) ||
                        prefixMatched(number, 37)) &&
                (total % 10 == 0);
    }

    /** Get the result from Step 2 */
    public static int sumOfDoubleEvenPlace(long number) {

        int sum = 0;

        // نبدأ من الرقم قبل الأخير
        number /= 10;

        while (number != 0) {

            int digit = (int) (number % 10);

            sum += getDigit(digit * 2);

            number /= 100;
        }

        return sum;
    }

    /** Return this number if it is a single digit,
     * otherwise, return the sum of the two digits */
    public static int getDigit(int number) {

        if (number < 10) {
            return number;
        }

        return number % 10 + number / 10;
    }

    /** Return sum of odd-place digits in number */
    public static int sumOfOddPlace(long number) {

        int sum = 0;

        while (number != 0) {

            sum += number % 10;

            number /= 100;
        }

        return sum;
    }

    /** Return true if the number d is a prefix for number */
    public static boolean prefixMatched(long number, int d) {

        return getPrefix(number, getSize(d)) == d;
    }

    /** Return the number of digits in d */
    public static int getSize(long d) {

        int size = 0;

        while (d != 0) {

            d /= 10;

            size++;
        }

        return size;
    }

    /** Return the first k number of digits from number.
     * If the number of digits in number is less than k,
     * return number. */
    public static long getPrefix(long number, int k) {

        int size = getSize(number);

        if (size < k) {
            return number;
        }

        for (int i = 0; i < size - k; i++) {

            number /= 10;
        }

        return number;
    }
}