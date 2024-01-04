package Class22;

public class HW_NestedLoop_CountBackwards {
    public static void main(String[] args) {
      printBackwards(5);
      printBackwards2(6);
    }
    public static void printBackwards(int limit) {
        if (limit <= 0) {
            System.out.println("Error! Number n can't be less than 1");
        }

        for (int iter = 0; iter < limit; iter++) {

            for (int i = limit - iter; i >= 1; i--) {

                System.out.print(i + " ");

            }
            System.out.println();// Move to the next line after each row
        }
    }
    public static void printBackwards2(int input){
        int counter1 = 0;
        int counter2 = input-counter1;

        if(input<=0){
            System.out.println("Error! Number n can't be less than 1");
        }
        while(counter1<=input){

            while(counter2>=1){
                System.out.print(counter2+ " ");
                counter2--;
            }

            counter1++;
            counter2= input-counter1;
            System.out.println();
        }
    }

}

