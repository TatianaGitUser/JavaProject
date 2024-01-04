package Class34;

public class HW_Instruments_Abstract {
    public static void main(String[] args) {
        // Create instances of Guitar and Piano
        Guitar guitar = new Guitar(6);
        Piano piano = new Piano(88);

        // Invoke play() method on each instance
        guitar.play();
        piano.play();

        // Invoke displayInfo() method on each instance
        guitar.displayInfo();
        piano.displayInfo();
    }
}
abstract class Instrument{
    public abstract void play();
    public abstract void displayInfo();
}
class Guitar extends Instrument{
    int strings;
    public Guitar(int strings){
        this.strings = strings;
    }
    public int getStrings(){
        return strings;
    }
    @Override
    public void play(){
        System.out.println("The guitar melody");
    }
    @Override
    public void displayInfo(){
        System.out.println("This is a guitar with "+getStrings()+" strings");
    }
}
class Piano extends Instrument{
    int keys;
    public Piano(int keys){
        this.keys = keys;
    }
    public int getKeys(){
        return keys;
    }
    @Override
    public void play(){
        System.out.println("The piano melody");
    }
    @Override
    public void displayInfo(){
        System.out.println("This is a piano with "+getKeys()+" keys");
    }
}