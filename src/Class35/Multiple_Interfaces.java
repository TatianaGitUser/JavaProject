package Class35;

public class Multiple_Interfaces {
    public static void main(String[] args) {
Product product = new OnlineProduct();
Shipping product2 = new OnlineProduct();
Payment product3 = new OnlineProduct();

OnlineProduct product4 = new OnlineProduct();
product4.calculateShipping();
product4.displayInfo();
    }
}
interface Product{
void displayInfo();
}
interface Shipping{
void calculateShipping();
}
interface Payment{
void processPayment();
}
class OnlineProduct implements Product, Shipping, Payment{
    @Override
    public void displayInfo() {

    }

    @Override
    public void calculateShipping() {

    }

    @Override
    public void processPayment() {

    }
}
