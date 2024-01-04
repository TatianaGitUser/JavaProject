package class18;

public class Class18_7_strartWith_EndWith {
    public static void main(String[] args) {
        String str = "Hello wedevx";

//        case sensitive
        boolean doesStrStartWithHello = str.startsWith("Hello");
        System.out.println(doesStrStartWithHello);

        String str4 = "sent to Elon Musk: Hi Elon, I'm a big fan of yours";
        boolean b = str4.startsWith("sent to Elon Musk");
        System.out.println(b);

//        boolean values
        String str5 = "Apple is the biggest company";

        boolean b5 = str5.endsWith("company");
        System.out.println(b5);
        boolean b6 = str5.endsWith("Apple");
        System.out.println(b6);
    }
}
