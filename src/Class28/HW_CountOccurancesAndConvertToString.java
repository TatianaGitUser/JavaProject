package Class28;

public class HW_CountOccurancesAndConvertToString {
    public static void main(String[] args) {
        int []input = {1, 1, 2, 2, 2, 3, 3, 4, 4, 5};
        String str = "2";
        System.out.println(countOccurrences(input, str));
    }
    public static String countOccurrences(int []input, String str){
        int parsed = Integer.parseInt(str);

        int counter = 0;
        for(int i : input){
            if (i == parsed){
                counter++;
            }

        }return Integer.toString(counter);
    }

}
