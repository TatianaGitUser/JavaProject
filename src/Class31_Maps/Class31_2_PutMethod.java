package Class31_Maps;

import java.util.HashMap;
import java.util.Map;

public class Class31_2_PutMethod {
    public static void main(String[] args) {
//        key = id in this example, value = names of students
//        put adds new value pair

//        put if the key already exists -> put will udate the value of key
        Map<Integer, String> students = new HashMap<>();

        students.put(1, "Elon Musk");
        students.put(2, "Steve Jobs");
        students.put(121, "Stacy Rodriguez");
        students.put(4, "Julia Lopez");
        System.out.println(students);

        students.put(1, "Bill Gates"); // updated the value of a key 1
        System.out.println(students);

//        SSN is key, income is value
        Map<String, Double> reportedIncome = new HashMap<>();
        reportedIncome.put("111-88-9999", 100000.00);
        reportedIncome.put("115-98-7779", 130000.00);
        reportedIncome.put("117-88-9659", 120000.00);
        System.out.println(reportedIncome);
    }
}
