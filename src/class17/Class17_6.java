package class17;

public class Class17_6 {
    public static void main(String[] args) {
String var = giveMyName();
System.out.println(var);
String lastName = giveMyLastName();
System.out.println(lastName);
String elonFullName = printElonMusk();
System.out.println(elonFullName);
    }
    public static String giveMyName(){
        return "Tatiana";
    }
    public static String giveMyLastName(){


    return "Sharko";
}
public static String printElonMusk(){
        String firstName = "Elon";
        String lastName = "Musk";
        return firstName+" "+lastName;
}
}