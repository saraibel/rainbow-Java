package review.controlflow;

public class IfElseIf {
    public static void main(String[] args) {

        double score = 98;
        if (score >= 98) {
            System.out.println( "your grade is A+" );

        } else if (score > +88) {
            System.out.println( "your grade is A+" );
        } else if (score >= 70) {
            System.out.println( "your grade is B" );
        } else if (score > 60) {
            System.out.println( "your grade is c" );
        } else {
            System.out.println( "ypur grade is f" );
        }
    }
}
