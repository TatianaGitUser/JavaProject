package Class25Arrays;

public class HW_FindTheDifference {
    public static void main(String[] args) {
        int[] input = {-1, 20, 17, 1999};
        double[] inputDouble = {1.1, 0.1, -1.2};
        System.out.println(findAndCalculate(input, inputDouble));
    }

    public static double findAndCalculate(int[] input, double[] inputDouble) {
        if (input.length == 0 || inputDouble.length == 0) {
            return -1.0;
        }
        double result = 0;
        int maxInput = input[0];
        double minDouble = inputDouble[0];
        for (int i = 0; i < input.length; i++) {
            if (input[i] > maxInput) {
                maxInput = input[i];
            }
        }
        for (int j = 0; j < inputDouble.length; j++) {
            if (inputDouble[j] < minDouble) {
                minDouble = inputDouble[j];
            }

            result = maxInput - minDouble;
        }
        return result;
    }
}