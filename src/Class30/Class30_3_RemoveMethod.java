package Class30;

import java.util.HashSet;
import java.util.Set;

public class Class30_3_RemoveMethod {
    public static void main(String[] args) {
        Set<Integer> ids = new HashSet<>();
        ids.add(1);
        ids.add(2);
        ids.add(3);
        ids.add(4);
        System.out.println(ids);

        boolean result1 = ids.remove(3);
        boolean result2 = ids.remove(10);
        System.out.println(result1);// returns 'true' because it removed object 3 successfully
        System.out.println(ids);
        System.out.println(result2);// returns false because there was no object with value 10

        if (!ids.remove(12)){
            System.out.println("The user doesn't exist");
        }


    }
}
