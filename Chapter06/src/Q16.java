public class Q16 {
    public static void main(String[] args) {
        System.out.println("\nYear\tDays");

        for (int year = 2000; year <= 2026; year++) {
            System.out.printf("%d\t%d%n",
                    year,
                    numberOfDaysInAYear(year));
    }}
        public static int numberOfDaysInAYear(int year) {

            if ((year % 4 == 0 && year % 100 != 0)
                    || (year % 400 == 0)) {
                return 366;
            }

            return 365;
        }
}
