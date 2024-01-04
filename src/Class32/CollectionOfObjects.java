package Class32;

import java.util.ArrayList;
import java.util.List;

public class CollectionOfObjects {
    public static void main(String[] args) {
        List<BankingAccount> allAccounts = new ArrayList<>();
        BankingAccount ba1 = new BankingAccount("Chase", 245500);
        BankingAccount ba2 = new BankingAccount("BOA", 1234444);
        BankingAccount ba3 = new BankingAccount("US Bank", 7856936);
        allAccounts.add(ba1);
        allAccounts.add(ba2);
        allAccounts.add(ba3);
        System.out.println(allAccounts);

        for(BankingAccount obj : allAccounts) {
            if (obj.getName().equalsIgnoreCase("chase")) {
                System.out.println(obj.getName());
            }
        }
        double result = calculateTotalBalanceOfAllAcc(allAccounts);
        System.out.println(result);
//        now List contains object ba1( String and double)
    }
    public static double calculateTotalBalanceOfAllAcc(List<BankingAccount> baList){
        double sum = 0;
        for (BankingAccount obj : baList){
            sum += obj.getBalance();
        }
        return sum;
    }
//    POJO - class with only getters and setters methods
}
//no classses with duplicate name within the same package

//    in CollectionOfObjects class create a static method called calculateTotalBalanceOfAllAcc that
//takes a list of all acc as a param and it sums up a balance of every acc and returns
//the total balance of all accs. call the mathod in the main method and pass the allAcc list
//and print out the result
class BankingAccount{
    private String name;
    private double balance;
    public BankingAccount(String name, double balance){
this.name = name;
this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


}