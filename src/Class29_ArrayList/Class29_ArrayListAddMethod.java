package Class29_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Class29_ArrayListAddMethod {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//add(element) method -> adds element to the end of the array list

        list.add("Lamborghini");
        System.out.println(list);

list.add("Ferrari");
System.out.println(list);

list.add("Bugatti");
System.out.println(list);

List<Double>monthlyRevenueList = new ArrayList<>();
monthlyRevenueList.add(15999.33);
System.out.println(monthlyRevenueList);
monthlyRevenueList.add(35000.21);
System.out.println(monthlyRevenueList);

//add element at the specified index (add(int index, element)-->
//       -> creates new element in the list and moves all elements after added element up 1 index:
//       1 2 3 4 5 --> add(2, 9) --->
//       1 2 9 3 4 5

        List<Integer> numList = new ArrayList<>();
        numList.add(20);
        numList.add(10);
        numList.add(5);
        System.out.println(numList);

        numList.add(2, 25);
        System.out.println(numList);

        list.add(0, "GWagon");
        System.out.println(list);

    }
}
