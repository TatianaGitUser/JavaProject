package Class25Arrays;

import java.util.Arrays;

public class Class25_11_ArraysCopyOf_Sort_Fill_Equals {
    public static void main(String[] args) {
        int[] nums = {12, 56, 11, 1, 245};
        int[] nums2 = Arrays.copyOf(nums, 3);
        System.out.println(Arrays.toString(nums2));

        String[] fruits = {"banana", "apple", "pineapple", "watermelon"};
        String[] copyFruits = Arrays.copyOf(fruits, 2);
        System.out.println(Arrays.toString(copyFruits));

//       sort in ascending order
        int [] numbers = {5, 3, 8, 1, 2};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
//String sorts in alphabetical oreder
        Arrays.sort(fruits);
        System.out.println(Arrays.toString(fruits));

//        fill
        int []numbers2 = new int[5];
        Arrays.fill(numbers2, 10);
        System.out.println(Arrays.toString(numbers2));

//        equals
        int []numbers3 = {1,2,3,4,5};
        int []numbers4 = {1,2,3,4,5};
        boolean areEqual = Arrays.equals(numbers3, numbers4);
        System.out.println(areEqual);
//must be 100% identical for true, other -> false, case-sensitive
        String []strArr1 = {"hello", "Superstar"};
        String []strArr2 = {"hello", "Superstar"};
        boolean areEqual1 = Arrays.equals(strArr1, strArr2);
        System.out.println(areEqual1);

    }
}