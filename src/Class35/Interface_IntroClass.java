package Class35;

public class Interface_IntroClass {
    public static void main(String[] args) {
Shape shape = new Rectangle();
//List list = new ArrayList<>(); = polymorphism
//Map map = new HashMap<>();   are interfaces
        shape.calculateArea();
    }
}
interface Shape{
//    all variables in an interface are constants : public static final
    int i = 10;
//    by default, all methods in the interface are public and abstract
    void calculateArea();
}
//we use "implements" keyword to make a class inherit interfaces
//when we implement interface - the first concrete class must override all abstract
//methods from the interface
class Rectangle implements Shape {
@Override
    public void calculateArea(){
    System.out.println(1+1);
}
}
//when to use an Abstract clas VS an Interface?
//use abstract class - when you want to create a parent class with common instance variables and
//some instance methods plus some abstract methods

//use Interface - only when you want to create abstract methods