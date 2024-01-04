package Class32;

public class Amazon_Product {
//    instance variables - characteristics of an object == properties of a class
//    instance variables are defined on class level (scope). ***They have default values***
//    *****All whole numbers have '0' default value
//    ****decimal have '0.0' default value
//    ****boolean has 'false' default value
//    ****all object have 'null' default value

    String name; //->instance variable
    double price;//->instance variable
    String description; //->instance variable(property)
//    this is a blueprint of an object, or properties of an Amazon class
}
class Main{
//    purpose of this class - to run a program
public static void main(String[] args) {
    Amazon_Product var = new Amazon_Product();
    var.name = "iPhone14";
    var.price = 999.99;
    var.description = "256 GB";

    System.out.println(var.name);
    System.out.println(var.price);
    System.out.println(var.description);
    System.out.println("----------------------");


    Amazon_Product var2 = new Amazon_Product();
    var2.name = "Google Pixel";
    var2.price = 599.99;
    var2.description = "Google it";

    System.out.println(var2.name);
    System.out.println(var2.price);
    System.out.println(var2.description);
System.out.println("----------------------");
//when you create an object all properties will get default values first
    Amazon_Product var3 = new Amazon_Product();
    System.out.println(var3.name);
    System.out.println(var3.price);
    System.out.println(var3.description);
}
}

