//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Q1.1
        // (Display three messages) Write a program that displays Welcome to Java,
        //Welcome to Computer Science, and Programming is fun.
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Computer Science");
        System.out.println("Programming is fun");

        //Q1.2
        //(Display five messages) Write a program that displays Welcome to Java five times.
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Java");

        //Q1.3
        //1.3 (Display a pattern) Write a program that displays the following pattern:
        //    J     A     V     V     A
        //    J    A A     V   V     A A
        //J   J   AAAAA     V V     AAAAA
        // J J   A     A     V     A     A

        System.out.println("    J     A     V     V     A");
        System.out.println("    J    A A     V   V     A A");
        System.out.println("J   J   AAAAA     V V     AAAAA");
        System.out.println(" J J   A     A     V     A     A");

        //Q1.4
        //1.4 (Print a table) Write a program that displays the following table
        //a a^2 a^3
        //1 1 1
        //2 4 8
        //3 9 27
        //4 16 64
        System.out.println("1  1    1");
        System.out.println("2  4    8");
        System.out.println("3  9    27");
        System.out.println("4  16   64");

        // 1.5 (Compute expressions) Write a program that displays the result of
        //(9.5*4.5-2.5*3)/(45.5-3.5) .
        System.out.println((9.5*4.5-2.5*3)/(45.5-3.5));

        // 1.6 (Summation of a series) Write a program that displays the result of
        //1+ 2+ 3+ 4+ 5+ 6+ 7+ 8+ 9.
        System.out.println(1+2+3+4+5+6+7+8+9);

        //Q 1 .7(Approximate p) p can be computed using the following formula
        System.out.println("PI" + 4*(1.0-1/3+1/5-1/7+1/9-1/11+1/13));

        //Q1.8 (Area and perimeter of a circle) Write a program that displays the area and perimeter
        // of a circle that has a radius of 5.5 using the following formulas:
        //perimeter= 2*radius*PI
        //area= radius*radius*PI
        System.out.println("perimeter of Circle: "+2*Math.PI*5.5);
        System.out.println("Area of Circle:"+Math.PI*5.5*5.5);

        //Q1.9
        //(Area and perimeter of a rectangle) Write a program that displays the area and
        //perimeter of a rectangle with a width of 4.5 and a height of 7.9 using the folLowing formula
        System.out.println("perimeter of Rectangle: "+2*(4.5+7.9));
        System.out.println("Area of Rectangle:"+4.5*7.9);


        //Q1.10


        //Q1.11

        //Q1.13


        double x = ((44.5 * 0.55) - (50.2 * 5.9)) /  (3.4 * 0.55) - (50.2 * 2.1);
        double y = ((3.4 * 5.9) - (44.5 * 2.1)) /  (3.4 * 0.55) - (50.2 * 2.1);

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}