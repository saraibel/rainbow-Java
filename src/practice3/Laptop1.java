package practice3;


public class Laptop1 {


    private static Laptop1 dc;
    String brand;
    String model;
    int year;
    int price;
    String davis;

    public Laptop1() {

        System.out.println( "davis" );
    }

    public Laptop1(String brand) {
        this.brand = brand;
        //System.out.println(brand);
    }

    public Laptop1(String brand, String model) {
        this.brand = brand;
        this.model = model;
        System.out.println( this.brand + " " + this.model );
    }

    public Laptop1(String brand, String model, int year, int price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        System.out.println( this.brand + " " + this.model );
        System.out.println( this.year + "  " + this.price );
    }

    public static void main(String[] args) {
        Laptop1 AA = new Laptop1( "sumsung", "as56" );
        Laptop1 Ab = new Laptop1();
        Laptop1 read = new Laptop1( "HP", "toshiba" );

    }

}