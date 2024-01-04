package Class25Arrays;

public class Class25_2_Array_AccessElements {
    public static void main(String[] args) {

        int[] arr = {10,13,25,24,10};
        int num = arr[0];
        System.out.println(num);
        System.out.println(arr[0]);
        System.out.println(arr[2]);
//        use values of elements to do calculations
        int sum = arr[1]+arr[3];//13+24
    System.out.println(sum);
//    I can access the element and change it's value
        arr[4] = 55;//overwritten the value with new value
        System.out.println(arr[4]);
    }
}
