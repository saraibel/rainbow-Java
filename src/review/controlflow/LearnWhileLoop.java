package review.controlflow;

public class LearnWhileLoop {

    //while loop is used in situations where we do not know how many times loop
    //needs to be executed beforehand
    //for loop is used where we already know about the number of times loop needs
    //while loop: pre condition checks
    //while (condition){++ or --)
    //when the condition is false  then exit from while loop
    public static void main(String[] args) {
        int x = 45;
        int y = 30;
        while (x > 40) {
            System.out.println( "we are learning while loop" );
            x--;
        }

        //nested loop
        while (x > 41) {
            System.out.println( "we are learning while loop" + x );
            x--;

            while (y < 35) {
                System.out.println( "nested while loop" );
                y++;
            }
        }
    }
}
