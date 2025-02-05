package JavaInAction.Java01.ex03;

public class RaceCar {
    String brand;
    int year;
    Engine engine;

    public static void main(String[] args) {
        Engine engine = new Engine(450);
        RaceCar car = new RaceCar("Dodge", 2021, engine);
        System.out.println(car.getDetails());
    }

    RaceCar (String brand, int year, Engine engine) {
        this.brand = brand;
        this.year = year;
        this.engine = engine;
    }

    public String getDetails() {
        return "Brand: " + brand + "\nYear: " + year + "\nHorsepower: " + engine.horsepower;
    }
}
