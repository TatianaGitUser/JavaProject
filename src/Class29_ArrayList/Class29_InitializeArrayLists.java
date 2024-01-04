package Class29_ArrayList;
import java.util.ArrayList;
import java.util.List;
public class Class29_InitializeArrayLists {
    public static void main(String[] args) {
//        rule n1:
//        you must have an import statement for arrayList:
//        import java.util.ArrayList;

        ArrayList lists1 = new ArrayList();//the problem with this initialization is that we
//        don't specify the data type of an element

//        add() - will add elements to an ArrayList
        lists1.add("Elon");
        System.out.println(lists1);

        lists1.add(1);
        System.out.println(lists1);

//        initialize and restrict to only String elements
        ArrayList<String> lists2 = new ArrayList<String>();
        lists2.add("Steve");
        System.out.println(lists2);
        // lists2.add(20); - not allowed because lists2 can now only hold Strings

        lists2.add("Michelle");
        System.out.println(lists2);

//initialize with only one diamond
        ArrayList<Integer>lists3 = new ArrayList<>();
        //lists3.add("kl"); - now here only integers are allowed

        lists3.add(123);
        lists3.add(3243);
        System.out.println(lists3);

//        Initialize with List interface (industry standard)
        List<String>lists4 = new ArrayList<>();
        lists4.add("Hello");
        lists4.add("world");
        System.out.println(lists4);
    }
}
