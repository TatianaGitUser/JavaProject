package Class30;

import java.util.LinkedHashSet;
import java.util.Set;

public class HW_PrimeNumberFinder {
    public static void main(String[] args) {
        int start = 1;
        int end = 10;
        System.out.println(findPrimesInRange(start, end));

    }
    public static Set<Integer> findPrimesInRange(int start, int end) {
        Set<Integer> result = new LinkedHashSet<>();

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                result.add(i);
            }
        }

        return result;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }

        int sqrtN = (int) Math.sqrt(n);
        for (int i = 3; i <= sqrtN; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
