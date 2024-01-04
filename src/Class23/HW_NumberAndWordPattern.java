package Class23;

public class HW_NumberAndWordPattern {
    public static void main(String[] args) {
        stringNumberPattern(6, "six");
    }

    public static void stringNumberPattern(int n, String pattern){

        for(int i = 1; i<=n; i++){
            System.out.print(i+" ");
            for(int x = 1; x<=i; x++){
                System.out.print(pattern+ " ");
            }System.out.println();

        }
    }
        }

