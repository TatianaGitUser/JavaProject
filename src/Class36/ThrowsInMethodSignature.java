package Class36;

public class ThrowsInMethodSignature {
    public static void main(String[] args) {

    }
//    throws keyword is used to declare exceptions in the method signature
//    which means, the method has a block of code that throws an exception.

    public static void withdraw(int amount) throws Exception{
        int balance = 100;
        if(amount < balance){
//            throw keyword actually throws an exception

            throw new Exception("Insufficient funds");
        }
    }
//    when you are creating a logic declare ecxeptions in method signature.
//    and when you are applying the method logic that try and catches
    public static void transfer(){
        try{
            withdraw(50);
        }catch(Exception e){
            System.out.println(e);
        }
    }
//            OR
    public static void transfer1()throws Exception{
        withdraw(50); // passing it on
    }
}
//Difference between THROW and THROWS:
//throw keyword is used to actually throw and exception
//throws keyword can only be used in the method signature,
//it is used to declare exceptions in your method signature
//more like a warning to those who are going to use this method