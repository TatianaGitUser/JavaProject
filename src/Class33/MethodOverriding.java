package Class33;

public class MethodOverriding {
    public static void main(String[] args) {
Dog d = new Dog();
d.makeSound();
Animal a = new Animal();
a.makeSound();
d.eat();
d.getNumberOfLegs();
    }
}
class Animal{
    public void getNumberOfLegs(){
        System.out.println("4 legs");
    }
    public void eat(){
        System.out.println("Eating");
    }
    public void makeSound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal{
//ovewriting-overriding
@Override
    public void makeSound(){
    System.out.println("Bark bark");
}
}