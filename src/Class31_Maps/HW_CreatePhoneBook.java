package Class31_Maps;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;

public class HW_CreatePhoneBook {
    public static void main(String[] args) {
        String names = "Alice Bob Charlie Max";
        String phoneNums = "1234567890 9876543210 5555555555";
        System.out.println(createContactList(names, phoneNums));
    }
    public static Map<String, String> createContactList(String names, String phoneNums) {
        Map<String, String> contactList = new HashMap<>();
        String[] splitNames = names.split("[ ]");
        String[] splitPhoneNums = phoneNums.split("[ ]");
        Set<String> nameSet = new LinkedHashSet<>(Arrays.asList(splitNames));
        Set<String> phoneSet = new LinkedHashSet<>(Arrays.asList(splitPhoneNums));

        if (nameSet.size() > phoneSet.size()) {
            for (int i = phoneSet.size(); i < nameSet.size(); i++) {
                phoneSet.add("-1");
            }
        }

        if (phoneSet.size() > nameSet.size()) {
            int counter = 1;
            for (int i = nameSet.size(); i <= phoneSet.size(); i++) {
                nameSet.add("unknown" + counter);
                counter++;
            }
        }

        String[] phoneNumArray = phoneSet.toArray(new String[0]);
        int phoneIndex = 0;

        for (String name : nameSet) {
            if (phoneIndex < phoneNumArray.length) {
                contactList.put(name, phoneNumArray[phoneIndex]);
                phoneIndex++;
            }
        }

        return contactList;
    }
}
