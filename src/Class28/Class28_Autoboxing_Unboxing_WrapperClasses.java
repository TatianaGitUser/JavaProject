package Class28;

public class Class28_Autoboxing_Unboxing_WrapperClasses {
    public static void main(String[] args) {

    Integer num = 27; // autoboxing - concept that converts literal values of
        // primitive data types into wrapper classes.

        int num2 = new Integer (24); // unboxing
        // unboxing - process of converting Wrapper classes into corresponding primitive data types.

        int sum = num+num2;
        System.out.println(sum);

        Double d = 25.0;
        Double d2 = 2.5;
        double result = d/d2;
        System.out.println(result);
    }
}
