package Class32;

public class Crypto {
    public static void main(String[] args) {
CryptoCalculations one = new CryptoCalculations("Bitcoin", "BTC", 60000.00, 1000000000000L, 1);
one.printCryptoDetails();
System.out.println(one.calculateTotalValue(5));
    }
}
class CryptoCalculations{
    private String name;
    private String symbol;
    private double price;
    private long marketCap;
    private int rank;

    public CryptoCalculations(String name, String symbol, double price, long marketCap, int rank){
        this.name = name;
        this.symbol = symbol;
        this.price = price;
        this.marketCap = marketCap;
        this.rank = rank;
    }
    public String getName(){
        return name;
    }
    public String getSymbol(){
        return symbol;
    }
    public double getPrice(){
        return price;
    }
    public long getMarketCap(){
        return marketCap;
    }
    public int getRank(){
        return rank;
    }

    public void setName(String name){
        if(name.length()>=3){
            this.name = name;
        }else{
            System.out.println("Name must be at least 3 characters long.");
        }
    }
    public void setSymbol(String symbol){
        if(symbol.length()>=3 && symbol.length()<=5){
            for(int i = 0; i<symbol.length()-1; i++){
                char currentChar = symbol.charAt(i);
                if(Character.isUpperCase(currentChar)){
                    this.symbol = symbol;
                }
            }
        }
    }
    public void setPrice(double price){
        if(price>0){
            this.price = price;
        }else{
            System.out.println("Price cannot be negative.");
        }
    }
    public void setMarketCap(long marketCap){
        if(marketCap>0){
            this.marketCap = marketCap;
        }
    }
    public void setRank(int rank){
        if(rank>0){
            this.rank = rank;
        }else{
            System.out.println("Rank cannot be negative.");
        }
    }
    public double calculateTotalValue(double quantity){
        double value = 0.0;
        if(quantity>0){
            value = quantity*price;
        }else{
            System.out.println("Quantity cannot be negative.");
        }
        return value;
    }
    public void printCryptoDetails(){
        System.out.println(name + " " + "("+symbol+")"+ " - Price: "+price+ " USD, Market Cap: "+marketCap+ ", Rank: "+rank);
    }
}