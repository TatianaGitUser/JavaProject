package Class31_Maps;

import java.util.Map;
import java.util.TreeMap;

public class HW_CheckPrimeForSequence {
    public static void main(String[] args) {
        Integer num = 20;
        System.out.println(checkPrimeNumbers(num));
    }
    public static Map<Integer,Boolean> checkPrimeNumbers(Integer num){
        Map<Integer,Boolean> isPrimeNumbesMap = new TreeMap<>();

        if(num>=0) {
            for (int i = 1; i <= num; i++) {
                boolean isPrime = true;
                for (int j = 2; j <= i; j++) {
                    if (i % j == 0 && i != j && i != 1) {
                        isPrime = false;
                    }
                }
                if (i == 1) {
                    isPrime = false;
                }
                isPrimeNumbesMap.put(i, isPrime);
            }
        }else{
            for (int i = num; i <0; i++) {
                boolean isPrime = true;
                for (int j = i; j <0; j++) {
                    if (i % j == 0 && i != j && i != 1) {
                        isPrime = false;
                    }
                }
                if (i == -1) {
                    isPrime = false;
                }
                isPrimeNumbesMap.put(i, isPrime);
            }

        }
        return isPrimeNumbesMap;
    }
}
