package Class25Arrays;

public class Class25_4_ArrayLoop {
    public static void main(String[] args) {
        int [] nums = {1, 5, 7, 12, 44, 77, 99};
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);
        System.out.println(nums[4]);
        System.out.println(nums[5]);
        System.out.println("=-=-=-=-=-=-===--=");
        System.out.println(nums.length);
        System.out.println("=-=-=-=-=-=-===--=");

//       variable of an array offers property called 'length;
        // 'length' in array is a property, not a method.
//        'length' does not need ()

        for (int i = 0; i<nums.length; i++){
            System.out.println(nums[i]);

            String []cities = {"Dubai", "Singapoore", "Chikago", "La", "Las Vegas", "Miami"};
            for (i =0; i<cities.length; i++){
                System.out.println(cities[i]);
            }
        }
    }
}
