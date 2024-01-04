package Class29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class HW_CountWords_AndPrepareStatistics {
    public static void main(String[] args) {
        String [] words = {"chair", "programming", "dog", "cat", "elephant", "apple", "car", "banana", "java", "open", "house"};
        String letter = "C";
        ArrayList <String> input = new ArrayList<>(Arrays.asList(words));
        System.out.println(countWordsStartingWith(input, letter));
        Integer [] nums = {78, 92, 85, 64, 77, 89, 93, 70, 82, 88};
        ArrayList <Integer> input1 = new ArrayList<>(Arrays.asList(nums));
        System.out.println(calculateStatistics(input1));
        Integer [] nums1 = {85, -77, 92, 68, -73, 90, 81, -79, 84, 88, -92, -68, 77, 73, -90, 79, -84, -88, -85};
        ArrayList<Integer>input2 = new ArrayList<>(Arrays.asList(nums1));
        System.out.println(Arrays.toString(calculateStatistics1(input2)));
    }
    public static int countWordsStartingWith(ArrayList<String> input, String letter){
        int counter =0;
        for (String str : input){
            if(Character.toLowerCase(str.charAt(0)) == Character.toLowerCase(letter.charAt(0))){
                counter++;
            }
        }return counter;
    }
    public static ArrayList<Integer> calculateStatistics(ArrayList<Integer> input1){
        ArrayList<Integer> result = new ArrayList<>();
        int sum = 0;
        int average = 0;
        int max = input1.get(0);
        int min = input1.get(0);
        for (int num = 0; num< input1.size(); num++){
            sum+=input1.get(num);
            if(input1.get(num)>max){
                max = input1.get(num);
            }else if (input1.get(num)<min){
                min = input1.get(num);
            }
        }average = sum/input1.size();
        result.add(average);
        result.add(max);
        result.add(min);
        return result;
    }
    public static Integer [] calculateStatistics1(ArrayList<Integer> input2){
        Integer [] result = new Integer [3];
        int sum = 0;
        int average = 0;
        int max = input2.get(0);
        int min = input2.get(0);
        for (int num = 0; num< input2.size(); num++){
            sum+=input2.get(num);
            if(input2.get(num)>max){
                max = input2.get(num);
            }else if (input2.get(num)<min){
                min = input2.get(num);
            }
        }average = sum/input2.size();
        result[0] = average;
        result[1] = max;
        result[2] = min;

        return result;
    }

}
