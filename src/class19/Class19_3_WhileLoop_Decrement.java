package class19;

public class Class19_3_WhileLoop_Decrement {
    public static void main(String[] args) {
//        write a prog printing nums from 5 -1
        System.out.println(5);
        System.out.println(4);
        System.out.println(3);
        System.out.println(2);
        System.out.println(1);
        System.out.println("+++++++++++++");
//        when decrementing use '>' comparison operator
        int counter = 5;  /*starting point*/
        while (counter >= 1) {/*ending point*/
            System.out.println(counter);
            counter--;
        }
        System.out.println("++++++++++++++");
//        write a prog prints out nums from 17-9
    int num = 17;
        while (num>=9){
            System.out.println(num);
            num--;
        }
    }

}
