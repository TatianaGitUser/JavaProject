package Class32;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LibraryClass {
    public static void main(String[] args) {
        Map <String, String> openHours1 = new HashMap<>();
        openHours1.put("Monday","7am-9pm");


Library one = new Library("Seattle Library", openHours1);
System.out.println(one.getName());
    }
}
class Library{
    private Employee employee;
    private String name;
    private Map<String, String> openHours;
    private Set<Floor> floors = new HashSet<>();

    public Library(String name, Map openHours){
        if(name.length()>=4){
            this.name = name;
        }
        if(openHours.size()==7){
            this.openHours = openHours;
        }
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        if(name.length()>=4){
            this.name = name;
        }
    }
    public Employee getEmployee(){
        return employee;
    }
    public void setEmployee(Employee employee){
        this.employee = employee;
    }
    public Map getOpenHours(){
        return openHours;
    }
    public void setOpenHours(Map arg0){
        if(openHours.size()==7){
            this.openHours = openHours;
        }
    }
    public Set getFloors(){
        return floors;
    }
    public void setFloors(Set floors){
        this.floors = floors;
    }
}
class Employee1{
    private String title;
    private int age;
    private double salary;
    private Floor floor;
    public Employee1(String title, int age, double salary, Floor floor){
        if(title.length()>=5){
            this.title = title;
        }
        if(age>= 18 && age<= 75){
            this.age = age;
        }
        // if(salary>=18000.0 && salary<=57000.0){
        this.salary = salary;
        // }
        if(floor != null){
            this.floor = floor;
        }
    }
    public void setAge(int age){
        //   if(age>= 18 && age<= 75){
        this.age = age;
        // }
    }
    public void setSalary(double salary){
        //   if(salary>=18000.0 && salary<=57000.0){
        this.salary = salary;
        // }
    }
    public String getTitle(){
        return title;
    }
    public int getAge(){
        return age;
    }
    public double getSalary(){
        return salary;
    }
    public Floor getFloor(){
        return floor;
    }
    public void setTitle(String title){
        if(title.length()>=5){
            this.title = title;
        }
    }
    public void setFloor(Floor floor){
        if(floor != null){
            this.floor = floor;
        }
    }
}
class Floor{
    private int numberOfRooms;
    private String floorName;
    private boolean isBusy;
    public Floor(int numberOfRooms, String floorName, boolean isBusy){
        // if(numberOfRooms>0 && numberOfRooms<20){
        this.numberOfRooms = numberOfRooms;
        // }
        this.floorName = floorName;
        this.isBusy = isBusy;
    }
    public void setNumberOfRooms(int numberOfRooms){
        //   if(numberOfRooms>0 && numberOfRooms<20){
        this.numberOfRooms = numberOfRooms;
        // }
    }
    public String getFloorName(){
        return floorName;
    }
    public int getNumberOfRooms(){
        return numberOfRooms;
    }
    public boolean isBusy(){
        return isBusy;
    }
    public void setFloorName(String floorName){
        this.floorName = floorName;
    }
    public void setBusy(boolean isBusy){
        this.isBusy = isBusy;
    }
}