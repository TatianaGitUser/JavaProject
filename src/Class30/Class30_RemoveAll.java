package Class30;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Class30_RemoveAll {
    public static void main(String[] args) {
        Set<Double> nums = new HashSet<>(Arrays.asList(33.2, 2.1, 4.6, 1.0));
        Set<Double> nums2 = new HashSet<>(Arrays.asList(2.2, 1.1, 0.0, 44.6, 2.1));

        System.out.println(nums);
        System.out.println(nums2);
//        removeAll - removes matching elements from the collection in 1st position
    nums.removeAll(nums2);
    System.out.println(nums);
    System.out.println(nums2);
    }
}
