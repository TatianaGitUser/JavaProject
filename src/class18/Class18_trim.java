package class18;

public class Class18_trim {
    public static void main(String[] args) {
        String str = "  Hello Superstar ";
        String str2s = str.trim();
        System.out.println(str2s);

        String str3 = "Mars SpaceX  ";
        String str4 = str3.trim();
        System.out.println(str4);
//        cuts out the empty (white) spaces at the beginning and at the end

        int payment = 3000;
        double percent = 0.2;
        double myCharge = payment*percent;
        System.out.println(myCharge);


    }
}
