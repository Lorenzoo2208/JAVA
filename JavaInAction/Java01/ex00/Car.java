package JavaInAction.Java01.ex00;

public class Car {
    String brand;
    int year;

public static void main(String[] args) {
    Car Car = new Car();
    Car.brand = "Toyota";
    Car.year = 2021;
    System.out.println("Brand: " + Car.brand + "\nYear: " + Car.year);
}
}