package Class30;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Arrays;

public class HW_CommonElements_ConvertSetToArray {
    public static void main(String[] args) {
        Set<String>set1 = new HashSet<>();
        set1.add("word1");
        set1.add("word2");
        set1.add("word4");
        set1.add("word3");
        Set<String>set2 = new HashSet<>();
        set2.add("word4");
        set2.add("word5");
        set2.add("word6");
        set2.add("word2");
        System.out.println(Arrays.asList(commonEl(set1, set2)));
    }
    public static String[]  commonEl(Set<String>set1, Set<String>set2){

        Set <String> common = new LinkedHashSet<>();
        for (String var1 : set1){
            for (String var2 : set2){
                if(var1.equals(var2)){
                    common.add(var1);
                }
            }
        }String []result = common.toArray(new String[0]);
        return result;
    }
}
