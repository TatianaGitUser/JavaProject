package Class32;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentsClass {
    public static void main(String[] args) {
Students one = new Students("2000");
one.addMarks("Math", 90);
System.out.println(one.getMarks());
    }
}
class Students{
    private static List<String> studentList = new ArrayList<>();
    private Map<String, Integer> marks = new HashMap<>();
    private final String yearOfBirth;
    public Students(String yearOfBirth){
        this.yearOfBirth = yearOfBirth;
    }
    public static List<String> getStudentList(){
        return studentList;
    }
    public void addStudent(String name){
        studentList.add(name);
    }
    public void addMarks(String subject, int mark){
        if(mark<0 || mark> 100){
            System.out.println("Invalid marks! Marks should be between 0 and 100.");
        }else{
            marks.put(subject, mark);
        }
    }
    public String getYearOfBirth(){
        return yearOfBirth;
    }
    public Map<String, Integer> getMarks(){
        return marks;
    }
}