package review;

public class CallUseAccessModifier {


    public static void main(String[] args) {
        AccessModifier.TvDisplay();// public method
        //AccessModifier.display();//i cant have access because its private we are allowed to access only inside the class
        AccessModifier.mobileDisplay();// i can call the protected method only in the package but not outside the package


    }


}