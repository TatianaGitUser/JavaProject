package Class28;

public class HW_FindAverageOfArray {
    public static void main(String[] args) {
Integer []input = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
System.out.println(calculateAverage(input));
    }
    public static Double calculateAverage(Integer [] input){
        Integer sum = 0;
        Double counter = 0.0;
        for (int i=0; i<input.length; i++){
            sum += input[i];
            counter++;
        }
        Double average = sum/counter;
        return average;
    }
}
