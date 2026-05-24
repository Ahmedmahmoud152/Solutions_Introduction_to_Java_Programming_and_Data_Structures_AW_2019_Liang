public class Q38 {
    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            System.out.print(getRandomCharacter('A','Z')+" ");
            if((i+1)%50==0) System.out.println();
        }
        for(int j = 0 ; j<100 ; j++){
            System.out.print(getRandomCharacter('0','9')+" ");
            if((j+1)%50==0) System.out.println();
        }
    }

    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 -ch1 + 1));
    }
}
