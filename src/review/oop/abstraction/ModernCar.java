package review.oop.abstraction;

public abstract class ModernCar {

    //absract class not 100% absract
    public String moderCarName = "Tesla";
    public String modernCarSuggestedPrice;//you can declare a variable with initializing

// bescause its an abstract class and it is a a car interface

    // /you can declare abstract  method
    public abstract void autoStart();

    public abstract void blindSpot();

    public abstract void preCoolsion();

    public abstract void heatingCooling();

    public abstract void gps();

    public abstract void backCamera();

    public abstract void autoGear();


    //you can declare a non abstract method
    public void display() {
        System.out.println( "Modern Car has display" );

    }


}
