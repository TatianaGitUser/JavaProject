package Class27;

import java.util.Arrays;

public class HW_TransposeMatrix {
    public static void main(String[] args) {
        int [][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int [][] array = {{1,2,3},{4,5,6},{7,8,9}};
        int row = 3;
        int column =2;
        System.out.println(Arrays.deepToString(transposeMatrix(matrix)));
        System.out.println(accessElement2D(array, row, column));
    }
    public static int[][] transposeMatrix(int[][] matrix) {
        if (matrix.length == 0|| matrix[0].length!=matrix[1].length
                ||matrix.length!=matrix[0].length) {
            return new int[0][0];
        }

        int numRows = matrix.length;
        int numCols = matrix[0].length;
        int[][] result = new int[numCols][numRows];

        for (int i = 0; i < numRows; i++) {

            for (int j = 0; j < numCols; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }

    public static int accessElement2D(int[][] array,int row,int column){
        int wanted = array[row-1][column-1];
        return wanted;
    }

}
