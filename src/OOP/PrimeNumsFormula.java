package OOP;

public class PrimeNumsFormula {
    public static void main(String[] args) {
//        for (int i = 2; i<100; i++){
//            if(i%1 == 0 && i%i ==0){
//                System.out.println(i);
//            }
//        }

        System.out.println(isPrime(11));
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
