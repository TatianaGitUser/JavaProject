package Class32;

public class FinalKeyword {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println(c.calculateCircumference());
    }
}
class Circle{
//    "Final" keyword can be used with variables, classes and methods.
//    "Final" keyword with variables allows the value of the  variable to be assigned
//    only once
    private final double PI = 3.14159;
    private double radius;

    public Circle(double radius){
        this.radius = radius;

    }
    public double calculateCircumference(){
        return 2 * PI *radius;
    }

}