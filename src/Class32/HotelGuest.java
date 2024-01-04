package Class32;

public class HotelGuest {
    public static void main(String[] args) {
        Guest first = new Guest(1, "Sarah", 25, true);
System.out.println(Guest.getTotalGuests());
    }
}
class Guest{
    private static int totalGuests;
    private static String hotelName;
    private int guestId;
    private String guestName;
    private int age;
    private boolean isRegular;
    public static final int MAX_AGE = 100;
    public static final int MAX_GUESTS = 100;
    public Guest(int guestId, String guestName, int age, boolean isRegular){
        this.guestId = guestId;
        this.guestName = guestName;
        this.age = age;
        this.isRegular = isRegular;
        totalGuests++;
    }
    public static int getTotalGuests(){
        return totalGuests;
    }
    public static String getHotelName(){
        return hotelName;
    }
    public static String setHotelName(String name){
        hotelName = name;
        return hotelName;
    }
    public void displayGuestDetails(){
        System.out.println("Guest Details: \nGuest ID: "+guestId+"\nName: "+guestName+"\nAge: "+age+"\nRegular: "
                +isRegular);
    }
}
