/*
* Diego Patterson
* 1/11/2024
*
* This project was made for solving "Exercise 1.13 StarFigures"
* on practiceIT. Though there are better ways to program this,
* the assignments asked for Static code.
*
*/
public class StarFigures {
    public static void main(String[] args) {
        doubleDash();
        star();
        System.out.println();
        doubleDash();
        star();
        doubleDash();
        System.out.println();
        System.out.println("  *");
        System.out.println("  *");
        System.out.println("  *");
        doubleDash();
        star();
    }

    private static void star() {
        System.out.println(" * *");
        System.out.println("  *");
        System.out.println(" * *");
    }

    private static void doubleDash() {
        System.out.println("*****");
        System.out.println("*****");
    }
}