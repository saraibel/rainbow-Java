package review;

public class Method {

    //method: block of code which runs when it is called method is used to perform
    //certain actions and they are known as function
    //method type: 1- return method 2- non return type
    //return method without parameter
    //return method with parameter
    //non return method without parameter
    //non return method with parameter
    //method syntax: access modifier returnType/ MethodName(){ metod body}
    //ReturnType/MethodType:Data Type/ Class Type/object
    //MethodName:verb+Noun

    public static void main(String[] args) {

        Method obj = new Method();
        obj.doSummation();
        obj.doSubstraction( 30, 200 );
        obj.doSubstraction( 33, 210 );
        obj.doSubstraction( 20, 400 );
        obj.stInfo( "James", "William" );

    }

    public int doSummation() { //return type method without parameter
        int number1 = 20;
        int number2 = 30;
        int sum = number1 + number2;
        System.out.println( "summation value is " + sum );
        return sum;
    }

    public int doSubstraction(int num1, int num2) {//return type method with parameter
        int number1 = num1;
        int number2 = num2;
        int sub = num2 - num1;
        System.out.println( "substraction value is " + sub );
        return sub;

    }

    public String stInfo(String fName, String LName) {
        String fullname = fName + " " + LName;
        System.out.println( "full Name : " + fullname );

        return fullname;
    }

}


