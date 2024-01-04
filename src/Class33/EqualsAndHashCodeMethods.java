package Class33;

import java.util.Objects;

public class EqualsAndHashCodeMethods {
    public static void main(String[] args) {
Person2 p = new Person2("Elon", 52);
Person2 p2 = new Person2("Elon", 52);
System.out.println(p == p2);//by default comparing if two objects are the same.
//  checks if both objects are both pointing to the same memory location.
System.out.println(p.equals(p2));//by default comparing if two objects are the same.
//     checks if both objects are pointing to the same memory location.

    }
}
class Person2{
    private String name;
private int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    @Override
    public int hashCode(){
        return Objects.hash(name, age);//always override equals () method along with
                                        //hash code method
    }
//    if the object in the params has the instance variable with the same value
//    of my current object,
    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if(obj == null||getClass() != obj.getClass()){
            return false;
        }
        Person2 other = (Person2) obj;//down casting
        return Objects.equals(name, other.getName())&& age == other.getAge();
    }
}