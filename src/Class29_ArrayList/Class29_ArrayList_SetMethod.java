package Class29_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Class29_ArrayList_SetMethod {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//set method takes (int index, element) -> updates the element at the given index to a new element

        list.add("Lamborghini");
        list.add("Ferrari");
        list.add("Bugatti");
System.out.println(list);

list.set(1, "Porsche");
System.out.println(list);

list.set(2, "GTR");
System.out.println(list);
    }
}
