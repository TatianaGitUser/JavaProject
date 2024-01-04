package Class29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class HW_DeleteNegativeNumbers {
    public static void main(String[] args) {
        Integer [] listOfNums = {-999, 0, 1, -1, 1000};
        ArrayList<Integer>input = new ArrayList<>(Arrays.asList(listOfNums));
        System.out.println(removeNegativeNumbers(input));
    }
    public static ArrayList<Integer> removeNegativeNumbers(ArrayList<Integer>input){
        ArrayList <Integer> updatedList = new ArrayList<>();
        for (int num : input){
            if(num>=0){
                updatedList.add(num);
            }
        }return updatedList;
    }
}
