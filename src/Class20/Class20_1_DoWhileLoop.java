package Class20;

public class Class20_1_DoWhileLoop {
    public static void main(String[] args) {
//        write a prog that prints out numbers from 1-5
        int counter = 1;
        do {
            System.out.println(counter++); /*first returns the old value
            then it increments*/
        }while (counter<=5);
//        write a prog to print out values from 11 till -2
        int counter2 = 11;
        do {
         System.out.println(counter2--);
        }while(counter2 >= -2);
System.out.println("------------------------");
//        write a prog that prints out all chars in any given String using do while
//     from the beginning to end
       String str = "I'm a do while superstar";
       int index = 0;
       do {
           System.out.println(str.charAt(index++));
       }while(index<= str.length()-1);

//
        do {
            System.out.println("Java");
        }while (false);
    }
}
