package Class20;

public class Class20_0_DoWhileLoop {
    public static void main(String[] args) {
//        print out Hello 5 times
//       if we know how many times we need loop, we are required to have:
//        body
//        counter
//        condition with ending point
//        make sure you have the counter updater
//         do while loop is executed at least once
// only after the body is executed once the condiion is checked for the first time.
//        after that it works exactly the same as while loop

        int counter = 1;
        do {/*in the first iteration we don't ckeck a condition*/
            System.out.println("Hello");
            counter++;

        } while (counter <= 5);
    }
}