package review.controlflow;

public class NestedIfElse {
    public static void main(String[] args) {
        int age = 23;

        if (age > 15) {
            System.out.println( "you are adult" );
            if (age > 24) {
                System.out.println( "you are youth" );
                if (age > 22) {
                    System.out.println( "you are youth" );
                }

            } else {
                System.out.println( "you are not youth" );

            }


        } else {
            System.out.println( "you are not adult" );


        }
    }
}

