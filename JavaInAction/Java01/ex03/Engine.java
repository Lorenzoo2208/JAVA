package JavaInAction.Java01.ex03;

public class Engine extends RaceCar {
    int horsepower;

    Engine(int horsepower) {
        this.horsepower = horsepower;
    }

    String getDetails() {
        return "Brand: " + brand + "\nYear: " + year + "\nHorsepower: " + horsepower;
    }
}
