package Class33;

public class ToString {
    public static void main(String[] args) {
Person1 p = new Person1("Elon", 52);
System.out.println(p.getAge());
System.out.println(p.getName());
//           ^ =
System.out.println(p.toString());
//internally println()method calls the toString method of the object
System.out.println(p);
    }
}
class Person1{
    private String name;
    private int age;

    public Person1(String name, int age) {
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
    public String toString(){
        return "name: "+name+ "\nage: "+age;
    }
}
