package review.operators;

public class EquallyAndRelationalOperator {


    // == equal
// ! = not equal
//>grater than
//>= grater than equal
//< less than
// <++ less than equal
    public static void main(String[] args) {
        int num1 = 30;
        int num2 = 40;
        //true or false
        if (num1 == num2) {
            System.out.println( "num1 and num2 is equal" );
        }
        if (num1 != num2) ;
        {
            System.out.println( "num1 and num2 is  not equal" );
        }
        if (num1 < num2) {
            System.out.println( "num1 grater than num2" );
        }
        if (num1 >= num2) ;
        System.out.println( "num1 grater than equal num2" );

        if (num1 <= num2) {
            System.out.println( "num1 less than equal num2" );

        }
    }
}