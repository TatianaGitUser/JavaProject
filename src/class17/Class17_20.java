package class17;

public class Class17_20 {
    public static void main(String[] args) {
        boolean var = needVisa("USA");
        System.out.println(var);
        boolean var2 = needVisa("France");
        System.out.println(var2);

    }
    public static boolean needVisa(String countryOfResidence){
        switch (countryOfResidence){
            case "USA":
            case "Canada":
                return false;
            default:
                return true;
        }
    }
}
