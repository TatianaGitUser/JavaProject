package Class25Arrays;

public class Class25_3_Array_DifferentDataTypes {
    public static void main(String[] args) {
        double[]ratings = {4.5, 4.6, 5.0, 3.5};
        System.out.println(ratings[1]);

        double[] salaries = new double[4];//each of 4 elements have default value
//        int default value = 0.
//        double default value = 0.0
        System.out.println(salaries[0]);

        char [] grades = {'A', 'B', 'A', 'C', 'F', 'D'};
        System.out.println(grades[3]);

        char [] grades2 = new char[3];
//        char default value = \u0000 -> empty character
        System.out.println(grades2[0]);

        String []employeeNames = {"Steve", "Elon", "Erica", "Aisha"};
        System.out.println(employeeNames[3]);

        String[]cities = new String[6];
//        String default value = null;
//        null is a default value of any object
        System.out.println(cities[0]);

        boolean[]answers = {true, false, true, true, false};
        System.out.println(answers[3]);

        boolean[]answers1 = new boolean[10];
        System.out.println(answers1[2]);
//        default value for boolean is false

        }
    }

