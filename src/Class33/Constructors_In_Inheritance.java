package Class33;

public class Constructors_In_Inheritance {
    public static void main(String[]args){
Subclass obj = new Subclass();
Subclass obj2 = new Subclass(2, " Hey ");
Subclass obj3 = new Subclass(" Hey ");
    }
}
//every class has an implicit default constructor with no arguments
class Superclass{
    public int num;
public Superclass(){
System.out.println(("Default constructor from a parent class"));
}
public Superclass(int a, String b){
    System.out.println(("two param constructor from a parent class"+a+b));

}
}
//the first statement in the constructor must be a call to a parent constructor

//super() keyword - is a way to call a parent constructor
//this() -> is used to call other constructors within the same class

//when you don't have a default constructor in the parent class ->
//-> you must call a constructor of a parent class explicitly(by hand)
class Subclass extends Superclass{
public Subclass() {//default constructors have an implicit call to default constructor
    // of a parent class
    System.out.println(("Default constructor from a child class"));
    super.num = 1000;
}
    public Subclass(int a, String b) {
        System.out.println(("two param constructor from a child class" + a + b));
    }
public Subclass(String b){
    super(2, b);
    System.out.println("one param constructor from a child class "  +b);
}
}
//super keyword with no params is used to access accessible instance variables from a parent class
//from inside the child class