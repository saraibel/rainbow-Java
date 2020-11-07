package review.controlflow;

import java.util.Scanner;

public class LearForLoop {
    //loop is allowing us to excute a statement multiple times
    //we have for loop // while loop //do while loop //for each loop
    public static void main(String[] args) {

        //for loop  //for( initialization;condition; Iteration ){}
        //initialization means startpoint
        //condition
        //Iteration:Increment or Decrement
        for (int i = 3; i <= 5; i++) {
            System.out.println( "I'm tired" + i );

            for (int j = 0; j < 1; j++) {
                System.out.println( "elections 2020" );

            }
            Scanner input = new Scanner( System.in );
            System.out.println( "enter the food serial number" );
            int fs = input.nextInt();
            LearnSwitchCase lsc = new LearnSwitchCase();
        }
        System.out.println( "******************************************" );
        // nested for loop
        for (int i = 0; i < 5; i++) {
            //parent for loop
            System.out.println( "parent for loop" );
            for (int j = 1; j < 3; j++) ;
            System.out.println( "nested for loop " );
        }

    }
}