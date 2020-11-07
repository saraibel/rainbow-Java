package review.oop.encapsulation;

public class Pizza {

    //encapsulation in java is a mechanism of wrapping the data (variable
//and code acting on the data methods together as a single unit
    //in encapsulationthe variables of a class will be hidden from other classes and
    //be accessed only through the methods of their current class
    //therefore it is also know as data hiding
    //to acheive encapsulation in java
    //- declare the variable of a class as private
    //provide public setter and getter method to modify and view the variables values.
    public String pizzaName = "American Pizza";
    public double pizzaPrice = 50.50;

    private String pizzaType = "Meat Lover";
    private String sauceType;
    private String topping;
    private char size;
    private boolean isavailable;


    public Pizza() {
    }

    public Pizza(String pizzaName) {
        this.pizzaName = pizzaName;
        // System.out.println("rashema like to eat pizza"+pizzaName);
        // System.out.println("love to eat fat Pizza price ");
    }


    public Pizza(String pizzaName, double pizzaPrice) {
        this.pizzaName = pizzaName;
        this.pizzaPrice = pizzaPrice;
        System.out.println( "sara likes to eat pizza" + pizzaName );
        System.out.println( "and price is " + pizzaPrice );

    }


    public Pizza(String pizzaName, double pizzaPrice, String pizzaType) {
        this.pizzaName = pizzaName;
        this.pizzaPrice = pizzaPrice;
        this.pizzaType = pizzaType;//private
        System.out.println( "love to eat " + pizzaName + ", type " + pizzaType + "  and price is " + pizzaPrice );

    }

    public Pizza(String pizzaType, String sauceType, char size) {
        this.pizzaType = pizzaType;
        this.sauceType = sauceType;
        this.size = size;
    }

    public String getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(String pizzaType) {
        this.pizzaType = pizzaType;
    }

    public String getSauceType() {
        return sauceType;
    }

    public void setSauceType(String sauceType) {
        this.sauceType = sauceType;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public boolean isIsavailable() {
        return isavailable;
    }

    public void setIsavailable(boolean isavailable) {
        this.isavailable = isavailable;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }
//getter and setter

}
