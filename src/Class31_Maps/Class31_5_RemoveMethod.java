package Class31_Maps;

import java.util.HashMap;
import java.util.Map;

public class Class31_5_RemoveMethod {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();

        students.put(1, "Elon Musk");
        students.put(2, "Steve Jobs");
        students.put(121, "Stacy Rodriguez");
        students.put(4, "Julia Lopez");

        String removedValue = students.remove(2);
        System.out.println("Removed: " + removedValue);
        System.out.println(students);

        System.out.println(students.remove(5));// removing non-existent key returns "null"
        System.out.println(students);
    }
}
