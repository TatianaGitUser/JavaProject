package class17;

public class Class17_14 {
    public static void main(String[] args) {
        int var = multiply(30,42);
        System.out.println(var);
        int average = calculateAverage(10,40,55,66);
        System.out.println(average);
    }
    public static int multiply(int num1, int num2){
        return num1*num2;
    }
    public static int calculateAverage(int num1, int num2, int num3, int num4){
        return (num1+num2+num3+num4)/4;
    }
}



