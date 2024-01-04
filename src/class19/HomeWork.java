package class19;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Please, enter your name:");
//        String answer = sc.nextLine();
//
//        while (answer.trim().equals("")) {
//            System.out.println("Invalid input");
//            answer = sc.nextLine();
//        }
//
//        System.out.println("Welcome" + answer.trim());
//
//        System.out.println("=========================");
//
//
//        System.out.println("Enter a sentence:");
//        String sentence = sc.nextLine();
//        int index = sentence.indexOf(" ");
//        int numOfWords = 0;
//        while (sentence.contains(" ")) {
//            sentence = sentence.trim();
//            numOfWords++;
//            sentence = sentence.substring(index);
//        }
//        System.out.println("Number of words: " + numOfWords);


//        System.out.println("Enter a sentence:");
//        String sentence2 = sc.nextLine().trim();
//        int numOfWords2 = 0;
//        int char =
//        while (sentence2.length()-1 > 0) {
//            if (sentence2.charAt(numOfWords2) == ' ') {
//                numOfWords2++;
//                sentence2 = sentence2.substring(numOfWords2);
//            }
//        else {
//
//            }
//            System.out.println("Number of words: " + numOfWords2);


//count occurances of a specific character*
//        public static int countCharOccurrences(String input, char character){
//    int occurance = 0;
//   int index = input.indexOf(character);
//          if (index <0){
//            occurance = -1;
//         }else{
//         while (index >= 0){
//        occurance++;
//        input = input.substring(0, index)+input.substring(index+1);  -> Р=ОБЯЗАТЕЛЬНО ИСКЛЮЧИТЬ!!!!!!!!OTHERWISE THE LOOP BE INFINITE CONTINUOUSLY COUNTING THIS SAME CHARACTER
//        index = input.indexOf(character);
//        }
//    }return occurance;
//}
    }
 }


//calculate two numbers
// import java.util.Scanner;
//
//public class Main {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        char yesOrNo;
//
//        do {
//            System.out.println("Enter first number:");
//            double firstNum = sc.nextDouble();
//
//            System.out.println("Enter second number:");
//            double secondNum = sc.nextDouble();
//
//            System.out.println("Enter operator (+, -, *, /):");
//            char operator = sc.next().charAt(0);
//
//            double result = 0.0;
//          if (secondNum == 0.0) { // Check for division by zero
//                    System.out.println("Result: Infinity");
//                }
//            if (operator == '+') {
//                result = firstNum + secondNum;
//                System.out.println("Result: " + result);
//            } else if (operator == '-') {
//                result = firstNum - secondNum;
//                System.out.println("Result: " + result);
//            } else if (operator == '*') {
//                result = firstNum * secondNum;
//                System.out.println("Result: " + result);
//            } else if (operator == '/') {
//                if (secondNum>0){
//                result = firstNum/secondNum;
//                System.out.println("Result: " + result);
//                }
//            }else {
//                System.out.println("Invalid operator!");
//            }
//            System.out.println("Do you want to continue? (y/n)\n");
//            yesOrNo = sc.next().charAt(0);
//        } while ( yesOrNo == 'y');
//        sc.close();
//    }
//}