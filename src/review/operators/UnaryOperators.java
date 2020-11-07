package review.operators;

public class UnaryOperators {
    //increament operator : ++ always add 1
    // preIncreament : ++number
    //postIncreament : number ++
    //Decreament operator : -- decrease -1
    // postDecreament : number --
    public static void main(String[] args) {
        int number = 20;
        //preIncreament : ++ number
        ++number;
        System.out.println( number );

        number++;
        System.out.println( number );

        --number;
        System.out.println( number );

        --number;
        System.out.println( number );
        System.out.println( "888888888888888888" );

        number--;
        number--;
        number--;
        --number;
        --number;
        System.out.println( number );

    }

}
