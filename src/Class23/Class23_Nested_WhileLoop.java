package Class23;

public class Class23_Nested_WhileLoop {
    public static void main(String[] args) {
        int counter1 = 1;
        int counter2 = 1;

        while(counter1 <=3){

            while(counter2 <=2){
                System.out.println("Superstar");
                counter2++;
            }
            counter2= 1; /*resetting the value in order to start looping again with next outer loop*/
            counter1++;
        }
    }

}
