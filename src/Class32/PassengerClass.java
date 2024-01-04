package Class32;

public class PassengerClass {
    public static void main(String[] args) {

    }
}
class Passenger{
    public static final int MAX_CAPACITY = 200;
    public static final String PASSENGER_TYPE = "Regular";
    private int passengerId;
    private String passengerName;
    private int age;
    private boolean isFrequentFlyer;
    private static int totalPassengers;
    private static String airlineName;
    public Passenger(int passengerId, String passengerName, int age, boolean isFrequentFlyer){
        this.passengerId =passengerId;
        this.passengerName = passengerName;
        this.age = age;
        this.isFrequentFlyer = isFrequentFlyer;
        totalPassengers++;
    }
    public void printPassengerType(){
        System.out.println(PASSENGER_TYPE);
    }
    public String changePassengerName(String newName){
        passengerName = newName;
        return passengerName;
    }
    public static int getTotalPassengers(){
        return totalPassengers;
    }
    public static String getAirlineName(){
        return airlineName;
    }
    public static void setAirlineName(String name){
        airlineName = name;
    }
    public void displayPassengerDetails(){
        System.out.println("Passenger Details:");
        System.out.println("Passenger ID: "+passengerId);
        System.out.println("Name: "+passengerName);
        System.out.println("Age: "+ age);
        System.out.println("Frequent Flyer: " +isFrequentFlyer);
    }
}