public class Q35 {
    public static void main(String[] args) {
        double sum=0;
        for(int a = 1; a <=624 ; a++){
            sum+=1.0/(Math.sqrt(a)+Math.sqrt(a+1.0));
        }
        System.out.println("The sum is "+sum);
    }
}
