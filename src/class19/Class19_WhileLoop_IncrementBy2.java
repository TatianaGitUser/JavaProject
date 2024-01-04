package class19;

public class Class19_WhileLoop_IncrementBy2 {
    public static void main(String[] args) {
//        write a prog that prints 1-3-5-7-9

        System.out.println(1);
        System.out.println(3);
        System.out.println(5);
        System.out.println(7);
        System.out.println(9);

        System.out.println("================");

        int counter = 1;
        while (counter <= 9) {
            System.out.println(counter);
            counter += 2;
        }
        System.out.println("===========");
//    print out even nums 0-10
        int counter2 = 0;
        while (counter2<=10){
            System.out.println(counter2);
            counter2+=2;
        }
    }
}
