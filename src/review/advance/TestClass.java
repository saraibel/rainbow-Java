package review.advance;

public class TestClass {
    public static void main(String[] args) {
        LearnSingleton pizza = LearnSingleton.getInstance();
        pizza.PizzaName = "American pizza";
        pizza.pizzaDeliveryCharge = "5";
        pizza.pizzaDeliveryCharge = "6";
        System.out.println( pizza.PizzaName );
        String deliveryCharge = pizza.pizzaDeliveryCharge = "5";
        System.out.println( "deliveryCharge" + 6 );

        pizza.setSize( 'M' ); //initialize value in size variable by calling setSize()method
        pizza.getSize(); //get value from size variable by calling getSize() method
        System.out.println( "pizza size is " + pizza.getSize() );

    }


}
