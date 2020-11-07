package review.exceptionhandling;

public class Calculator {
    public static void doDivision(double num1, double num2) {
        double division = num1 / num2;
        System.out.println( "Division value is" + division );
    }

    public static void main(String[] args) {
        //doDivision(20 , 0 );
        Calculator.doDivision1();
    }

    public static void doDivision() {

        try {
            int num1 = 45;
            int num2 = 0;
            int div = num1 / num2;
            System.out.println( "sum of two value is  " + div );
        } catch (Exception exception) {
            // exception.printStackTrace();
            System.out.println( "this is arithmeticException" );

        } finally {// must have excecute this block of code
            System.out.println( "this division result" );

        }
    }

    public static void doDivision1() throws ArithmeticException {
        int num1 = 45;
        int num2 = 0;
        int div = num1 / num2;
        System.out.println( "sum of two value is  " + div );

    }

}
