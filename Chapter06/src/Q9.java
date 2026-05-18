import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Feet\t\tMeters\t|\tMeters\t\tFeet");
        System.out.println("----------------------------------------------------------------");

        int Meters = 20;

        for (int feet = 1; feet <= 10; feet++) {

            System.out.printf("%-10d\t%-12.3f|\t%-12d\t%.3f%n",
                    feet,
                    footToMeter(feet),
                    Meters,
                    meterToFoot(Meters));

            Meters += 5;
        }
    }

    public static double footToMeter(double foot){
        return   0.305 * foot;
    }
    public static double meterToFoot(double meter){
        return   3.279 * meter;
    }
}
