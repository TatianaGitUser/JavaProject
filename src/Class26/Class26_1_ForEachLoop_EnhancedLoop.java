package Class26;

public class Class26_1_ForEachLoop_EnhancedLoop {
    public static void main(String[] args) {
        int[] nums = {12, 455, 2, 33, 23};
//limitations of for each loop-> you can only statrt from beginning and only finish at the end of the arrays
//        if you need to use indexes to solve a problem -> use regular for loop
        for (int num : nums) {       //means start at nums array and iterate until end of this array
            System.out.println(num);

//       find the smallest num
            int smallest = nums[0];
            for (int num1 : nums) {
                if (smallest > num1) {
                    smallest = num1;
                }
            }
            System.out.println(smallest);

            String[] arr = {"cat", "dog", "horse"};
            for (String str : arr) {
                if (!str.equals("horse")) {
                    System.out.println(str);
                }
            }
        }
    }
}
