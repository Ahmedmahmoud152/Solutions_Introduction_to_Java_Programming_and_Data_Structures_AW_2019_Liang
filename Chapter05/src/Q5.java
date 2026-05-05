public class Q5 {
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s | %-10s%-10s\n",
                "Kilograms", "Pounds", "Pounds", "Kilograms");

        int kg = 1;
        int pounds = 20;

        while (kg <= 199 && pounds <= 515) {

            System.out.printf("%-10d%-10.1f | %-10d%-10.2f\n",
                    kg, kg * 2.2,
                    pounds, pounds / 2.2);

            kg += 2;
            pounds += 5;
        }
    }
}
