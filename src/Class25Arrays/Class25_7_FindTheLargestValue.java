package Class25Arrays;

public class Class25_7_FindTheLargestValue {
    public static void main(String[] args) {
//        find the largest num in array
        int[] nums = {33, 55, 10, 5, 77, 22, 10};
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
             
            if (nums[i] > max) {
        max = nums[i];
            }
        }System.out.println(max);
    }
}
