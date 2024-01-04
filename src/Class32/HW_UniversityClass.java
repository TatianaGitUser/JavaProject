package Class32;

public class HW_UniversityClass {
    public static void main(String[] args) {
        University uni1 = new University("ODU", "Norfolk",
                1999, 3000);
        System.out.println(uni1.location);
    }
}
    class University{
        public String name;
        public String location;
        public int establishedYear;
        public int studentCount;

        public University(){
            name = "Unknown";
            location = "Unknown";
        }
        public University(String name){
            this.name = name;
            location = "Unknown";
        }
        public University(String name, String location, int establishedYear){
            this.name = name;
            this.location = location;
            this.establishedYear = establishedYear;
        }
        public University(String name, String location, int establishedYear, int studentCount){
            this.name = name;
            this.location = location;
            this.establishedYear = establishedYear;
            this.studentCount = studentCount;
        }
    }
