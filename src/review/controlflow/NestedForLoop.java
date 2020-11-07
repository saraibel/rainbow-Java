package review.controlflow;

import java.util.Scanner;
// it can be in the interview questions will ask like this
//user will give you the number and it will print as row basis
//output
//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5

public class NestedForLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        System.out.println( "enter your number" );
        int numOfRow = input.nextInt();

        for (int i = 1; i < numOfRow; i++) {

            for (int j = 1; j <= i; i++) {
                System.out.println( j + " " );
            }
            System.out.println();
        }
    }
}