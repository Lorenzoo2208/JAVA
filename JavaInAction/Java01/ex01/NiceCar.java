package JavaInAction.Java01.ex01;

public class NiceCar {
    String brand;
    int year;

public static void main(String[] args) {
    NiceCar Car = new NiceCar("Honda", 2023);   
    System.out.println("Brand: " + Car.brand + "\nYear: " + Car.year);
}

NiceCar(String brand, int year) {
    this.brand = brand;
    this.year = year;
}

}