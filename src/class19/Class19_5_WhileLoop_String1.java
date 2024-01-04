package class19;

public class Class19_5_WhileLoop_String1 {
    public static void main(String[] args) {
//        write a prog that prints out all chars in String "Superstar"
//        backwards
        String str = "Superstar";
        System.out.println(str.charAt(8)); /*decrement -1*/
        System.out.println(str.charAt(7));
        System.out.println(str.charAt(6));
        System.out.println(str.charAt(5));
        System.out.println(str.charAt(4));
        System.out.println(str.charAt(3));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(0));

System.out.println("+++++++++++++++++++");

        int counter = 8;
        while (counter>=0){
            System.out.println(str.charAt(counter));
            counter--;
        }
        System.out.println("+++++++++++++++++++++");

//        print out any String in a reversed order
    String str1 = "I love Java so much";
    int counter1 = str1.length()-1;
    while (counter1>=0){
        System.out.println(str1.charAt(counter1));
        counter1--;
    }
    }

}
