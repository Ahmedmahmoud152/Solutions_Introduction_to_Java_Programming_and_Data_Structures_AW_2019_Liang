public class Q32 {
    public static void main(String[] args) {
        int p1=0;
        int p2=0;

        for (int i = 0; i <10000 ; i++) {
        if(craps()==1)
            p1++;
        else p2++;
        }
        System.out.println("the number of winning games."+p1);
        System.out.println("the number of losing  games."+p2);
    }

    public static int craps() {

        int point = 0;

        int die1 = (int)(Math.random() * 6) + 1;
        int die2 = (int)(Math.random() * 6) + 1;

        int sum = die1 + die2;


        // First roll
        if (sum == 2 || sum == 3 || sum == 12) {
            return 0;
        }
        else if (sum == 7 || sum == 11) {
            return 1;
        }
        else {

            point = sum;
            while (true) {

                die1 = (int)(Math.random() * 6) + 1;
                die2 = (int)(Math.random() * 6) + 1;

                sum = die1 + die2;
                if (sum == point) {
                    return 1;
                }
                else if (sum == 7) {
                    return 0;
                }
            }
        }}
}
