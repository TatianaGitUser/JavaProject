package Class31_Maps;

import java.util.HashMap;
import java.util.Map;

public class Class31_7_Size_And_IsEmpty {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();

        students.put(1, "Elon Musk");
        students.put(2, "Steve Jobs");
        students.put(121, "Stacy Rodriguez");
        students.put(4, "Julia Lopez");

        System.out.println(students.size());//how many entries(4 in this example)

//        isEmpty ->true if the map has no entries, false -> if there's at least 1 entry

        System.out.println(students.isEmpty());

        if(!students.isEmpty()){
            System.out.println("has values");
        }
    }
}
