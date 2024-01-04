package Class23;

public class HW_printingRectangle {
    public static void main(String[] args) {
printRectangle(5, 3);
    }
    public static void printRectangle(int rows, int columns){
        for (int i = 1; i<=rows; i++){
            for (int j=1; j<=columns; j++){
                System.out.print("*");
            }System.out.println();
        }
    }

}
