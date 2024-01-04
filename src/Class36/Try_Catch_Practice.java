package Class36;

public class Try_Catch_Practice {
    public static void main(String[] args) {
        method1();
        System.out.println("Line 6");
    }

    public static void method1() {
//        catch unchecked exception
        try {
            System.out.println("Beginning of the try");
            double result = 10 / 1;

//            in case there is NO error - the program skips catch method and only executes try method
            System.out.println("More stuff after trying to divide by zero");//all after error
            System.out.println("More stuff after trying to divide by zero");//will be skipped
            System.out.println("More stuff after trying to divide by zero");//until catch block
//if no error occurred - the whole body of try will be executed
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: / by zero occured but handled");
            System.out.println("More to catch");
        }
    }
}
