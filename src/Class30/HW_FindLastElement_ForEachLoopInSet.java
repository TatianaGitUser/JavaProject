package Class30;

import java.util.HashSet;
import java.util.Set;

public class HW_FindLastElement_ForEachLoopInSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        set.add("5");
        set.add("Last Element");
        System.out.println(findLast(set));
    }
    public static String findLast(Set<String> set){
        String result = "";
        for (String var : set){
            result = var;
        }
        return result;
    }
}
