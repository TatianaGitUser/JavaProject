package Class30;

import java.util.HashSet;
import java.util.Set;

public class Class30_7_LoopThroughSet {
    public static void main(String[] args) {
        Set<String> usernames = new HashSet<>();
        usernames.add("abc@apple.com");
        usernames.add("bcd@google.com");
        usernames.add("oab@amazon.com");

        for(String username : usernames){
            System.out.println(username);
        }

    }
}
