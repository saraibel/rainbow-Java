package review;

public class LearnRecursion {
//recursion: process in which a method calls itself continuously
    //must call itself
    //must have a base case
    //must change its state and move toward the base case

    int count;

    public static void main(String[] args) {
        LearnRecursion obj = new LearnRecursion();
        obj.stInfo();
    }

    public void stInfo() {
        count++;
        if (count <= 5) {
            System.out.println( "student name is james " );
            stInfo();
        }
    }

}