package Class21;

public class Class21_ForLoop {
    public static void main(String[] args) {
//        write a prog thay prints out nums 1-7

        for (int counter = 1; counter <= 7; counter++) {
            System.out.println(counter);
        }
//        write a prog that prints out nums from 11 - -5
        for (int counter = 11; counter >= -5; counter--) {
            System.out.println(counter);
        }
//        write a prog that prints out String chars from the end to beginning
        String str = "Hello Superstar";
        for (int counter = str.length() - 1; counter >= 0; counter--) {
            System.out.println(str.charAt(counter));
        }
    }
}