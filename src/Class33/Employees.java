package Class33;

public class Employees {
    public static void main(String[] args) {

    }
}
class Employee{
    private int id;
    private String name;
    private double salary;
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double calculateSalary() {
        return salary;
    }
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        //System.out.println("Calculated Salary: " + calculateSalary);
    }
}
class Manager extends Employee {
    private double bonus;
    public Manager(int id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }
    @Override
    public double calculateSalary() {
        return super.calculateSalary() + bonus;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Bonus: " + bonus);
        //    System.out.println("Calculated Salary: " + calculateSalary());
    }
}
class Developer extends Employee {
    private int hoursWorked;
    public Developer(int id, String name, double salary, int hoursWorked) {
        super(id, name, salary);
        this.hoursWorked = hoursWorked;
    }
    @Override
    public double calculateSalary() { //160 per month
        return super.calculateSalary() - (super.calculateSalary() -(hoursWorked * super.calculateSalary() / 160));
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Hours Worked: " + hoursWorked);
        //    System.out.println("Calculated Salary: " + calculateSalary());
    }
}