package Class28;

public class Class28_ParseMethod_InWrapperClasses {
    public static void main(String[] args) {
        String str = "25";
        // parse take 1 param (String str)
        //parse = analyze
        byte num = Byte.parseByte(str);
        System.out.println(str);

        System.out.println(num);

        int b = num+10;
        System.out.println(b+"\n-----------------");

        String str1 = "2500";
        short num2 = Short.parseShort(str1);
        System.out.println(num2);

//        int sum2 = num2*10;
//        System.out.println(sum2);

        String str3 = "10000";
        int num3 = Integer.parseInt(str3);
        System.out.println(num3+10);

        String str4 = "12.5";
        double d = Double.parseDouble(str4);
        System.out.println(d-0.5);


        String str5 = "true";
        boolean bool = Boolean.parseBoolean(str5);
        System.out.println(bool);

        String str6 = "C";
        char a = str6.charAt(0);
    }
}
