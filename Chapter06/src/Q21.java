import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String str = input.next();
        str = str.toUpperCase();
         StringBuilder letters = new StringBuilder();
        char ch ;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (getNumber(ch)!=-1){
            letters.append(getNumber(ch));}
            else {
                letters.append(ch);
            }
        }
        System.out.println(letters);


    }


public static int getNumber(char uppercaseLetter) {

    if (Character.isLetter(uppercaseLetter)) {
        uppercaseLetter = Character.toUpperCase(uppercaseLetter);
        if (uppercaseLetter >= 'A' && uppercaseLetter <= 'C')
            return 2;
        else if (uppercaseLetter >= 'D' && uppercaseLetter <= 'F')
            return 3;
        else if (uppercaseLetter >= 'G' && uppercaseLetter <= 'I')
            return 4;
        else if (uppercaseLetter >= 'J' && uppercaseLetter <= 'L')
            return 5;
        else if (uppercaseLetter >= 'M' && uppercaseLetter <= 'O')
            return 6;
        else if (uppercaseLetter >= 'P' && uppercaseLetter <= 'S')
            return 7;
        else if (uppercaseLetter >= 'T' && uppercaseLetter <= 'V')
            return 8;
        else if (uppercaseLetter >= 'W' && uppercaseLetter <= 'Z')
            return 9;
        else return 0;
    }
    if (Character.isDigit(uppercaseLetter)) {
        return uppercaseLetter - 48;
    }


return -1;}}
