package Class29_ArrayList;

import java.util.ArrayList;
import java.util.List;
public class Class29_ArrayList_GetMethod {
    public static void main(String[] args) {
        List<String>list = new ArrayList<>();
        list.add("Apple inc.");
        list.add("Google.");
        list.add("Amazon.");
        list.add("Microsoft.");
        System.out.println(list);


//        get (int index)-->returns the element at a given index
        String str = list.get(0);
        System.out.println(str);

        str+= " Company"; // you have to create new string object to modify String value
        System.out.println(str);
        System.out.println(list);

       String str2 = list.get(2);
        System.out.println(str2);

        List<Double>numList = new ArrayList<>();
        numList.add(21.33);
        numList.add(14.56);
        numList.add(55.23);
        numList.add(96.01);
        System.out.println(numList);

        Double num = numList.get(2);
        System.out.println(num);

        double num1 = numList.get(3);
        System.out.println(num1);

    }
}
