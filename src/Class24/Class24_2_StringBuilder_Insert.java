package Class24;

public class Class24_2_StringBuilder_Insert {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("wedevxco");
//        insert index, String str
        sb.insert(6, ".");
        System.out.println(sb);

        StringBuilder sb1= new StringBuilder("John Doe");
        sb1.insert(4, " Black Hand");
        System.out.println(sb1);
    }
}
