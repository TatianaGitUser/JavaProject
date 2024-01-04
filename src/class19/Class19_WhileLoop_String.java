package class19;

public class Class19_WhileLoop_String {
    public static void main(String[] args) {
//        print out each char of a String in a new line
        String str = "Hello Superstar";
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));
        System.out.println(str.charAt(4));
        System.out.println(str.charAt(5));
        System.out.println(str.charAt(6));
        System.out.println(str.charAt(7));
        System.out.println(str.charAt(8));
        System.out.println(str.charAt(9));
        System.out.println(str.charAt(10));
        System.out.println(str.charAt(11));
        System.out.println(str.charAt(12));
        System.out.println(str.charAt(13));
        System.out.println(str.charAt(14));/*+1*/


        System.out.println("+++++++++++++++++");
        int counter = 0;
        while (counter <= 14) {
            System.out.println(str.charAt(counter));
            counter++;
        }
        System.out.println("+++++++++++++++++++");
//        write a prog to print out each char in 'Mars'
        String str2 = "Mars is a fourth Planet in Solar System";
        int counter2 = 0;
        while (counter2 <= str2.length()-1) {
            System.out.println(str2.charAt(counter2));
            counter2++;
        }


    }
}