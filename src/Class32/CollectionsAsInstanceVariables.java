package Class32;

import java.util.ArrayList;
import java.util.List;

public class CollectionsAsInstanceVariables {
    public static void main(String[] args) {
        Employee one = new Employee("Elon", 52, "Executive", 1000000.00);
        System.out.println(one.getProjects());

        one.addProject("Tesla");
        System.out.println(one.getProjects());
        one.addProject("SpaceX");
        System.out.println(one.getProjects());
        one.addProject("BoringCompany");
        one.addProject("NeuraLink");
        one.addProject("Twitter");
        System.out.println(one.getProjects());
//now a sinle variable (one in this case) stores all of this new String projects, age,
// name of employee
    }
}
//Employee{
//  name
//age
//department
class Employee{
    private String name;
    private int age;
    private String department;
    private double salary;
    private List<String> projects = new ArrayList<>();
    public Employee(String name, int age, String department, double salary) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }
    public Employee(String name, int age, String department, double salary, List<String> projects){
        this(name, age, department, salary);
        this.projects = projects;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    } public List<String>getProjects(){
        return projects;
    }
    public void addProject(String projectName){
        projects.add(projectName);
    }


}