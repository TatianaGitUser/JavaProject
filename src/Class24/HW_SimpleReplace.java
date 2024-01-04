package Class24;

public class HW_SimpleReplace {
    public static void main(String[] args) {
        System.out.println(replaceSubstring("I am a little tired", "little", "lot"));
    }
    public static StringBuilder replaceSubstring(String sentence, String replacee, String replacement) {
        StringBuilder sb = new StringBuilder(sentence);
        int j = sb.indexOf(replacee);

        while (j != -1) {

            sb.replace(j, j + replacee.length(), replacement);
            j = sb.indexOf(replacee, j + replacement.length());// Find the next occurrence



        }
        return sb;
    }

}
