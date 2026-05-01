import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("scissor (0), rock (1), paper (2):");
        int you = sc.nextInt();
        int pc = (int) (Math.random() * 3);
        if (you == pc && pc == 0) {System.out.println("The computer is scissor. You are scissor too. It is a draw");}
        else if (you == pc && pc == 1) {System.out.println("The computer is rock. You are rock too. It is a draw");}
        else if (you == pc && pc == 2) {System.out.println("The computer is paper. You are paper too. It is a draw");}
        else if (you ==1 && pc == 2) {System.out.println("The computer is paper. You are rock. computer won");}
        else if (you == 0 && pc == 2) {System.out.println("The computer is paper. You are scissor.  computer won");}
        else if (you == 2 && pc == 1) {System.out.println("The computer is rock. You are paper .  you won");}
        else if (you == 2 && pc == 0) {System.out.println("The computer is scissor. You are paper .  you won");}
        else if (you == 0 && pc == 1) {System.out.println("The computer is rock. You are scissor . computer won");}
        else if (you == 1 && pc == 0) {System.out.println("The computer is scissor. You are rock .  you won");}

    }
}
