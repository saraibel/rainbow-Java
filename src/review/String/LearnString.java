package review.String;

public class LearnString {

    public static void main(String[] args) {
        String foodName = "American pizza";
        String foodname1 = "Mexican pizza";

        System.out.println( foodName.length() );
        System.out.println( "concat value" + foodName.concat( foodName ) );
        System.out.println( foodName.compareToIgnoreCase( "American pizza" ) );
        System.out.println( foodName.contentEquals( "American pizza" ) );
        System.out.println( foodName.charAt( 4 ) );
        System.out.println( foodName.substring( 5 ) );
        System.out.println( foodName.substring( 5, 10 ) );
        System.out.println( foodName.charAt( 24 ) );

        try {
            System.out.println( foodName.charAt( 24 ) );
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println( "StringIndexOutOfBoundsException" );
        } finally {
            System.out.println( foodName.charAt( 6 ) );
        }
        System.out.println( "*****************************" );
        System.out.println( foodName.charAt( 24 ) );
        System.out.println( foodName.substring( 6 ) );

    }
}