package Class36;

public class FinallyBlock {
    public static void main(String[] args) {
method1();
    }
//    finally is a block of code in try-catch pair that is executed regardless of the result of
//    try and catch
//    it is used for cleaning up and quitting resources
    public static void method1() {
        try {
            Class.forName("IHIHI");
            System.out.println("try");
        } catch (Exception e) {
            System.out.println(e);
        }finally {
            System.out.println("Cleaning up");
        }
    }
//    what is the difference between final and finally?
//    - they are not related, responsible for different operations
//    final can be used with variables, methods, classes
//    if the var is final - it can only be initialized once
//    if the method is final - it can not be overriden
//    if the class is final - it can not be extended

//    finally - is a block of code in try-catch pair that is executed regardless of the result of
////    try and catch
////    it is used for cleaning up and quitting resources
}
