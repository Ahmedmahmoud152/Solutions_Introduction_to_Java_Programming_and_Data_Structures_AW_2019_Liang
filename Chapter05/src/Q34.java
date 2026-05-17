import java.util.Scanner;

public class Q34 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int userWins = 0;
        int pcWins = 0;

        while (Math.abs(userWins - pcWins) <= 2) {

            System.out.print("Enter scissor, rock, or paper: ");
            String you = input.nextLine().toLowerCase();

            int random = (int)(Math.random() * 3);

            String pc = "";

            switch (random) {
                case 0:
                    pc = "scissor";
                    break;

                case 1:
                    pc = "rock";
                    break;

                case 2:
                    pc = "paper";
                    break;
            }

            System.out.println("Computer chose: " + pc);

            if (you.equals(pc)) {

                System.out.println("Draw");

            }
            else if (
                    (you.equals("scissor") && pc.equals("paper")) ||
                            (you.equals("rock") && pc.equals("scissor")) ||
                            (you.equals("paper") && pc.equals("rock"))
            ) {

                System.out.println("You win!");
                userWins++;

            }
            else {

                System.out.println("Computer wins!");
                pcWins++;
            }

            System.out.println("You: " + userWins +
                    " | Computer: " + pcWins);

            System.out.println();
        }

        if (userWins > pcWins) {
            System.out.println("Final Winner: You");
        }
        else {
            System.out.println("Final Winner: Computer");
        }
    }
}