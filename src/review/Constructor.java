package review;

public class Constructor {

    //constructor name will be same as class name
    //constructor has no return type
    //constructor are used to initialize the object
    //before creating parameterize constructor we must have to create default constructor
    // default/non parametarized constructor
    //parametarized constructor
    // AccessModifier ClassName();
    // when we use constructor ? is to initialize the object

    String name;
    String address;
    int age;
    double coursefee;

    public Constructor() { //default constructor
        System.out.println( "today is windy" );
    }

    //single parameterized
    public Constructor(String Name) {
        //default constructor
        this.name = Name;
        System.out.println( this.name );
    }

    // multiple parameterized constructor
    public Constructor(String name, String address) {
        this.name = name;
        this.address = address;
        System.out.println( this.name + " " + this.address );
    }

    public Constructor(String name, String address, double age) {
        this.name = name;
        this.address = address;
        this.age = (int) age;
        System.out.println( this.name + " " + this.address + " " + this.age );
        System.out.println( this.name + " " + this.address + " " + this.age + this.coursefee );
    }
//parameter signiture pattern is different

    public static void main(String[] args) {
        // constructors are used to initialize the object
        Constructor learn = new Constructor( "illy" );// arrgument passing //single parameter
        Constructor read = new Constructor( "Sara", "Brooklyn" ); //double parameter

        Constructor dc = new Constructor();
        Constructor em = new Constructor( "Emily", "columbus,Oh", 2 );//multiple parameter
        Constructor sara = new Constructor( "aksel", "brooklyn", 35 );
        Constructor lina;
        sara.name = "aksel";
        sara.address = "brooklyn";
        sara.coursefee = 500.50;
        sara.age = 35;
        String Address;
        System.out.println( "student name is " + sara.name + "  " + "Address is " + sara.address + "  " + "Age is " + sara.age );
    }

}

