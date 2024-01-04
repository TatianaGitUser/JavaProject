package Class32;
//constructors with params are used to initialize the values of instance variables.
public class SavingsAccount {
    public long accountNum;
    public String accountHolderName;
    public double balance;

    public SavingsAccount(long num, String name, double b){
//        accountNum = num;
        accountNum = num;
        accountHolderName = name;
        balance = b;
    }
    public SavingsAccount(){

    }
}
class Main3{
    public static void main(String[] args) {
        SavingsAccount var = new SavingsAccount();
        var.accountNum = 12145885575l;
        var.accountHolderName = "John Doe";
        var.balance = 278000;

        System.out.println(var.accountHolderName);
        System.out.println(var.balance);
        System.out.println(var.accountNum);
        System.out.println("-------------------");

        SavingsAccount var2 = new SavingsAccount(44455669988l, "Elon Musk", 3255666.00);
System.out.println(var2.accountNum);
System.out.println(var2.accountHolderName);
System.out.println(var2.balance);
        }
    }
