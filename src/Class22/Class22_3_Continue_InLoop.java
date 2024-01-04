package Class22;

public class Class22_3_Continue_InLoop {
    public static void main(String[] args) {
//        write a prog that prints out even nums: 2,4,6,8,10.
        int counter = 1;
        while (counter <= 10) {
            if (counter % 2 != 0) {
                counter++;
                continue;
            }
                System.out.println(counter);
                counter++;

        }
        System.out.println("----------------");
//        write a prog that prints out every char in a String except spaces
        String str = "Hello future SDET Superstar";

        for (int i = 0; i<str.length(); i++){
            if(str.charAt(i)==' '){
                continue;
            }
            System.out.println(str.charAt(i));
        }
    }
}