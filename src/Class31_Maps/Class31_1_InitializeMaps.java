package Class31_Maps;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;

public class Class31_1_InitializeMaps {
    public static void main(String[] args) {
//        inside diamonds provide data type of: 1st - key, 2nd - value

        HashMap<Integer, String> students = new HashMap<>();

        LinkedHashMap <Integer, String> students2 = new LinkedHashMap<>();

        TreeMap <Integer, String> students3 = new TreeMap<>();

//        OR

//        lIST <String> var = new ArrayList<>();--->
//        Set <String> var = new HashSet<>();------>POLYMORPHISM example
        Map<Integer, String> students4 = new HashMap<>();   //POLYMORPHISM (transorms map to HashMap)
        Map <Integer, String> students5 = new LinkedHashMap<>();
        Map <Integer, String> students6 = new TreeMap<>();


    }
}
