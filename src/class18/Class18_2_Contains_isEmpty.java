package class18;

public class Class18_2_Contains_isEmpty {
    public static void main(String[] args) {
        String str  = "Hello wedevxer!";
        boolean doesContainDevx = str.contains("devx");
    System.out.println("does contain devx? " +  doesContainDevx);

    boolean doesContainHello = str.contains("Hello");
    System.out.println(doesContainHello);
    boolean doesContainAmazon = str.contains("Amazon");
    System.out.println(doesContainAmazon);

    boolean doesContainQuestionMark = str.contains("devxer?");
        System.out.println(doesContainQuestionMark);
    }
}
