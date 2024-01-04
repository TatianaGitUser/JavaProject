package Class36;

public class Exceptions1 {
    public static void main(String[] args) {
        example();
        System.out.println("Hello WeDevX");
    }
    public static void example(){
//        checked exceptions need to be handled in order for code to compile
//        How to handle checked Exception:
//        1. Handle with try - catch block

//        checked exceptions mean that you want to use a method that is known to be prone
//        to having mistakes like:
//        dev misspells something etc
//
        try {
//            write the logic whcih throws a checked exception

//            when the method actually fails - the code will jump to catch block
//            by skipping the remaining code in the try block
            Class.forName("com.wedevx-java.class19.ClassName");
            System.out.println("Line 25");
//catch block: inside parenthesis we need to put an exception the block of code throws
        }catch(ClassNotFoundException e){ //e=variable name industry standard
System.out.println("Something went wrong in the try block");
//everything in the catch block will be executed
        }
    }
}
