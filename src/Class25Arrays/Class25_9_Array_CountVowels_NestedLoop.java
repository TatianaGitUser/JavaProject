package Class25Arrays;

public class Class25_9_Array_CountVowels_NestedLoop {


    public static void main(String[] args) {


        String[] aiArr = {"neural networks", "deep learning", "reinforcement learning", "artificial general intelligence"};
        for (int i = 0; i < aiArr.length; i++) {
            int counter = 0;
            String currentString = aiArr[i];

            for (int j = 0; j < currentString.length(); j++) {
                if (currentString.charAt(j) == 'a' || currentString.charAt(j) == 'o'
                        || currentString.charAt(j) == 'e'
                        || currentString.charAt(j) == 'u' || currentString.charAt(j) == 'i') {
                    counter++;
                }

            }
            System.out.println(currentString+ " has "+counter+ " vowels");
        }


    }

}