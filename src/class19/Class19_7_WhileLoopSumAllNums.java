package class19;

public class Class19_7_WhileLoopSumAllNums {
    public static void main(String[] args) {
//        write a prog that sums up all nums from 1 to 5
        int counter = 1;
        int sum = 0;
        while (counter <= 5) {
           sum +=counter;
            counter++;
            System.out.println(sum);

// public static void main(String args[]) {
//        int counter = 0;
//        int power = 2;
//        while (counter<10){
//            System.out.println(power);
//            counter++;
//         power=power*2;
        }
    }
}