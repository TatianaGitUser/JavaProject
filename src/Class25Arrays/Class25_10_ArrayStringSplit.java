package Class25Arrays;

import java.util.Arrays;

public class Class25_10_ArrayStringSplit {
    public static void main(String[] args) {
        String fullName = "Elon Musk";
        // .split(String str) param is delimeter
        // delimeter - where we want split the String

        String[] names = fullName.split(" "); // breaks the String into 2 Strings
        System.out.println((Arrays.toString(names)));

        String csv = "Name, Age, Gender\n" +
                "John, 25, Male\n" +
                "Mary, 30, Female";
        System.out.println(csv);

// find age of John
// regex -
        String[] arr = csv.split("[,\n]");
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[4]);
        //print out Mary's age
        for (int i = 3; i < arr.length; i += 3) {
            if (arr[i].equals("Mary")) {
                System.out.println(arr[i + 1]);
            }
        }
    }
}
