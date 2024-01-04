package Class32;

import java.util.ArrayList;
import java.util.List;

public class AccountClass {
    public static void main(String[] args) {

    }
}
class Account{
    public static final String bankName = "XYZ Bank";
    public static int totalAccounts;
    public String accountNumber;
    public List<String> accountHolders;
    public List<Double>transactions = new ArrayList<>();

    public Account(String accountNumber, List<String> accountHolders){
        this.accountNumber = accountNumber;
        this.accountHolders = accountHolders;
        totalAccounts++;
    }
    public void addTransaction(double amount){
        transactions.add(amount);
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public List<String> getAccountHolders(){
        return accountHolders;
    }
    public List<Double> getTransactions(){
        return transactions;
    }
    public double getBalance(){
        double sum = 0;
        for(double i : transactions){
            sum +=i;
        }return sum;
    }
    public boolean hasAccountHolder(String accountHolder){
        boolean hasAccount = false;
        for(String name: accountHolders){
            if(name.equals(accountHolder)){
                hasAccount = true;
                break;
            }
        }return hasAccount;
    }
}