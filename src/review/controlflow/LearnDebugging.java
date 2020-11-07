package review.controlflow;

public class LearnDebugging {
    public static void main(String[] args) {
        LearnDebugging debug = new LearnDebugging();
        debug.doMultiply( 20, 10 );

        int expectedResult = 200;
        //actual result is 30
        int actualResult = debug.doMultiply( 20, 10 );

        if (expectedResult == actualResult) {
            System.out.println( "Test case pass" );

        } else {
            System.out.println( "Test case fail" );
        }
    }

    //debug : bg
    //to identify the logicol error in our code
    public int doMultiply(int number1, int number2) {
        int multiply = number1 + number2;
        System.out.println( multiply );
        return multiply;
    }
}

