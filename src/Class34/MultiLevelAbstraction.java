package Class34;

public class MultiLevelAbstraction {
    public static void main(String[] args) {
Product phone = new Electronics("Phone", 999.99, "IPhone 14");
Product book = new Books("American character", 99.09, "Walter Isaakson");

phone.getProductInfo();
book.getProductInfo();

System.out.println(phone.getProductType());
System.out.println(book.getProductType());

System.out.println(phone.calculateShippingCost());
System.out.println(book.calculateShippingCost());
    }
}
abstract class ShippingProvider{
    public abstract double calculateShippingCost();
}
abstract class Product extends ShippingProvider{

    private String name;
    private double price;
    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }
public abstract String getProductType();

public void getProductInfo(){
    System.out.println("Product name: "+ name);
    System.out.println("Product price: "+ price);
}
}
class Electronics extends Product{
    private String brand;
    public Electronics(String name, double price, String brand){
        super(name, price);
        this.brand = brand;
    }
    @Override
    public double calculateShippingCost(){ // this is the first "concrete" class
        return 10.0;                        // concrete - non abstract
    }
    @Override
public String getProductType(){
        return "Electronics";
}
}
class Books extends Product{
    private String author;

    public Books(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    @Override
    public double calculateShippingCost() {
        return 3.0;
    }

    @Override
    public String getProductType() {
        return "Books";
    }
}