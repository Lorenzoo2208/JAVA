package JavaInAction.Java02.ex02;

public class BoxedDouble extends ModifyDouble {
    private double value;
    
    public BoxedDouble(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
