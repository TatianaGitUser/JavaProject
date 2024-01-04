package Class28;

public class HW_CalculateFromString {
    public static void main(String[] args) {
        String str = "1 -2 3 4 5 -6 7 -8 99";
        System.out.println(sumEvenNumbers(str));
    }
    public static int sumEvenNumbers(String str){
        String [] str1 = str.split("[ ]");
        int sum = 0;
        for (int i = 0; i<str1.length; i++){
            int counter = Integer.parseInt(str1[i]);
            if (counter%2 == 0){
                sum+=counter;
            }
        }return sum;
    }
}
