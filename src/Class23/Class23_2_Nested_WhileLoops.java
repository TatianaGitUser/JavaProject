package Class23;

public class Class23_2_Nested_WhileLoops {
    public static void main(String[] args) {
//        write a prog that prints out value of counter2
//        1, 2, 3, 4 --> counter1 =1
//        1, 2, 3, 4 --> counter1 =2
//        1, 2, 3, 4 --> counter1 =3
//        1, 2, 3, 4 --> counter1 =4
//        1, 2, 3, 4 --> counter1 =5
        int counter1 = 1;
        while (counter1<=5){

            int counter2 = 1;
            while (counter2<=4){
                System.out.print(counter2+", ");
                counter2++;

            }
            System.out.println("---> counter1 "+ counter1);
            counter1++;
        }
    }
}
