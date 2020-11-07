package review.oop.abstraction;

public class Test {
    public static void main(String[] args) {
        //in this class we create the object of the implements class
        GeneralMotors Gm = new GeneralMotors();
        Gm.startCar();
        Gm.engineCar();
        Gm.engineCar();
        Gm.breakCar();
        Gm.stopCar();
        //String SeatNumber=Gm.seat="2";
        System.out.println( "general Motor car number of seat" + Gm.seat );
        Gm.blindSpot();
    }
}
