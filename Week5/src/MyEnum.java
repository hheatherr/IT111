import java.util.Scanner;

public class MyEnum {

    enum WhoWins {HOME, VISITOR, NEITHER}

    public static void main(String[]args) {
// now i'm going to declare a variable

        WhoWins who;

        int seahawks, broncos;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the final score for the Seahawks.");
        seahawks = input.nextInt();

        System.out.println("Please enter the final score for the Broncos.");
        broncos = input.nextInt();

        // if the seahawks score is greater than the broncos -

        if(seahawks > broncos) {
         who = WhoWins.HOME; //WhoWins.HOME is an object of the WhoWins data type
            System.out.println(who+ " team won!");
            System.out.print("Seahawks win by ");
            System.out.print(seahawks - broncos+ " points!");

        } else if(broncos > seahawks) {
            who = WhoWins.VISITOR; //WhoWins.HOME is an object of the WhoWins data type
            System.out.println(who+ " win!");
            System.out.print("Broncos win by ");
            System.out.print(broncos - seahawks+ " points!");
        } else {
            who = WhoWins.NEITHER; //WhoWins.HOME is an object of the WhoWins data type
            System.out.println(who+ " team won!");
            System.out.println("It's a tie!");
        }



    }



}
