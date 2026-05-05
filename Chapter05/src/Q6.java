public class Q6 {
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s | %-10s%-10s\n",
                "Miles", "Kilometers", "Kilometers", "Miles");

        int miles = 1;
        int kiloMeters = 20;

        while (miles <= 10 && kiloMeters <= 65) {

            System.out.printf("%-10d%-10.3f | %-10d%-10.3f\n",
                    miles, miles * 1.609,
                    kiloMeters, kiloMeters / 1.609);

            miles += 1;
            kiloMeters += 5;
        }
    }
}
