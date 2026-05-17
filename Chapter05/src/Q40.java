public class Q40 {
    public static void main(String[] args) {
        int countHead=0;
        for(int j=1;j<=Math.pow(10,6);j++){
            if((int)(Math.random()*2)==1){
                countHead++;
            }
        }
        System.out.println(" Count head: "+countHead);
        System.out.println(" Count Tail: "+(int)(Math.pow(10,6)-countHead));
    }
}
