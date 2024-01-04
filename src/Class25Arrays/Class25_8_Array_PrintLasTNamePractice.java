package Class25Arrays;

public class Class25_8_Array_PrintLasTNamePractice {
    public static void main(String[] args) {
        String [] aiResearchers = {"Geoffrey Hinton", "Yann LeCun", "Andrew Ng", "Fei-Fei Li"};
//        print out las names from each element
//        first find a solution for 1 string
        String geoffrey = "Geoffrey Hinton";
        int indexOfSpace = geoffrey.indexOf(' ');
        System.out.println(indexOfSpace);
        System.out.println(geoffrey.substring(indexOfSpace+1));
System.out.println("=======================================");
        for (int i = 0; i<aiResearchers.length; i++) {
            String fullName = aiResearchers[i];
            int indexOfS = fullName.indexOf(' ');

            System.out.println(fullName.substring(indexOfS+1));
        }
    }
}
