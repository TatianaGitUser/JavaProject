package Class31_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class HW_ManageListOfNames {
    public static void main(String[] args) {
        String sentenceOfFullNames = "Chris Brad; Tom Misch; Kate Stewart";
System.out.println(manageMap(sentenceOfFullNames));
    }
    public static Map<Integer, String> manageMap(String sentenceOfFullNames) {
        String[] fullNames = sentenceOfFullNames.trim().split("; ");
        Map<Integer, String> numberedFullNamesMap = new LinkedHashMap<>();
        String firstName;
        String lastName;
        int counter = 1;
        for (String fullName : fullNames) {
            String[] firstAndLastNames = fullName.split("\\s");
            firstName = firstAndLastNames[0];
            lastName = firstAndLastNames[1];
            if (firstName.length() > lastName.length()) {
                numberedFullNamesMap.put(counter, firstName.concat(" ").concat(lastName));
            } else {
                numberedFullNamesMap.put(counter, lastName.concat(" ").concat(firstName));
            }
            counter++;
        }
        return  numberedFullNamesMap;
    }
}
