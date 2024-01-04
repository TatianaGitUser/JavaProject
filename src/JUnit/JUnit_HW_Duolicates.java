//package JUnit;
//
//public class JUnit_HW_Duolicates {
//    import static org.junit.jupiter.api.Assertions.assertEquals;
//import org.junit.jupiter.api.Test;
//import java.util.List;
//import java.util.ArrayList;
//
//    class Student {
//        private static int nextId = 1; // Tracks the next available ID
//        private int id;
//        private String name;
//        private int age;
//
//        public Student(String name, int age) {
//            this.id = nextId++;
//            this.name = name;
//            this.age = age;
//
//            // Print student details
//            System.out.println("New Student created:");
//            System.out.println("ID: " + id);
//            System.out.println("Name: " + name);
//            System.out.println("Age: " + age);
//        }
//
//        public Student duplicate() {
//            return new Student(this.name, this.age); // ID will be auto-incremented
//        }
//
//        // Getters for name, age, and id (for testing purposes)
//        public String getName() {
//            return name;
//        }
//
//        public int getAge() {
//            return age;
//        }
//
//        public int getId() {
//            return id;
//        }
//        @Override
//        public boolean equals(Object obj) {
//            if (this == obj) {
//                return true;
//            }
//            if (obj == null || getClass() != obj.getClass()) {
//                return false;
//            }
//            Student student = (Student) obj;
//            return age == student.age && name.equals(student.name);
//        }
//    }
//
//    class MainTest {
//        @Test
//        public void testDuplicate(){
//            Student one = new Student("John", 22);
//            Student two = one.duplicate();
//            assertEquals(one, two);
//        }@Test
//        public void testDuplicateMultipleStudents(){
//            List<Student> studentList = new ArrayList<>();
//            Student one = new Student("John", 22);
//            Student two = new Student("Jason", 23);
//            Student three = new Student("Jerome", 22);
//            studentList.add(one);
//            studentList.add(two);
//            studentList.add(three);
//            List<Student> duplicates = new ArrayList<>();
//            Student four = one.duplicate();
//            Student five = two.duplicate();
//            Student six = three.duplicate();
//            duplicates.add(four);
//            duplicates.add(five);
//            duplicates.add(six);
//            assertEquals(studentList, duplicates);
//        }
//    }
//}
