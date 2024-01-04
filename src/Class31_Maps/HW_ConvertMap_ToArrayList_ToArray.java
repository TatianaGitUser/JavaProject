package Class31_Maps;

import java.util.*;

public class HW_ConvertMap_ToArrayList_ToArray {
    public static void main(String[] args) {
        Map<String, String> input = new HashMap<>();
        input.put("1", "Apple");
        input.put("2", "Banana");
        input.put("3", "Cherry");
        input.put("4", "grapefruit");
        input.put("5", "Orange");
        input.put("6", "Pineapple");
        String searched = "R";
        System.out.println(Arrays.asList(searchValue(input, searched)));

        Map<String, String> studentCheck = new HashMap<>();
        studentCheck.put("Student1", "2023-10-20");
        studentCheck.put("Student2", "2023-10-05");
        studentCheck.put("Student3", "2023-10-05");
        String date = "2023-10-05";
        System.out.println(countPresentOnDate(studentCheck, date));
    }
    public static String[] searchValue(Map<String, String> input, String searched){

        List<String> median = new ArrayList<>();
        for(String var : input.values()){
            if(var.toLowerCase().contains(searched.toLowerCase())){
                median.add(var);
            }
        }String [] result = median.toArray(new String[median.size()]);
        return result;
    }

    public static int countPresentOnDate(Map<String, String> studentCheck, String date){
        int result = 0;
        for(String current : studentCheck.values()){
            if(current.equals(date)){
                result++;
            }
        }return result;
    }


}
