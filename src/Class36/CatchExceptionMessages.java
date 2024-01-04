package Class36;

public class CatchExceptionMessages {
    public static void main(String[] args) {
method1();
System.out.println("Still compiles");
    }
    public static void method1(){

        try {
            System.out.println("Started try");
            int [] nums = new int[2];
            int num = nums[5];
            System.out.println("Everything went well");
//            what you put in catch clause?
        }catch(ArrayIndexOutOfBoundsException e){
//            first print out exception e mrssage
            System.out.println(e);
            e.printStackTrace();//looks like the program crashed, in fact it prints out
                                //error message and finishes the program
//    it prints out stack trace to be able to troubleshoot where the exception was
//    thrown in a big framework
        }
    }
}
