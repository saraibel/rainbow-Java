package Practice7;

public class Week {

    Days days;

    public Week(Days days) {
        this.days = days;

    }

    public void whatTodo() {
        switch (days) {
            case Friday:
                System.out.println( "stay home and chill" );
                break;
            case Saturday:
            case Sunday:
                System.out.println( "join class at pnt" );
                break;
            case Monday:
                System.out.println( "go back to work" );
                break;
            default:
                System.out.println( "practice java" );

        }
    }
}
