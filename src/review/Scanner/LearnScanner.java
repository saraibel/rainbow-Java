package review.Scanner;

import java.util.Scanner;

public class LearnScanner {
    private static Object Scanner;

    //Scanner:Scanner is a class from Jdk which take input from user
    public static void main(String[] args) {
        //className object name = new consrutor();
        Scanner input = new Scanner( System.in );

        System.out.println( "Enter your name" );

        String name = input.nextLine();
        System.out.println( "enter you student Id" );
        int id = input.nextInt();
        System.out.println( "my student Id is" + id );
        boolean isPresent = input.nextBoolean();
        System.out.println( "student is present" + isPresent );


        //close scanner object
        input.close();

    }
}
