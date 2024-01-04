package Class23;

public class HW_DiamondPattern {
    public static void main(String[] args) {
        printDiamond(7, '-');
    }
    public static void printDiamond(int n, char symbol){
        if (n%2 ==0 && n<50){
            System.out.println("Invalid input! n must be a positive odd integer.");
        }else{
            int spaces = n / 2;
            int stars = 1;
// Upper half of the diamond
            for (int i = 0; i <= n / 2; i++) {
                for (int j = 0; j < spaces; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < stars; k++) {
                    System.out.print(symbol);
                }
                System.out.println();
                spaces--;
                stars += 2;
            }
// Lower half of the diamond
            spaces = 1;
            stars = n - 2;
            for (int i = 0; i < n / 2; i++) {
                for (int j = 0; j < spaces; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < stars; k++) {
                    System.out.print(symbol);
                }
                System.out.println();
                spaces++;
                stars -= 2;
            }
        }
    }
}
