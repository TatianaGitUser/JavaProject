package Class30;

import java.util.Set;
import java.util.HashSet;

public class Class30_2_AddMethod {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
//       public boolean add(Object o);
        boolean result1 = names.add("Elon");
        boolean result2 = names.add("Steve");
        System.out.println(names);
        System.out.println(result1);
        System.out.println(result2);
        boolean result3 = names.add("Elon");
        System.out.println(result3);

        Set <String> usernames = new HashSet<>();
        usernames.add("elon@spacex.com");
        usernames.add("bill@microsoft.com");

        if(!usernames.add("elon@spacex.com")){
            System.out.println("The username is already taken");
        }


    }
}
