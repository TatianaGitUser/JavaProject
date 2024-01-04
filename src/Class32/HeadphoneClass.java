package Class32;

public class HeadphoneClass {
    public static void main(String[] args) {
        Headphone hp = new Headphone();
        Headphone hp1 = new Headphone();
System.out.println(Headphone.getTotalHeadphones());
Headphone.setManufacturer("Xiaomi");

    }
}
class Headphone{
    private static String manufacturer;
    private static int totalHeadphones;
    private String model;
    private double price;
    private String color;
    private boolean isWireless;

    public Headphone(String model, double price, String color, boolean isWireless){
        this.model = model;
        this.price = price;
        this.color = color;
        this.isWireless = isWireless;
    }
    public Headphone(){
        totalHeadphones++;
    }
    public static int getTotalHeadphones(){
        //    totalHeadphones =1;
        //     totalHeadphones++;
        return totalHeadphones;

    }
    public static void setManufacturer(String manufacturerr){
    manufacturer=manufacturerr;
    }
    public void displayDetails(){
        System.out.println("Model: "+model+"\nPrice: "+price+"\nColor: "+color+"\nWireless: "+isWireless);
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setColor(String color){
        this.color= color;
    }
    public void setWireless(boolean isWireless){
        this.isWireless = isWireless;
    }
}