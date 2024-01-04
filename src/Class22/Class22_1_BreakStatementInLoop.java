package Class22;

public class Class22_1_BreakStatementInLoop {
    public static void main(String[] args) {
//        write a program that executes "Hello world 4 times"

        int counter = 1;
        while (counter <= 4) {
            System.out.println("Hello world");
            counter++;
        }
        System.out.println("---------------");
        int counter1 = 1;
        while (true) {

            System.out.println("Hello world");
            counter1++;
            if (counter1 == 5) {
                break;
            }
        }
    }
}