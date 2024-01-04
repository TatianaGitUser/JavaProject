package Class32;

public class Encapsulation {
    public static void main(String[] args) {
ChaseCheckingAccount c1 = new ChaseCheckingAccount("Tatiana", "5645445445",
        444584645455849l, 1000000.00);
//System.out.println(c1.accountNum);
//
//c1.accountNum = "000000000";
//System.out.println(c1.accountNum);
        System.out.println(c1.getAccountNum());

        System.out.println(c1.getRoutingNum());

        System.out.println(c1.getName());

        System.out.println(c1.getBalance());

c1.setBalance(20000.00);
        System.out.println(c1.getBalance());

        c1.setBalance(-100.00);
        System.out.println(c1.getBalance());

        c1.setRoutingNum(463364424l);
        System.out.println(c1.getRoutingNum());
        c1.setRoutingNum(051000017L);
        System.out.println(c1.getRoutingNum());
    }
}
class ChaseCheckingAccount {
    private String name;
    private String accountNum;
//    making instance variables private - makes sure you can not access those variables to read
    // or modify its value outside the current class
    private long routingNum;
    private double balance;
    public ChaseCheckingAccount(String name, String accountNum, long routingNum, double balance) {
        this.name = name;
        this.accountNum = accountNum;
        this.routingNum = routingNum;
        this.balance = balance;
    }
//Getter and Setter methods:
//    Getter method helps you read the values of private instance variables
//    Setter method helps you to update the value of your private instance variable
//    each instance variable should have a getter and a setter most of the time
//Getter and Setter methods must always be public

//    GETTER
    public String getAccountNum(){
        return accountNum;
    }
    public long getRoutingNum(){
        return routingNum;
    }
    public String getName(){
        return  name;
    }
    public double getBalance(){
        return balance;
    }
//    Setter - the method that will help you update the PRIVATE instance variables
//    SETTER METHOD MUST BE VOID RETURN TYPE
//    Setter method have 1 parameter with the same data typeas the instance variable
//    public void setAccount(String accountNum){
//        this.accountNum = accountNum;
//    The biggest advantage of Setter method - is that we can set logic that will help avoid assigning
//    unwanted values to our instance variables based on the business requirements

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        }else{
            System.out.println("Negative values cannot be assigned to the balance");
        }
    }
    public void setRoutingNum(long routingNum){
        if(routingNum == 1234527978L ||routingNum == 10747919L){
            this.routingNum = routingNum;
        }else{
            System.out.println("Routing number is outside of our bank");
        }
    }
}
