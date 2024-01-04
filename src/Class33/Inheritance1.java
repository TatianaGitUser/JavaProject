package Class33;

public class Inheritance1 {
    public static void main(String[] args) {
CheckingAccount account = new CheckingAccount(123456789l, 30.0);
account.setBalance(20);
System.out.println(account.getBalance());
System.out.println(account.getAccountNumber());

account.deposit(500.00);
System.out.println(account.getBalance());

account.withdraw(300);
System.out.println(account.getBalance());

CheckingAccount ac2 = new CheckingAccount(129.0, 6555444l, 20.0);
System.out.println(ac2.getBalance());
System.out.println(ac2.getAccountNumber());
  System.out.println("_-----------------_");
  System.out.println(account.getMonthlyFee());
  account.applyMonthlyFee();
  System.out.println(account.getBalance());

  System.out.println(ac2.getMonthlyFee());
ac2.applyMonthlyFee();
        System.out.println(ac2.getBalance());

        System.out.println("----------------");
        CheckingAccount ac3 = new CheckingAccount(5000.0, 4564564365l, 20.00);
        ac3.withdraw(400);
        System.out.println(ac3.getBalance());
        ac3.withdraw(900);
        System.out.println(ac3.getBalance());


    }
}
//superclass
class BankAccount {
private final long accountNumber;
public BankAccount(long accountNumber){
    this.accountNumber = accountNumber;
}
private double balance;
public BankAccount(double balance, long accountNumber){
    this(accountNumber);//---->this constructor is called with that keyword
    this.balance = balance;
}
public double getBalance(){
    return balance;
}
public void setBalance(double balance){
    this.balance = balance;
}
public long getAccountNumber(){
    return accountNumber;
}
public void withdraw(double amount){
    balance -= amount;
}
public void deposit(double amount){
    balance += amount;
}
}
//subclass
//subclass has to extend the parent class using keyword 'extends'
//when a class extends from another class, the subclass inherits all public and default
//instance variables and publi and default methods
class CheckingAccount extends BankAccount{
    private double monthlyFee;
    private double dailyWithdrawAmount;

public CheckingAccount(long accountNum, double monthlyFee){
    super(accountNum);
    this.monthlyFee = monthlyFee;
}
public CheckingAccount(double balance, long accountNum, double monthlyFee){
    super(balance, accountNum);//---->with this keyword the constructor is called
    this.monthlyFee = monthlyFee;
}
public double getMonthlyFee(){
    return monthlyFee;
}
public void applyMonthlyFee(){
    withdraw(monthlyFee);
}
//the users can only withdraw 1000$ per day
@Override
public void withdraw(double amount){
    if(dailyWithdrawAmount+amount>1000){
        System.out.println("You reached your daily limit, you can only withdraw "+ (1000-dailyWithdrawAmount));
    }else{
        setBalance(getBalance()-amount);
        dailyWithdrawAmount+=amount;
    }

}
}