package Class31_Maps;
import java.util.Map;
import java.util.TreeMap;

public class HW_ClassifyAndRemoveDuplicatesInt {
    public static void main(String[] args) {
        String input = "9 -5 2 7 -3 1 0 4 -2 6 -1 3 8 -4 10 5 -1 6 3 2 -3 0";
        System.out.println(classifyAndDeduplicateIntegers(input));

    }
    public static Map<Integer, String> classifyAndDeduplicateIntegers(String input){
        Map <Integer, String> result = new TreeMap<>();
        String [] splitString = input.split("[ ]");
        for (int i = 0; i<splitString.length; i++){
            int currentInt = Integer.parseInt(splitString[i]);
            boolean isUnique = true;

            for (int j = 0; j < splitString.length; j++) {
                if (i != j && currentInt == Integer.parseInt(splitString[j])) {
                    isUnique = false;
                    break;
                }
            } if(isUnique){
                if(currentInt == 0){
                    result.put(currentInt, "Zero");
                }else if(currentInt%2 == 0 && currentInt>0){
                    result.put(currentInt, "Positive Even");
                }else if(currentInt<0){
                    result.put(currentInt, "Negative");
                }else if(currentInt %2 !=0 && currentInt>0){
                    result.put(currentInt, "Positive Odd");
                }
            }

        }return result;
    }

}
