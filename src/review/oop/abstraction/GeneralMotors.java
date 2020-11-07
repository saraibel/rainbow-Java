package review.oop.abstraction;

public class GeneralMotors extends ModernCar implements Car {
    //concrete class
//we can create a variable in the implement claas
    String GmCarModel = "2821M";
    double GmCarPrice = 50000.500;

    //we can create method as well in this class
    public void GmCarInfo() {
        System.out.println( "General Motor car information" + GmCarModel );
    }

    public void startCar() {
        System.out.println( "General Motors car has start features" );
    }

    public void stopCar() {
        System.out.println( "General Motors car has start features" );
    }

    public void wheelCar() {
        System.out.println( "General Motors car has wheel" );
    }

    public void engineCar() {
        System.out.println( "General Motors car has engine" );
    }

    public void accelerateCar() {
        System.out.println( "General Motors car has break" );
    }

    public void stearingCar() {
        System.out.println( "General Motors car has accelerate feature" );
    }

    public void breakCar() {
        System.out.println( "General Motors car has breakCar features" );
    }


    public void autoStart() {
        System.out.println( "General Motors car hasautoStart features" );
    }

    public void blindSpot() {
        System.out.println( "General Motors car hasblindpot features" );
    }

    public void preCoolsion() {
        System.out.println( "General Motors car has preCooling features" );
    }

    public void heatingCooling() {
        System.out.println( "General Motors car has heatingCooling features" );
    }

    public void gps() {
        System.out.println( "General Motors car has gps features" );
    }

    public void backCamera() {
        System.out.println( "General Motors car has backCamera features" );
    }

    public void autoGear() {
        System.out.println( "General Motors car has autoGear features" );
    }
}
