package Class33;

public class Games {
    public static void main(String[] args) {

    }
}
class GameStore{
    public double calculateTotalPrice(Game[]games){
        double totalPrice = 0.0;
        for(Game game : games){
            totalPrice += game.getPrice();
        }
        return totalPrice;
    }
}
class Game{
    String title;
    double price;
    public Game(String title, double price){
        this.title = title;
        this.price = price;
    }
    public String getTitle(){
        return title;
    }
    public double getPrice(){
        return price;
    }
}
class ActionGame extends Game{
    public ActionGame(String title, double price){
        super(title, price);
    }
}
class PuzzleGame extends Game{
    public PuzzleGame(String title, double price){
        super(title, price);
    }
}
