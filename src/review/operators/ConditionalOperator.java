package review.operators;

public class ConditionalOperator {
    //&& conditional and : all condition must have to be true
    // || conditional or: if one condition is true then block of code will execute
    // pipe ||

    public static void main(String[] args) {
        int num1 = 55;
        int num2 = 40;
        if (num1 == num2) {
            System.out.println( "num1 and num2 is equal" );
        }
        //all condition must have to be true
        if (num1 == 55 && num2 == 40) {
            System.out.println( "we love pizza" );
        }
        if (num1 == 56 || num2 == 40) {
            System.out.println( "we love to eat burgers" );
        }
    }

}
