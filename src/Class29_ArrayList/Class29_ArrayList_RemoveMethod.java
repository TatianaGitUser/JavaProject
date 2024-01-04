package Class29_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Class29_ArrayList_RemoveMethod {
    public static void main(String[] args) {

        List<Double>numList = new ArrayList<>();
        numList.add(21.33);
        numList.add(14.56);
        numList.add(55.23);
        numList.add(96.01);
        numList.add(26.01);
        System.out.println(numList);

        numList.remove(2);
        System.out.println(numList);

        numList.remove(3);
        System.out.println(numList);
    }
}
