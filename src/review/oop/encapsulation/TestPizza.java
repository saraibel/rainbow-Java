package review.oop.encapsulation;

public class TestPizza {
    public static void main(String[] args) {
        Pizza ramdanPizza = new Pizza();//using default constructor

        String rdp = ramdanPizza.pizzaName = "scicillian";
        System.out.println( "Sara loves to eat " + rdp + " pizza" );

        Pizza resmaPizza = new Pizza( " chicken cutlet + green pepper", 40.50 );//pass the argument
        // resmaPizza.pizzaPrice= 40.50;
        // System.out.println( resmaPizza.pizzaPrice);

        Pizza lemLemPizza = new Pizza( "fat pizza", 60.50, "american" );
        lemLemPizza.setSauceType( "hot" );
        lemLemPizza.setTopping( "chicken" );
        System.out.println( "sauce type " + lemLemPizza.getSauceType() + " topping  " + lemLemPizza.getTopping() );
        lemLemPizza.setIsavailable( true );
        System.out.println( lemLemPizza.isIsavailable() );
        lemLemPizza.setSize( 'L' );
        System.out.println( lemLemPizza.getSize() );
    }
}