package class17;

public class Class17_9 {
    public static void main(String[] args) {
        Class17_9 obj = new Class17_9();
        char var = obj.work();
        System.out.println(var);
        char genderReturn = obj.genderReturn();
        System.out.println(genderReturn);
    }
    public char work(){
        return 'A';
    }
    public char genderReturn(){
        return 'F';
    }
}
