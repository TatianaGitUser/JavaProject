package Class31_Maps;

import java.util.HashMap;
import java.util.Map;

public class Class31_6_ReplaceMethod {
    public static void main(String[] args) {
//        put does the same only if the value doesn't exist in map - replace WILL NOT OVERWRITE THE VALUE
        Map<Integer, String> students = new HashMap<>();

        students.put(1, "Elon Musk");
        students.put(2, "Steve Jobs");
        students.put(121, "Stacy Rodriguez");
        students.put(4, "Julia Lopez");
//        replace  takes 2 variables(key, value); and returns the old value

        String oldValue = students.replace(2, "Sam Altman");//you replace with new value but can save
//         ********************************     the old value in new variable while repacing the old value

        System.out.println(students);
        System.out.println(oldValue+ " replaced");

        String oldValue2 = students.replace(5, "Bill Gates");
        System.out.println(students);
        System.out.println(oldValue2);// returns null if the value did not exist
    }
}
