package Class31_Maps;

import java.util.HashMap;
import java.util.Map;

public class HW_CheckTheWordType {
    public static void main(String[] args) {
        String sentence = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed commodo, nibh in rutrum scelerisque, " +
                "nisl enim dignissim arcu, a consequat lorem lacus sed justo. Ut consequat lectus id arcu dapibus, vitae pharetra orci eleifend. " +
                "Nullam a sem at nibh vestibulum suscipit et ut metus. Vivamus id fermentum eros. " +
                "Curabitur elementum quam in nunc tincidunt, id convallis erat eleifend. " +
                "Suspendisse efficitur, risus id tristique tempus, " +
                "massa ligula vestibulum justo, " +
                "vel consectetur tellus erat nec ipsum. Duis et enim id turpis congue elementum. " +
                "Vestibulum vulputate tortor nec lacus posuere, et dignissim ex malesuada. Mauris eget arcu non justo eleifend sagittis.";
        System.out.println(checkWordCharacters(sentence));
    }
    public static Map <String, Boolean> checkWordCharacters(String sentence){
        Map<String, Boolean> result = new HashMap<>();
        String [] splitSentence = sentence.split(" ");

        for(int i = 0; i<splitSentence.length; i++){
            String currentWord = splitSentence[i];
            boolean lowerCase ;
            for(int j = 0; j<currentWord.length(); j++){

                if(Character.isLetter(currentWord.charAt(j)) && Character.isLowerCase(currentWord.charAt(j))){
                    lowerCase = false;
                }else if(Character.isUpperCase(currentWord.charAt(j))){
                    lowerCase = true;
                    result.put(currentWord, lowerCase);
                    break;
                }else{
                    lowerCase = true;
                }
                result.put(currentWord, lowerCase);

            }
        }return result;
    }
}
