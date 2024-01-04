package Class32;

public class CheckingAccount {
    public long accountNumber;
    public int routingNumber;
    public String accountHolderName;
    public String address;

//    Constructor is a part of the code that allows you to create a new object.
//    Every class has a constructor
//    If you don't create  a constructor explicitly - then Java adds a default
//    constructor to your class

//    Default constructor - is a constructor with ni parameters
    public CheckingAccount(){
//        it is ok to write code inside a constructor
        System.out.println("Hello, I am a constructor");

//        reles for creating a Constructor:
//        *Initializes an Object
//        * Cannot be called like Methods
//        * Is called automatically as soon as the object is created
//        * Doesn't allow any return type (not even void)
//        * Name is the same as the one of a "Class Name"
//        * Could accept parameters


    }
}
 class Main2{
     public static void main(String[] args) {
         CheckingAccount var = new CheckingAccount();//calling the constructor
     }

}
