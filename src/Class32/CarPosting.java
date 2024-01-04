package Class32;

public class CarPosting {
    public String make;
    public String model;
    public int carYear;
    public double askingPrice;
    public int mileage;
    public String drive;
    public String color;
    public boolean isCleanTitle;

//    constructors are used to initialize an object and to iniialize
//    variables (aka characteristics)

    public CarPosting(String carMake, String carModel, int carYearA, double price, int carMileage,
                      String carDrive, String carColor, boolean isCarCleanTitle){
        make = carMake;
        model = carModel;
        carYear = carYearA;
        askingPrice = price;
        mileage = carMileage;
        drive = carDrive;
        color = carColor;
        isCleanTitle = isCarCleanTitle;
    }

//    constructor Overloading gives you an ability to create multiple constructors with
//    different set of parameters
    public CarPosting(String carMake, String carModel, int carYearA, double price){
        make = carMake;
        model = carModel;
        carYear = carYearA;
        askingPrice = price;

    }
    public CarPosting(int carMileage, double price){
        mileage = carMileage;
        askingPrice = price;
    }
}
class Main4{
    public static void main(String[] args) {
        CarPosting post1 = new CarPosting("Ferrari", "418", 2022,
                350000, 100, "RWD", "Red", true);

        System.out.println(post1.askingPrice);
        System.out.println(post1.color);

        CarPosting post2 = new CarPosting("Rolls Royce", "Cullinan",
                2023, 450000.0);

        CarPosting post3 = new CarPosting(50000, 10000.00);
        System.out.println(post2.askingPrice);
        System.out.println(post3.mileage);

        System.out.println(post2.color);//default value if not initialized

    }
}