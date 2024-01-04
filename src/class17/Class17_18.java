package class17;

public class Class17_18 {
    public static void main(String[] args) {
        char grade = calculateExamResult(90, 85, 100);
        System.out.println(grade);
        char grade2 = calculateExamResult(60,80,70);
        System.out.println(grade2);
        char grade3 = calculateExamResult(1000,2000,3000);
        System.out.println(grade3);

    }

    public static char calculateExamResult(int score1, int score2, int score3) {
        int average = (score1 + score2 + score3) / 3;
        if (average <= 100 && average >= 90) {
            return 'A';
        } else if (average < 90 && average >= 80) {
            return 'B';
        } else if (average < 80 && average >= 70) {
            return 'C';
        } else if (average < 70 && average >= 60) {
            return 'D';
        } else if (average < 60) {
            return 'F';
        } else {
            System.out.println("Given scores were wrong");
            return '0';
        }
    }
}
