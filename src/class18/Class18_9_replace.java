package class18;

public class Class18_9_replace {
    public static void main(String[] args) {
//        String replace(char oldChar, char newChar)
//        replaces all occurances of old char to new char and returns a new String
        String str = "Hello WedevXer!";
        String str2 = str.replace('e', 'w');
        System.out.println(str2);

        String str5 = "Silicone Valley";
        String str6 = str5.replace('l', 'o');
        System.out.println(str6);

//        replaceFirst(String old, String new);
//        it only replaces the first occurance
//        case sensitive
        String str7 = "Hello world, DevX, WeDevX";
        String str8 = str7.replaceFirst("DevX", "WedevX");
        System.out.println(str8);
//        replaceAll will replace all occurances
    }
}
