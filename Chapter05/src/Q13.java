public class Q13 {
    public static void main(String[] args) {
        int count =1;
        while (Math.pow(count, 3) < 12000) {
            count++;
        }
        System.out.println(count-1);
    }
}
