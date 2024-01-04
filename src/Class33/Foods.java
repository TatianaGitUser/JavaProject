package Class33;

public class Foods {
    public static void main(String[] args) {
        System.out.println("\nTesting cookFood() method:");
        Cook chef = new Chef();
        chef.cookFood(); // Output: Cooking Pasta for 90 minutes.
        System.out.println("Chef's dish: " + chef.name + ", Time: " + chef.time);

        Cook baker = new Baker();
        baker.cookFood(); // Output: Baking Cake for 180 minutes.
        System.out.println("Baker's dish: " + baker.name + ", Time: " + baker.time);
    }
}
class Cook{
    String name;
    int time;
    Cook(String name, int time){
        this.name =name;
        this.time = time;
    }
    void cookFood(){
        System.out.println("Testing cookFood() method:");
    }
}
class Chef extends Cook {
    Chef() {
        super("Pasta", 90); // Calls the default constructor of the Cook class
    }
    @Override
    public void cookFood() {
    }
}
class Baker extends Cook{
    public Baker(){
        super("Cake", 180);
    }
    @Override
    public void cookFood(){
    }
}