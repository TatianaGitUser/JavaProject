package Class34;

public class HW_Drinks_AbstractPractice {
    public static void main(String[] args) {
Drink coffee= new Coffee("Latte", 2.49, "medium");
coffee.serve();


    }
}
abstract class Drink{
    String name;
    double price;
    public Drink(String name, double price){
        this.name = name;
        this.price = price;
    }
    public abstract void serve();
}
class Coffee extends Drink{
    String strength;
    public Coffee(String name, double price, String strength){
        super(name, price);
        this.strength = strength;
    }
    @Override
    public void serve(){
        System.out.println("Serving a cup of "+name);
    }
}
class Juice extends Drink{
    String flavor;
    public Juice(String name, double price, String flavor){
        super(name, price);
        this.flavor = flavor;
    }
    @Override
    public void serve(){
        System.out.println("Serving a glass of juice");
    }
}
