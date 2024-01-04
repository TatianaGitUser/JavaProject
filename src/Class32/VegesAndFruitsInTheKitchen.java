package Class32;
import java.util.*;
public class VegesAndFruitsInTheKitchen {
    public static void main(String[] args) {
Kitchen one = new Kitchen();
Fruits one1 = new Fruits("Banana", "01:17", "in 2 weeks");
Veges tomato = new Veges("Tomato", "17:45", "tomorrow");
Fruits apple = new Fruits("Apple", "17:45", "in 2 weeks");
one.addFruit(apple, 10.0);
one.addVevetable(tomato, 4.5);
one.addFruit(one1, 2.5);
one.removeFruit(one1);
System.out.println(one);
    }
}
class Kitchen{
    private Map<Veges, Double> vegesInventory;
    private Map<Fruits, Double> fruitsInventory;
    public Kitchen(){
        vegesInventory =  new HashMap<>();
        fruitsInventory =  new HashMap<>();
    }
    public void addVevetable(Veges vege, double weight){
        vegesInventory.put(vege, weight);
    }
    public void addFruit(Fruits fruit, double weight){
        fruitsInventory.put(fruit, weight);
    }
    public Map getVegeInventory(){
        return vegesInventory;
    }
    public Map getFruitInventory(){
        return fruitsInventory;
    }
    public void removeVegetable(Veges vege){
        vegesInventory.remove(vege);
    }
    public void removeFruit(Fruits fruit){
        fruitsInventory.remove(fruit);
    }
}
class Veges{
    private String name;
    private final String arrivalTime;
    private final String expireDate;
    public Veges(String name, String arrivalTime, String expireDate){
        this.name = name;
        this.arrivalTime = arrivalTime;
        this.expireDate = expireDate;
    }
    public String getName(){
        return name;
    }
    public String getArrivalTime(){
        return arrivalTime;
    }
    public String getExpireDate(){
        return expireDate;
    }
}
class Fruits{
    private String name;
    private final String arrivalTime;
    private final String expireDate;
    public Fruits(String name, String arrivalTime, String expireDate){
        this.name = name;
        this.arrivalTime = arrivalTime;
        this.expireDate = expireDate;
    }
    public String getName(){
        return name;
    }
    public String getArrivalTime(){
        return arrivalTime;
    }
    public String getExpireDate(){
        return expireDate;
    }
}