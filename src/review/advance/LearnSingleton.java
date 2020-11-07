package review.advance;

public class LearnSingleton {
    //Singleton class we are allowed to create one instant of a class at a time
    //using private constructor we can ensure that no more that one project can be created at a time

    // create instance variable/ object
    private static final LearnSingleton instance = new LearnSingleton();
    public String PizzaName;
    public int pizzaPrice;
    public String pizzaQty;
    public String pizzaDeliveryCharge;
    private char size = 'L';
    private boolean isAvailable;

    private LearnSingleton() { //private Constructor
    }

    //create a public method
    public static LearnSingleton getInstance() {
        return instance;
    }
    // getter /setter in order to use it for private variables

    //size get
    public char getSize() {
        return size;
    }

    //size get
    public void setSize(char size) {
        this.size = size;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}





