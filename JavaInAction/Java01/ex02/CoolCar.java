package JavaInAction.Java01.ex02;

public class CoolCar {
    String brand;
    int year;

    public static void main(String[] args) {
        CoolCar car = new CoolCar("Ford", 2023);
        System.out.println(car.getDetails());
    }

    String getDetails() {
        return "Brand: " + brand + "\nYear: " + year;
    }

    CoolCar(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
}