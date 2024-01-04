package Class24;

public class HW_EncodeString_RepeatingChars {
    public static void main(String[] args) {
        System.out.println(encodeString("aaaa7777gggg55y"));
    }
    public static StringBuilder encodeString(String input){
        StringBuilder sb = new StringBuilder(input);
        if (sb.length()<=1){
            return sb;
        }
        StringBuilder encoded = new StringBuilder();
        char currentChar = sb.charAt(0);
        int count = 1;

        for (int i = 1; i < sb.length(); i++) {
            char nextChar = sb.charAt(i);

            if (currentChar == nextChar) {
                count++;
            } else {
                encoded.append(currentChar);
                if (count > 1) {
                    encoded.append(count);
                }
                currentChar = nextChar;
                count = 1;
            }
        }

        encoded.append(currentChar);
        if (count > 1) {
            encoded.append(count);
        }

        return encoded;
    }
}
