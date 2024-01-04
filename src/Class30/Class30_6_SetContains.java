package Class30;
import java.util.Set;
import java.util.HashSet;
public class Class30_6_SetContains {
    public static void main(String[] args) {
        Set<String> usernames = new HashSet<>();
        usernames.add("elon@spacex.com");
        usernames.add("bill@microsoft.com");

        if(usernames.contains("bill@microsoft.com")){
            System.out.println("contains");
        }else{
            System.out.println("False");
        }
    }
}
