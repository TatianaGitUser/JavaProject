package Class32;

public class PhoneListing {
    public static void main(String[] args) {
Phone one = new Phone();
one.increasePrice(100);
System.out.println(one.getPrice());
    }
}
class Phone{
    private String brand;
    private String model;
    private int price;

        public Phone(String brand, String model, int price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    public Phone (){

    }
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public int getPrice(){
        return price;
    }
    public void setBrand(String brand){
        if(brand.length()>1){
            this.brand = brand;
        }
    }
    public void setModel(String model){
        if(model.length()>1){
            this.model = model;
        }
    }
    public void setPrice(int price){
        if(price>0){
            this.price = price;
        }
    }
    public void displayPhoneDetails(){
        System.out.println("Brand: "+ brand + ", Model: "+model+", Price: "+price);
    }
    public void call(String phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    public void sendMessage(String phoneNumber, String message){
        System.out.println("Sending message to "+phoneNumber+": Hello, how are you?");
    }
    public void increasePrice(int amount){
        if(amount>0){
            price+=amount;
        }
    }
}