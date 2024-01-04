package Class30;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;
public class Class30_1_InitializeSets {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
//       unoredered, unique
        Set <String> namesSet = new HashSet<>();
//oredered based on what ordering logic you provided
        Set <String> treeset = new TreeSet<>();
//       ordered based on insertion order
        Set <String> linkedSet = new LinkedHashSet<>();

        List<String> list = new ArrayList<>();
        list.add("HELLO");
        list.add("Hi");
        list.add("Privet");
        list.add("Dobrogo dnya");
        list.add("Hi");
        System.out.println(list);
        Set <String> set = new HashSet<>(list); //--> it is now converted to hashset
        System.out.println(set);
        System.out.println("------------------");

        Set <String> set2 = new LinkedHashSet<>(list);
        System.out.println(set2);
    }
}
