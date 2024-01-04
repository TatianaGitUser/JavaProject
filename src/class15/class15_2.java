package class15;

public class class15_2 {
    public static void main(String[] args) {
        char grade = 'C';
        switch (grade){
            default:
                System.out.println("Invalit Input");
                break;
            case 'A':
            System.out.println("Excellent work!");
            break;
            case 'B':
                System.out.println("Good Work!");
            break;
                case 'C':
                System.out.println("Average Work!");
            break;
                case 'D':
                System.out.println("Bad Work!");
            break;
                case 'F':
                System.out.println("Failed Work!");
        break;

        }
    }
}
