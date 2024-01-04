package Class32;

import java.util.ArrayList;
import java.util.List;

public class ObjectsAsInstanceVariables {
    public static void main(String[] args) {
//        create address for customer
        Address c1Address = new Address("123 Main", "Norfolk", 23546, "USA");
        Address c2Address = new Address("45 Park ave", "Chicago", 69001, "USA");
        Address c3Address = new Address("1 Beverly Hills st", "Los Angeles", 90090, "USA");

        //create banking accounts for customer
        Account1 johnDoeCheckingAccount = new Account1("54544787", 24444);
        Account1 johnDoeSavingsAccount = new Account1("054008899", 13444);
//store all customer's accounts in a List<Account1>

        List<Account1>johnDoeAccounts = new ArrayList<>();
johnDoeAccounts.add(johnDoeCheckingAccount);
johnDoeAccounts.add(johnDoeSavingsAccount);

//create banking accounts for Elon Musk
        Account1 elonChecking = new Account1("78685768", 540000);
        Account1 elonSavings = new Account1("11223355", 1200300);
List<Account1>elonMuskAccounts = new ArrayList<>();
elonMuskAccounts.add(elonSavings);
elonMuskAccounts.add(elonChecking);

//create accounts for Jessica
        Account1 jessicaChecking = new Account1("9889545", 4455.09);
        Account1 jessicaSavings = new Account1("75232635", 78065.23);
        Account1 jessicaSavings2 = new Account1("752566325", 8065.29);
        List<Account1>jessicaAccounts = new ArrayList<>();
        jessicaAccounts.add(jessicaChecking);
        jessicaAccounts.add(jessicaSavings);
        jessicaAccounts.add(jessicaSavings2);

//creating all customers
        Customer c1 = new Customer("John Doe", c1Address, johnDoeAccounts);
        Customer c2 = new Customer("Elon Musk", c2Address, elonMuskAccounts);
        Customer c3 = new Customer("Jessica", c3Address, jessicaAccounts);

//        adding all customers to a list
        List<Customer> customersList = new ArrayList<>();
        customersList.add(c1);
        customersList.add(c2);
        customersList.add(c3);
//creating one bank with list of customers where each customer has a list of accounts
     Bank chase = new Bank("Chase", customersList);

     printAllAccounts(chase);
   double result = depositFunds(chase, "Elon Musk","11223355", 800.0);
   System.out.println(result);
//        System.out.println(chase.getName());
//        List<Customer> cList = chase.getCustomerList();
//        for (Customer obj : cList) {
//            if (obj.getName().equalsIgnoreCase("Elon musk")) {
//                System.out.println(obj.getName());
//                System.out.println(obj.getAddress().getZipCode());
//                System.out.println(obj.getAddress().getCity());
//                System.out.println(obj.getAddress().getCountry());
//                System.out.println(obj.getAddress().getStreet());//method chaining
//            }
//        }
    }
//create a method that will print out all accounts of all customers
    public static void printAllAccounts(Bank bank){
        List<Customer>customersList = bank.getCustomerList();
        for(Customer customerObj : customersList){
            System.out.println(customerObj.getName());

            List<Account1> account1ListN = customerObj.getAccountsList();
            for(Account1 accountObj : account1ListN){
                System.out.println("Account number: " + accountObj.getAccountNumber());
                System.out.println("Balance: "+ accountObj.getBalance());
            }
        }
    }
//    create a method to deposit that takes: customer name, account number, deposit amount
//    return the updated balance
    public static double depositFunds (Bank bank, String customerName, String accountNumber, double depositAmount){
        List<Customer> customerList = bank.getCustomerList();
        for(Customer customerObj:customerList){
            if(customerObj.getName().equalsIgnoreCase(customerName)){
               List<Account1>account1List =  customerObj.getAccountsList();
               for(Account1 accountObj : account1List){
                   if(accountObj.getAccountNumber().equalsIgnoreCase(accountNumber)){
                       accountObj.deposit(depositAmount);
                     return accountObj.getBalance();
                   }
               }
            }
        }
        return -1;
    }
}
class Customer{
    private String name;
    private Address address;
    private List<Account1>accountsList;
    public Customer(String name, Address address, List<Account1>accountsList){
        this.name = name;
        this.address = address;
        this.accountsList = accountsList;
    }
    public Address getAddress() {
        return address;

    }

    public List<Account1> getAccountsList() {
        return accountsList;
    }

    public void setAccountsList(List<Account1> accountsList) {
        this.accountsList = accountsList;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
class Address{
    public Address(String street, String city, int zipCode, String country) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
        this.country = country;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public int getZipCode() {
        return zipCode;
    }
    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    private String street;
    private String city;
    private int zipCode;
    private String country;
}
class Bank{
    private String name;
    private List<Customer> customerList;
    public Bank(String name, List<Customer> customerList) {
        this.name = name;
        this.customerList = customerList;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Customer> getCustomerList() {
        return customerList;
    }
    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }
}
class Account1{
   private String accountNumber;
    private double balance;
    public Account1(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
public void deposit(double depositAmount){
        balance+=depositAmount;
}
public void withdraw (double withdrawAmount){
        if(withdrawAmount>balance){
            System.out.println("Insufficient funds");
        }else{
            balance-=withdrawAmount;
        }
}
}