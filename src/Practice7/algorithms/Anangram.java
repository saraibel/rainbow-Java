package Practice7.algorithms;

import java.util.Arrays;

public class Anangram {
    public static void main(String[] args) {
        String a = "ARMY";
        String b = "MARY";

        boolean anangram = checkIfStringsAreAnangram( a, b );

        if (anangram) {
            System.out.println( "anangram" );
        } else {
            System.out.println( "not anangram" );
        }
    }

    public static boolean checkIfStringsAreAnangram(String a, String b) {

        char[] firstArray = a.toUpperCase().toCharArray();
        char[] secondArray = b.toUpperCase().toCharArray();

        Arrays.sort( firstArray );
        Arrays.sort( secondArray );

        return Arrays.equals( firstArray, secondArray );

    }
}
