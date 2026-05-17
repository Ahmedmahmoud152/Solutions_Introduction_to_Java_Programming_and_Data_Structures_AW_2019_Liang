import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        String name1,name2="";
        double score1=0, score2=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Students: ");
        int n = sc.nextInt();
        System.out.println("Enter the name of Student " + ( 1) + ": ");
        name1 = sc.next();
        System.out.println("Enter the score of "+name1+": ");
        score1 = sc.nextDouble();
        System.out.println("Enter the name of Student " + (2) + ": ");
        name2 = sc.next();
        System.out.println("Enter the score of "+name2+": ");
        score2 = sc.nextDouble();
        if (score1<score2){
            String swap = name1;
            name1 = name2;
            name2 = swap;
            double tempScore = score1;
            score1 = score2;
            score2 = tempScore;

        }
        for (int i = 0; i < n-2; i++) {
            System.out.println("Enter the name of Student " + (i+3) + ": ");
          String newName = sc.next();
            System.out.println("Enter the score of "+newName+": ");
          double newScore = sc.nextDouble();
          if (newScore>score1) {
              name2=name1;
              score2=score1;
              name1=newName;
              score1=newScore;
          }
          else if (newScore>score2) {
              name2 = newName;
              score2 = newScore;
          }

        }
        System.out.println("The student " + name1 + " has  highest score " + score1);
        System.out.println("The student " + name2 + " has  second highest score " + score2);
    }
}
