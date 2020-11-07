package review;

public class AccessModifier {
    //acess modifier/ access specifier where you can access and where can not access
    //public- private-protected -default
    public static void main(String[] args) {
        //in eclipse you type main>ctrl+space mac: command+space button
        System.out.println();
    }

    private static void display() {
        System.out.println( "display" );
    }

    public static void TvDisplay() {
        System.out.println( "TVdisplay" );
    }

    protected static void mobileDisplay() {
        System.out.println( "mobile display" );
    }

}


