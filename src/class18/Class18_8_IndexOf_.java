package class18;

public class Class18_8_IndexOf_ {
    public static void main(String[] args) {
//        returns int
//        if string doesn't match, returns value -1
        String str = "Hello Superstar of WedevX";
        int indexOfS = str.indexOf("Superstar");
        System.out.println(indexOfS);

        int indexOfOf = str.indexOf("of");
    System.out.println(indexOfOf);

    int indexOfMars = str.indexOf("mars");
    System.out.println(indexOfMars);

//    indexOf(String str, int index)
//        checks if String contains the given String
//        if it does, starts looking for asked occurance after the given index
        String str5 = "Mars, SpaceX, DevX, Developer, Mars";
        int i5 = str5.indexOf("Mars", 6);
        System.out.println("i " +i5);

        int i6 = str5.indexOf("Dev", 16);
        System.out.println(i6);
//lastIndexOf(String str) checks if the original has given String.
//        if it does - finds last occurance of given String and returns the index of the first char
        String str6 = "Play, Work, Read, Sleep, Eat, Party, Study, Repeat";
        int i7 = str6.lastIndexOf("y");
        System.out.println(i7);
        int i8 = str6.lastIndexOf("at");
        System.out.println(i8);
    }
}
