package Class22;

public class Class22_3_ContinueStatementInLoop {
    public static void main(String[] args) {
        int counter = 1;
        while (counter <= 5) {
            System.out.println("Hello world");
            counter++;

            if (counter == 2) {
                continue;/*means skip line 14 (skip everything after 'continue')
                and go back to the next iteration*/

            }
            System.out.println("I love Java");
        }
    }
}