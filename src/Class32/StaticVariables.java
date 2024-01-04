package Class32;

public class StaticVariables {
    public static void main(String[] args) {
        Sample obj1 = new Sample();
        Sample obj2 = new Sample();
        Sample obj3 = new Sample();
        Sample obj4 = new Sample();

        System.out.println(Sample.count);
        System.out.println(obj1.count);
//        all object are sharing and pointing to one variable with the same name
        System.out.println(obj2.count);
        System.out.println(Sample.companyName);
    }
}
class Sample{
    public static int count;
public static String companyName = "Wedevx.co INC";
    public Sample(){
        count++;//-the way to count, how many times this object has been used
    }
}