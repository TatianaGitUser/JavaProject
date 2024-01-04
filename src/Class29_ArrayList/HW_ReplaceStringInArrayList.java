package Class29_ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class HW_ReplaceStringInArrayList {
    public static void main(String[] args) {

      String []list =  {"sentence", "work", "table", "keyboard", "run", "program", "word", "dawn"};
        ArrayList<String> listOfArray = new ArrayList<>(Arrays.asList(list));
      String target = "word";
    String replacement = "sword";
    System.out.println(updateCart(listOfArray, target, replacement));

    Integer[]input1 = {10, 23, -5, 42, 7, 18, -12, 36, 0};
    ArrayList<Integer>input = new ArrayList(Arrays.asList(input1));
    System.out.println(manipulateIntegers(input));
    }
    public static List <String> updateCart(ArrayList<String> listOfArray, String target, String replacement){
        List<String> updatedList = new ArrayList<>();

        for (String item : listOfArray) {
            if (item.toLowerCase().equals(target)) {
                updatedList.add(replacement);
            } else {
                updatedList.add(item);
            }
        }
        return updatedList;
    }

//    manipulate list exercise
    public static ArrayList<Integer> manipulateIntegers(ArrayList<Integer> input){
        ArrayList<Integer>newList = new ArrayList<>();
        for (int num : input){
            if (num %2 == 0){
                num *= 2;
                newList.add(num);
            }if (num%2 !=0){
                num /= 2;
                newList.add(num);
            }
        }
        ArrayList<Integer> updatedList = new ArrayList<>();
        for(int num2 : newList){
            if (num2 %5 !=0){
                updatedList.add(num2);
            }
        }
        return updatedList;
    }

}
