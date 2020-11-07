package review.controlflow;

public class LearnDoWhile {


    //post condition check;
    //do while loop execute at least one time then it will check condition
    //do {}while()
    public static void main(String[] args) {

        int x = 20;

        do {
            System.out.println( "we are learning do while loop" );
            x++;

        } while (x < 25);


        int y = 15;
        do {
            System.out.println( "I'm moving to dallas this year" );
            y++;

        } while (y < 18);

    }
}