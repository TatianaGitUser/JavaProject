package class17;

public class Class17_7 {
    public static void main(String[] args) {
        int var = sum();
        System.out.println(var);
        int var2 = sum1();
        System.out.println(var2);
        int var3 = divide();
        int var4 = divide();
        System.out.println(var3);
        System.out.println(var4);
    }

    public static int sum() {
        return 10 + 5;
    }

    public static int sum1(){
        int num1 = 20;
        int num2 = 50;
        return num1*num2;
    }
    public static int divide(){
        System.out.println("I am a divide method");
        int num1 = 100;
        int num2 = 20;
        return num1/num2;
    }
}

//public class Main {
//    public static void main(String[] args) {
//       int year = getCurrentYear();
//       System.out.println(year);
//    }
//
//    public static int getCurrentYear(){
//        return 2023;
//    }
//}



//public class Main {
//    public static void main(String[] args) {
//   Main main = new Main();
//   int factorial = main.getFactorial();
//    System.out.println(factorial);
//    }
//public int getFactorial(){
//    int factorial = 5;
//    return (factorial*4*3*2*1);
//}
//}