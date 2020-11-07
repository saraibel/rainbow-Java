package review.controlflow;

public class Debugging {

    public static void main(String[] args) {
        Debugging bug = new Debugging();
        bug.doSummation( 30, 20 );
        int expectedResult = 50;
        // int actualResult = 600;

        int actualResult = bug.doSummation( 30, 20 );

        int acualResult = 600;

        //unit testing : I am checking my method is working or not
        if (expectedResult == acualResult) {
            System.out.println( "test case pass" );
        } else {

            System.out.println( "test case fail" );
            //logical error : need to fix error we need to do debbuging
            //before debugging we need break point
        }
    }

    public int doSummation(int num1, int num2) {
        int summation = (num1 * num2);
        System.out.println( "summation value is " + summation );
        return summation;

    }
}




