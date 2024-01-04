package Class31_Maps;

import java.util.HashMap;
import java.util.Map;

public class Class31_8_ClearMethod {
    public static void main(String[] args) {

//        clears the Map, deletes all entries

        Map<Integer, String> students = new HashMap<>();

        students.put(1, "Elon Musk");
        students.put(2, "Steve Jobs");
        students.put(121, "Stacy Rodriguez");
        students.put(4, "Julia Lopez");

        System.out.println(students);

        students.clear();
        System.out.println(students);
    }
}
