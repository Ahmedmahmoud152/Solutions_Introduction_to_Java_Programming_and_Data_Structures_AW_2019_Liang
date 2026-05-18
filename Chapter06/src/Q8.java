public class Q8 {

    public static void main(String[] args) {

        System.out.println("Celsius\t\tFahrenheit\t|\tFahrenheit\t\tCelsius");
        System.out.println("----------------------------------------------------------------");

        int fahrenheit = 120;

        for (int celsius = 40; celsius >= 31; celsius--) {

            System.out.printf("%-10d\t%-12.1f|\t%-12d\t%.2f%n",
                    celsius,
                    celsiusToFahrenheit(celsius),
                    fahrenheit,
                    fahrenheitToCelsius(fahrenheit));

            fahrenheit -= 10;
        }
    }

    public static double celsiusToFahrenheit(double celsius) {
        return celsius * (9 / 5.0) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5 / 9.0) * (fahrenheit - 32);
    }
}