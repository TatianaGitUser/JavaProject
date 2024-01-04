package Class33;

public class OverloadingVSOverridingPractice {
    public static void main(String[] args) {
Employee2 Jack = new Salesperson("Jack", 2500.0, 8000.0);
System.out.println(Jack.calculateSalary());
    }
}
class Employee2{
    String name;
    double salary;
    public Employee2(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    public double calculateSalary(){               //
        return salary;
    }
    public double calculateSalary(double bonus){   // overloading(same name, different params
        return salary+=bonus;
    }
}
class Manager1 extends Employee2{
    public Manager1(String name, double salary){
        super(name, salary);
    }
    public double calculateSalary(){    //overriding
        return salary+=salary*0.1;
    }
}
class Salesperson extends Employee2{
    double salesAmount;
    public Salesperson(String name, double salary, double salesAmount){
        super(name, salary);
        this.salesAmount = salesAmount;
    }
    public double calculateSalary(){      //overriding
        return salary+=salesAmount*0.05;
    }
}
