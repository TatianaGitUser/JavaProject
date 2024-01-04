package Class27;

import java.util.Arrays;

public class Class27_2D_Arrays {
    public static void main(String[] args) {

        int[][] arr2d = new int[3][2];

        System.out.println(Arrays.deepToString(arr2d));

        arr2d[0][0] = 42;
        System.out.println(Arrays.deepToString(arr2d));

        arr2d [1][0] = 77;
        System.out.println(Arrays.deepToString(arr2d));

        arr2d [1][1] = 44;
        System.out.println(Arrays.deepToString(arr2d));

        arr2d [2][1] = 55;
        System.out.println(Arrays.deepToString(arr2d));

    }
}
