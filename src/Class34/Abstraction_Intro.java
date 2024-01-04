package Class34;

public class Abstraction_Intro {
    public static void main(String[] args) {
Animal a = new Dog();
a.makeSound();
Animal c = new Cat();
c.makeSound();
    }
}
//1. when you want to restrict the ability to create objects from parent class
// Abstract classes can't be instantiated
// You can't create an object from an abstract class
// The whole purpose of the Abstract class is to serve as a parent class that stores all
// common behaviours and properties

 abstract class Animal{
//2. when you want to create a method in the parent class to enable polymorphism
//   and you know that every single child class MUST override that method's logic ->
//   you can declare methods abstract

//     abstract methods are methods that can only be declared in Abstract class or interface
//     abstract methods don't have a body;
//     abstarct methods are meant to be overriden in concrete(first not abstract subclass)
//     subclasses
     public abstract void makeSound();
}
//if subclass is extending the abstract class that has abstract methods
//the concrete subclass must override all inherited abstract methods.
//otherwise, the code doesn't compile
class Dog extends Animal{
public void makeSound(){
    System.out.println("Woof");
}
}
class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Meow");
    }

}
