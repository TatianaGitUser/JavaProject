package Class31_Maps;

import java.util.HashMap;
import java.util.Map;

public class Class31_3_GetMethod {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();

        students.put(1, "Elon Musk");
        students.put(2, "Steve Jobs");
        students.put(121, "Stacy Rodriguez");
        students.put(4, "Julia Lopez");
//        get method takes in the key value
//        return type of get method is dynamic, it will return the data type that was set in
//        initialization
       String name1 = students.get(1);
        System.out.println(name1);
//        OR
        System.out.println(students.get(121));
        System.out.println(students.get(5));//if the key does not exist, it'll return "null"

        Map<String, Double> reportedIncome = new HashMap<>();
        reportedIncome.put("111-88-9999", 100000.00);
        reportedIncome.put("115-98-7779", 130000.00);
        reportedIncome.put("117-88-9659", 120000.00);
        System.out.println(reportedIncome.get("115-98-7779"));

        double salary1 = reportedIncome.get("117-88-9659");
        System.out.println(salary1);
    }
}
