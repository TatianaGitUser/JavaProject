package Class32;

public class InstanceMethodsVsStaticMethods {
    public static void main(String[] args) {
BankAccount ba = new BankAccount("ABC123", 2.0);
System.out.println(ba.getAccountNum());
System.out.println(ba.getBalance());

ba.deposit(300);
ba.deposit(200);
System.out.println(ba.getBalance());
ba.withdraw(150);
System.out.println(ba.getBalance());

BankAccount ba2 = new BankAccount("DEF555", 0.2);
System.out.println(ba2.getAccountNum());
System.out.println(ba2.getBalance());
ba2.deposit(1000000);
System.out.println(ba2.getBalance());
ba2.withdraw(100000);
System.out.println(ba2.getBalance());

double intereset = BankAccount.calculateInterest(10000, 0.05, 2);
System.out.println(intereset);
    }
}
class BankAccount{
    private String accountNum;
    private double balance;

    public BankAccount(String  accountNum, double balance){
        this.accountNum = accountNum;
        this.balance = 0.0;
    }
//instance method belong to a specific instance of a class.
//    It belongs to an OBJECT
//    instance method are declared without "static" keyword
//    instance methods can access and manipulate instance variables
//    to access (invoke, call) instance method - we first have to create an object
    public String getAccountNum(){
        return accountNum;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        balance+=amount;
    }

    public void withdraw(double amount){
        balance-=amount;
    }


//static method
public static double calculateInterest(double principal, double rate, int years){
    double interest = principal * rate * years;
    return interest;
}
}
