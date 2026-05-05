import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double RADIUS = 6371.01;
        double p1LatAtlanta = Math.toRadians(33.7489954);
        double p1LonAtlanta = Math.toRadians(-84.3879824);

        double p1LatCharlotte = Math.toRadians(35.2270869);
        double p1LonCharlotte = Math.toRadians(-80.8431267);


        double p1LatSavannah = Math.toRadians(32.0835407);
        double p1LonSavannah = Math.toRadians(-81.0998342);


        double p1LatOrlando = Math.toRadians(28.5383355);
        double p1LonOrlando = Math.toRadians(-81.3792365);

        double distance1 = RADIUS * Math.acos(
                Math.sin(p1LatAtlanta) * Math.sin(p1LatCharlotte) +
                        Math.cos(p1LatAtlanta) * Math.cos(p1LatCharlotte) * Math.cos(p1LonAtlanta - p1LonCharlotte)
        );
        double distance2 = RADIUS * Math.acos(
                Math.sin(p1LatCharlotte) * Math.sin(p1LatSavannah) +
                        Math.cos(p1LatCharlotte) * Math.cos(p1LatSavannah) * Math.cos(p1LonCharlotte - p1LonSavannah)
        );
        double distance3 = RADIUS * Math.acos(
                Math.sin(p1LatSavannah) * Math.sin(p1LatOrlando) +
                        Math.cos(p1LatSavannah) * Math.cos(p1LatOrlando) * Math.cos(p1LonSavannah - p1LonOrlando)
        );
        double distance4 = RADIUS * Math.acos(
                Math.sin(p1LatOrlando) * Math.sin(p1LatAtlanta) +
                        Math.cos(p1LatOrlando) * Math.cos(p1LatAtlanta) * Math.cos(p1LonOrlando - p1LonCharlotte)
        );
        double distance5 = RADIUS * Math.acos(
                Math.sin(p1LatOrlando) * Math.sin(p1LatCharlotte) +
                        Math.cos(p1LatOrlando) * Math.cos(p1LatCharlotte) * Math.cos(p1LonOrlando - p1LonAtlanta)
        );

        System.out.println("distance1 = " + distance1);
        System.out.println("distance2 = " + distance2);
        System.out.println("distance3 = " + distance3);
        System.out.println("distance4 = " + distance4);
        double s1 = (distance2 + distance3 + distance5)/2.0;
        double s2 = (distance1 + distance4 + distance5)/2.0;
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        double area1 = Math.sqrt(s1 * (s1 - distance2) * (s1 - distance3)*(s1-distance5));
        double area2 = Math.sqrt(s2 * (s2 - distance1) * (s2 - distance4)*(s2-distance5));
        System.out.println("area1 = " + area1);
        System.out.println("area2 = " + area2);
        double TotalArea = area1 + area2;
        System.out.println("Total Area: " + TotalArea);
    }
}
