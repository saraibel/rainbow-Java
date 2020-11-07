package review.oop.abstraction;

public abstract class FlyingCar extends ModernCar {


    public boolean isEmergencyExist = true;

    public abstract void sensor();

    public abstract void flyingFeature();

    public abstract void boosEngine();

    public abstract void airbag();


    public void takeoffLanding() {
        System.out.println( "flying car has take off landing feature" );

    }

}
