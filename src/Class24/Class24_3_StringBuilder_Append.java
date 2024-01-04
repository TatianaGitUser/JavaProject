package Class24;

import javafx.embed.swt.SWTFXUtils;

public class Class24_3_StringBuilder_Append {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(); /* "" */
        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder("Hello"); /*initialize value in the constructor*/
        System.out.println(sb1);
//don't initialize StringBuilder with String value --> not possible

        String dtr = "Elon Musk";
        StringBuilder sb2 = new StringBuilder(dtr);
        System.out.println(sb2);  /*transform your String into STRINGBUILDER!!!!!*/

//        append method -> adds the provided text into existing String at the end

        StringBuilder sb5 = new StringBuilder("Hello");
        sb5.append(" world").append(1).append(" ").append(23.0);
        System.out.println(sb5);

        StringBuilder sb6 = new StringBuilder();
        for (int i = 0; i <= 10; i++) {
            sb6.append(i).append(" ");

        }
        System.out.println(sb6);
    }
}