package Class25Arrays;

public class HW_FindMaxValue {
    public static void main(String[] args) {
int [] array = {5, 12, 566, -99, 20, -1};
System.out.println(findMax(array));
    }
    public static int findMax(int[] array) {
        if (array.length == 0) {
            // Handle the case of an empty array (return a default value or throw an exception)
            return 0;
        }

        int max = array[0]; // Initialize max with the first element of the array

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i]; // Update max if a larger value is encountered
            }
        }

        return max;
    }
}
