package Class23;

public class Class23_5_NestedForLoops {
    public static void main(String[] args) {
//        *
//        **
//        ***
//        ****
//        *****

        for (int i = 1; i<=5; i++){
//
            for (int x = 1; x<=i; x++){ /*limits the inner loop by num i (starting point
                                           of outer loop*/
                System.out.print("*");
            }System.out.println();
        }
    }

}
