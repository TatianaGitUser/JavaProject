package Class21;

public class Class21_0_ForLoop {
    public static void main(String[] args) {
//        write a prog that prints out 5 times
//        counter is a starting point
//        counter <=5 - ending point condition
        for (int counter = 1; counter <=5; counter++){
            System.out.println("Hello");
        }
//        write a prog that prints out for loop "Superstar" 7 times

//        the variable created inside for loop is local to this for loop inly. this means, next for loop can
//        use THE SAME NAME
        for (int counter = 1; counter<=7; counter++){
            System.out.println("Superstar");
        }
    }
}
