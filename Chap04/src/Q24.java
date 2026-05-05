import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first city: ");
        String firstCity = sc.nextLine();
        System.out.println("Enter the second city: ");
        String secondCity = sc.nextLine();
        System.out.println("Enter the Third city: ");
        String thirdCity = sc.nextLine();
        char friLetter = firstCity.charAt(0);
        char secLetter = secondCity.charAt(0);
        char trdLetter = thirdCity.charAt(0);
        if(friLetter <= secLetter && friLetter <= trdLetter&&secLetter <= trdLetter){
            System.out.println("The three cities in alphabetical order are "+firstCity+" " +secondCity+" "+ thirdCity);
        }
        if(secLetter <= friLetter && friLetter <= trdLetter&&secLetter <= trdLetter){
            System.out.println("The three cities in alphabetical order are "+secondCity+" " +firstCity+" "+ thirdCity);

        }
        if(friLetter <= secLetter && friLetter <= trdLetter&&trdLetter <= secLetter){
            System.out.println("The three cities in alphabetical order are "+firstCity+" " +thirdCity+" "+ secondCity);
        }

        if(friLetter <= secLetter && trdLetter <= friLetter&&trdLetter <= secLetter){
            System.out.println("The three cities in alphabetical order are "+thirdCity+" " +firstCity+" "+ secondCity);
        }

        if(trdLetter <= secLetter && trdLetter <= friLetter&&secLetter <= friLetter){
            System.out.println("The three cities in alphabetical order are "+thirdCity+" " +secondCity+" "+ firstCity);
        }
        if(secLetter <= trdLetter && trdLetter <= friLetter&& secLetter <= friLetter){
            System.out.println("The three cities in alphabetical order are "+secondCity+" " +thirdCity+" "+ firstCity);
        }

    }
}
