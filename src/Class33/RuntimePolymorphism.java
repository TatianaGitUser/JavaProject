package Class33;

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Animal1 a = new Animal1();
        a.makeSound();

        Animal1 c = new Cat();
        c.makeSound();

        Animal1 d = new Dog1();
        d.makeSound();
    }
}
//first check if the datatype class contains the method you're trying to call
//if it doesn't - your code is not going to compile

class Animal1{
    public void makeSound(){
        System.out.println("Parent class");
    }
}
class Cat extends Animal1{
    @Override
    public void makeSound(){
        System.out.println("Meow!");
    }
}
class Dog1 extends Animal1{
    @Override
    public void makeSound(){
        System.out.println("Woof!");
    }
}