public class Q20 {
    public static void main(String[] args) {
      int count=0;
      int count2=0;
        for (int i = 2; i <= 1000; i++) {

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(i + "  ");
                count2++;
            }
            if (count2 == 10) {
                System.out.println();
                count2=0;
            }
            count=0;

        }
    }
}
