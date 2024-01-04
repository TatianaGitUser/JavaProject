package Class33;

public class FinalKewordInMethods {
    public static void main(String[] args) {
//final keyword in java:
//        1. variables can be declared as final - means that the variable
//        can omly be initialized once.
//        2. Classes can be declared final - means no other class can be extended from that class
//        3. method can be declared final - means the method cannot be overriden
        Animal2 obj = new Animal2();
        String str  = obj.toString();
        System.out.println(str);
    }
}
class Animal2{
    public final void eat(){

    }
}
class Dog2 extends  Animal2{
//    public void eat() {
//
//    }
        }