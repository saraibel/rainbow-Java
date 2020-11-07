package review.advance;

public class LearnEnum {

    //enum
    // a declaration can be declared inside the class or outside of the class
    //enum vs inside a method
    //an enum can just like a class have attributes and methods
    //enum constants are public  static final unchangeable can not be override
    //an enum can not be used to create objects and it can not extends other
    //classes but
    //it can implement interfaces
    //use enum you have values that you know are not going to change
    //days,colors

    public static void main(String[] args) {
        System.out.println( Color.Red );
        Color.ColorInfo();
        System.out.println( Priority.High );
    }

    public enum Priority {

        High, Low, medium
    }
}
