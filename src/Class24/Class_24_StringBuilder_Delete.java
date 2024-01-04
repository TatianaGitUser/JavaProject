package Class24;

public class Class_24_StringBuilder_Delete {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello Superstar");

//        takes 2 params: startin index, not inclusive, and ending index
        sb.delete(0,6);
        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder("SDET is my future career");
        sb1.delete(10, 17);
        System.out.println(sb1);
    }
}
