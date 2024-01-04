package Class32;

import java.util.ArrayList;
import java.util.List;

public class HouseClass {
    public static void main(String[] args) {

    }
}
class House{
    private String address;
    private List<Room> rooms = new ArrayList<>();
    private static int totalHouses;
    public House(String address){
        this.address = address;
        totalHouses++;
    }
    public String getAddress(){
        return address;
    }
    public Room getRoom(int roomNumber){
        return rooms.get(roomNumber);
    }
    public void setAddress(String address){
        this.address = address;
    }
    public List getRooms(){
        return rooms;
    }
    public void setRooms(List<Room> rooms){
        this.rooms = rooms;
    }
    public void addRoom(Room room){
        rooms.add(room);
    }
    public static int getTotalHouses(){
        return totalHouses;
    }
}
class Room{
    private int roomNumber;
    private Door door;
    private Window window;
    public Room(int roomNumber, Door door, Window window){
        this.roomNumber = roomNumber;
        this.door = door;
        this.window = window;
    }
    public void setDoor(Door door){
        this.door = door;
    }
    public void setWindow(Window window){
        this.window = window;
    }
    public void setRoomNumber(int roomNumber){
        if(roomNumber>0){
            this.roomNumber=roomNumber;
        }else if(roomNumber<=0){
            System.out.println("Room number must be a positive integer.");
            this.roomNumber = 2;
            System.out.println("Room number must be a positive integer.");

        }
    }
    public int getRoomNumber(){
        return roomNumber;
    }
    public Door getDoor(){
        return door;
    }
    public Window getWindow(){
        return window;
    }
}
class Door{
    private String material;
    private String color;
    public Door(String material, String color){
        this.material = material;
        this.color = color;
    }
    public void setColor (String color){
        this.color = color;
    }
    public void setMaterial(String material){
        this.material = material;
    }
    public String getColor(){
        return color;
    }
    public String getMaterial(){
        return material;
    }

}
class Window{
    private String size;
    private String type;
    public Window(String size, String type){
        this.size = size;
        this.type = type;
    }
    public void setSize(String size){
        this.size = size;
    }
    public String getType(){
        return type;
    }
    public String getSize(){
        return size;
    }
    public void setType(String type){
        this.type = type;
    }
}