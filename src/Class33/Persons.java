package Class33;

public class Persons {
    public static void main(String[] args) {

    }
}
class Person{
    public String name;
    public int age;
    public double height;
    public double weight;
    public Person(String name, int age){
        this(name, age, 0.0, 0.0);
    }
    public Person(){
    }
    public Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
}
class Student extends Person{
    String studentId;
    int gradeLevel;
    double GPA;
    String major;
    public Student(String name, int age, double height, double weight, String studentId,
                   int gradeLevel, double GPA, String major){
        super(name, age, height, weight);
        this.studentId = studentId;
        this.gradeLevel = gradeLevel;
        this.GPA = GPA;
        this.major = major;
    }
    public Student(String name, int age, double height, double weight){
        super(name, age, height, weight);
        this.studentId = "N/A";
        this.major = "N/A";
    }
    public Student(String name, int age, String studentId, int gradeLevel){
        super(name, age);
        this.studentId = studentId;
        this.gradeLevel = gradeLevel;
        this.major = "N/A";
    }
    public Student(String name, int age){
        super(name, age);
        super.height = 0.0;
        super.weight = 0.0;
        this.studentId = "N/A";
        this.major = "N/A";
    }
    public Student(){
        super.name = "N/A";
        super.age = 0;
        super.height = 0.0;
        super.weight = 0.0;
        this.studentId = "N/A";
        this.major = "N/A";
    }
}