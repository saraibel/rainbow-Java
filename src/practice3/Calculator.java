package practice3;

public class Calculator {
    public static void main(String[] args) {
        int additionData = calculator( 10, 20, 30 );
        int multiplicationData = calculator( 3, 10 );

        System.out.println( additionData );
        System.out.println( multiplicationData );
    }

    // create 2 calculators
    // - one of them  will do addition of given 3 int
    // - another will do multiplication of given 2 int


    public static int calculator(int a, int b, int c) {
        int d = a + b + c;
        return d;
    }

    public static int calculator(int a, int b) {
        int c = a * b;
        return c;

    }


}
