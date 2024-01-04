package Class32;

public class FruitList {
    public static void main(String[] args) {
Fruit one = new Fruit("banana", 9);
System.out.println(one.isOrganic);
System.out.println(one.name);
    }
}
class Fruit{
    public String name;
    public int quantity;
    public double pricePerFruit;
    public boolean isOrganic;


    public Fruit(String name){
        this(name, 0, 0.0, false);
    }
    public Fruit(String name, int quantity){
        this(name, quantity, 0.0);
    }
    public Fruit(String name, int quantity, double pricePerFruit){
        this(name, quantity, pricePerFruit, false);
    }

    public Fruit(String name, int quantity, double pricePerFruit, boolean isOrganic){
        this.name = name;
        this.quantity = quantity;
        this.pricePerFruit = pricePerFruit;
        this.isOrganic = isOrganic;
    }
}