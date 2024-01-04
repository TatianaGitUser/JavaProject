package Class30;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Class30_10_AddAll {
    public static void main(String[] args) {
        Set<Double> nums = new HashSet<>(Arrays.asList(33.2, 2.1, 4.6, 1.0));
        Set<Double> nums2 = new HashSet<>(Arrays.asList(2.2, 1.1, 0.0, 44.6));
        System.out.println(nums);
        nums.addAll(nums2);
        System.out.println(nums);

    }
}
