package Class29_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Class29_ArrayList_SizeMethod {
    public static void main(String[] args) {

        List<Double>numList = new ArrayList<>();
        numList.add(21.33);
        numList.add(14.56);
        numList.add(55.23);
        numList.add(96.01);

        numList.add(22.33);
//        same as Array.length
//        size( -> returns int that is a size of elements
        int sizeOfArray = numList.size();
        System.out.println(sizeOfArray);

    }
}
