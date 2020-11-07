package review.controlflow;

public class LearnSwitchCase {
    public static void main(String[] args) {
        int foodSerial = 4;
        String foodName;
        switch (foodSerial) {
            case 1:
                foodName = "pizza";
                break;
            case 2:
                foodName = "burger";
            case 3:
                foodName = "burito";
            case 4:
                foodName = "burito";
                break;
            case 5:
                foodName = "couscous";
                break;
            case 6:
                foodName = "steak";
                break;
            case 7:
                foodName = "chicken oven rice";
                break;
            case 8:
                foodName = "sushi";
                break;
            case 9:
                foodName = "shawarma";
                break;
            case 10:
                foodName = "coffee";
            default:
                foodName = " Invalid Food Name ";
                break;
        }
        System.out.println( "My food items during break is " + foodName );


    }

}


