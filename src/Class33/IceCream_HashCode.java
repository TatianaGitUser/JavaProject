package Class33;

import java.util.*;

public class IceCream_HashCode {
    public static void main(String[] args) {
        List<String> ingredients1 = Arrays.asList("chocolate", "caramel", "nuts");
        List<String> ingredients2 = Arrays.asList("vanilla", "strawberry", "chocolate");
        List<String> ingredients3 = Arrays.asList("mint", "chocolate chips", "fudge");
        List<String> ingredients4 = Arrays.asList("caramel", "chocolate", "nuts");
        List<String> ingredients5 = Arrays.asList("chocolate", "nuts", "caramel");
        List<String> ingredients6 = Arrays.asList("chocolate", "fudge", "chocolate chips");

        IceCreamFlavor flavor1 = new IceCreamFlavor("Choco Caramel Crunch", "chocolate", ingredients1);
        IceCreamFlavor flavor2 = new IceCreamFlavor("Chocolate Swirl", "chocolate", ingredients2);
        IceCreamFlavor flavor3 = new IceCreamFlavor("Mint Chocolate Chip", "chocolate", ingredients3);
        IceCreamFlavor flavor4 = new IceCreamFlavor("Caramel Delight", "chocolate", ingredients4);
        IceCreamFlavor flavor5 = new IceCreamFlavor("Caramel Delight", "chocolate", ingredients5);
        IceCreamFlavor flavor6 = new IceCreamFlavor("Chocolate Dream", "chocolate", ingredients6);

        System.out.println("Flavor 1 hash code: " + flavor1.hashCode());
        System.out.println("Flavor 2 hash code: " + flavor2.hashCode());
        System.out.println("Flavor 3 hash code: " + flavor3.hashCode());
        System.out.println("Flavor 4 hash code: " + flavor4.hashCode());
        System.out.println("Flavor 5 hash code: " + flavor5.hashCode());
        System.out.println("Flavor 6 hash code: " + flavor6.hashCode());

        System.out.println("Flavor 1 equals Flavor 2: " + flavor1.equals(flavor2));
        System.out.println("Flavor 1 equals Flavor 3: " + flavor1.equals(flavor3));
        System.out.println("Flavor 4 equals Flavor 5: " + flavor4.equals(flavor5));
        System.out.println("Flavor 4 equals Flavor 6: " + flavor4.equals(flavor6));
        System.out.println("Flavor 5 equals Flavor 6: " + flavor5.equals(flavor6));
    }
}
class IceCreamFlavor{
    int id = 1000;
    String name;
    String base;
    List<String> ingredients;
    public IceCreamFlavor(String name, String base, List<String> ingredients){
        this.name = name;
        this.base = base;
        this.ingredients = ingredients;
        id++;
    }
    @Override
    public int hashCode(){
        return Objects.hash(name, base);
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        IceCreamFlavor flavor = (IceCreamFlavor) obj;
        return base.equalsIgnoreCase(flavor.base) &&
                name.equalsIgnoreCase(flavor.name);

    }
}