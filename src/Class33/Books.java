package Class33;

public class Books {
    public static void main(String[] args) {

    }
}
class Book1{
    String title;
    String author;
    double price;
    Book1(){
    }
    void displayDetails(){
        System.out.println("Title: "+title+"\nAuthor: "+author+"\nPrice: $"+price);
    }
}
class EBook extends Book1{
    String format;
    EBook(){
        super();
    }
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Format: "+format);
    }
}