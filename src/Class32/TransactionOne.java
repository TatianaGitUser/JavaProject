package Class32;

public class TransactionOne {
    public static void main(String[] args) {
        Transaction one = new Transaction("757646", 76);
        one.displayTransactionDetails();//instance method
        Transaction.setBankName("ABC");//static method
        System.out.println(Transaction.getBankName());
       boolean trueOr =  one.processTransaction();
       System.out.println(trueOr);
    }
}
class Transaction{
    private static int transactionCount;
    private static String bankName;
    private String transactionId;
    private String accountNumber;
    private double amount;
    private boolean isSuccessful;
    public Transaction(String transactionId, String accountNumber, double amount, boolean isSuccessful){
        this.transactionId = transactionId;
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.isSuccessful = isSuccessful;
    }
    public Transaction(String accountNumber, double amount){
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.transactionId = "T"+(++transactionCount);
    }
    public static String getBankName(){
        return bankName;
    }
    public static void setBankName(String bankNameA){
        bankName = bankNameA;
    }
    public boolean processTransaction() {
        if (Integer.parseInt(transactionId.substring(1)) % 2 == 0) {
            isSuccessful = true;
        }
        return isSuccessful;
    }
    public void displayTransactionDetails(){
        System.out.println("Transaction Details:\nTransaction ID: "+transactionId+
                "\nAccount Number: "+accountNumber+"\nAmount: $"+amount+"\nSuccessful: "+isSuccessful);
    }

    public static double calculatePercentage(double percentage, Transaction transaction){
        double percentValue = (percentage*0.01)*transaction.amount;
        if(transaction.isSuccessful){
            return percentValue;
        }else{
            return 0;
        }
    }
    public static int getTransactionCount(){
        return transactionCount;
    }
}
