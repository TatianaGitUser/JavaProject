package Class32;
import java.util.*;
public class PlatformForE_Commerce {
    public static void main(String[] args) {

    }
}
class Product{
    private int productId;
    private String name;
    private double price;
    public Product(String name, double price){
        this.name = name;
        if(price>0){
            this.price = price;
            productId++;
        }
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getPrice(){
        return price;
    }
    public int getProductId(){
        return productId;
    }
    public void setPrice(double price){
        this.price = price;
    }
}
class Customer2{
    private int customerId;
    private String name;
    private String email;
    public Customer2(String name, String email){
        this.name = name;
        this.email = email;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getEmail(){
        return email;
    }
    public int getCustomerId(){
        return customerId;
    }
    public void setEmail(String email){
        this.email = email;
    }
}
class Order{
    private int orderId;
    private Customer customer;
    private ArrayList<Product> products;
    public Order(Customer customer, ArrayList<Product> products){
        this.customer = customer;
        this.products = new ArrayList<>();
    }
    public Customer getCustomer(){
        return customer;
    }
    public double getTotalPrice(){
       double totalPrice = 0;
        for(Product product : products){
            totalPrice+=product.getPrice();
        }return totalPrice;
    }
    public void addProduct(Product product){
        products.add(product);
    }
    public void removeProduct(int productId){
        products.remove(productId);
    }
    public void setCustomer(Customer customer){
        this.customer = customer;
    }
}