package Class22;

public class HomeWork_SimpleNested_Loop {

    public static void main(String args[]) {
        String letters = "abc";

        for (int i =0; i<=letters.length()-1; i++){
            char letter = letters.charAt(i);
            System.out.print(letter);
            for (int num2 = 1; num2<=5; num2++){
                System.out.print(num2);
            }

        }
        System.out.println("\n-------------");

                int letter = 0;
                int num = 1;
                while (letter<= letters.length()-1){
                    char letter1 = letters.charAt(letter);
                    System.out.print(letter1);

                    while(num<=5){
                        System.out.print(num);
                        num++;
                    }
                    num =1;
                    letter++;
                }

            }
}

