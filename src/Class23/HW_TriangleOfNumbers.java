package Class23;

public class HW_TriangleOfNumbers {
    public static void main(String[] args) {
        printNumberTriangle(12);
    }
    public static void  printNumberTriangle(int input){

        int counter1 = 1;
        while(counter1<=input){

            int counter2 = 1;
            while (counter2<=counter1){
                counter2++;
                System.out.print(counter1);/*this loop iterates inside itself*/
//                until it reaches end. Then outer loop iterates to next number and
//                inner loop starts iterating from beginning again as many times as it says in
//                in my condition (counter2<counter1).

            }
            System.out.println();
            counter1++;
        }
    }

}
