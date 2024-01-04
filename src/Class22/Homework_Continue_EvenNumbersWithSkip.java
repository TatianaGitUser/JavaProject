package Class22;

public class Homework_Continue_EvenNumbersWithSkip {
    public static void main(String[] args) {
        printEvenNumbers(15);

    }
    public static void printEvenNumbers(int n){
        if (n<=0){
            System.out.println("Error! Number should be bigger than 0");
        }
        for (int i = 1; i<=n; i++){

            if (i%2 != 0){
                continue;
            }else if(i%3 ==0){
                continue;
            }
            System.out.println(i);
        }
    }
}
