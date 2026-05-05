public class EstimateArea {

    // احسب المسافة بين نقطتين باستخدام قانون Haversine
    public static double distance(double lat1, double lon1,
                                  double lat2, double lon2) {

        final double R = 6371.01; // نصف قطر الأرض بالكيلومتر

        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);

        return R * Math.acos(
                Math.sin(lat1) * Math.sin(lat2) +
                        Math.cos(lat1) * Math.cos(lat2) *
                                Math.cos(lon1 - lon2)
        );
    }

    // حساب مساحة مثلث باستخدام قانون هيرون
    public static double triangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static void main(String[] args) {

        // الإحداثيات (longitude بالسالب)
        double atlantaLat = 33.7489954;
        double atlantaLon = -84.3879824;

        double orlandoLat = 28.5383355;
        double orlandoLon = -81.3792365;

        double savannahLat = 32.0835407;
        double savannahLon = -81.0998342;

        double charlotteLat = 35.2270869;
        double charlotteLon = -80.8431267;

        // مثلث 1: Atlanta - Savannah - Charlotte
        double d1 = distance(atlantaLat, atlantaLon, savannahLat, savannahLon);
        double d2 = distance(savannahLat, savannahLon, charlotteLat, charlotteLon);
        double d3 = distance(charlotteLat, charlotteLon, atlantaLat, atlantaLon);

        double area1 = triangleArea(d1, d2, d3);

        // مثلث 2: Atlanta - Orlando - Savannah
        double d4 = distance(atlantaLat, atlantaLon, orlandoLat, orlandoLon);
        double d5 = distance(orlandoLat, orlandoLon, savannahLat, savannahLon);
        double d6 = distance(atlantaLat, atlantaLon, savannahLat, savannahLon);

        double area2 = triangleArea(d4, d5, d6);

        double totalArea = area1 + area2;

        System.out.println("Area 1 = " + area1);
        System.out.println("Area 2 = " + area2);
        System.out.println("Total Area = " + totalArea + " km^2");
    }
}