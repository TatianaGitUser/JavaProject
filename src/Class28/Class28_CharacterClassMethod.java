package Class28;

public class Class28_CharacterClassMethod {
    public static void main(String[] args) {
        char a = 'h';
        char b = '8';
        char space = ' ';
        char upCase = 'P';
        System.out.println(Character.isLetter(a));
        System.out.println(Character.isLetter(b));
        System.out.println(Character.isDigit(a));
        System.out.println(Character.isDigit(b));

        System.out.println(Character.isWhitespace(space));
        System.out.println(Character.isWhitespace(a));

        System.out.println(Character.toUpperCase(a));
        System.out.println(Character.toLowerCase(upCase));

        String str = Character.toString(upCase);
        System.out.println(str);



    }
}
