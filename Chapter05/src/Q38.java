import java.util.Scanner;

public class Q38 {
        public static void main(String[] args) {
            System.out.println(" Enter a decimal integer");
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();
            String Octal = "";
            while(num!=0){
                Octal =Octal+num%8;
                num/=8;
            }
            String octalInv = "";
            for(int i=0;i<Octal.length();i++){
                octalInv+=Octal.charAt(Octal.length()-i-1);
            }
            System.out.println(" Binary value: "+octalInv);
        }


}
