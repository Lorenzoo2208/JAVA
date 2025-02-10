package JavaInAction.Java02.ex02;

public class ModifyDouble {
    public static void main(String[] args) {
        double primitive = 5.0;
        modifyPrimitive(primitive);
        System.out.println("After modifyPrimitive: " + primitive);

        BoxedDouble boxed = new BoxedDouble(5.0);
        ModifyBoxed(boxed);
        System.out.println("After modifyBoxed: " + boxed.getValue());
    }

    public static void modifyPrimitive(double value){
        value *= 2;
    }

    public static void ModifyBoxed(BoxedDouble value){
        value.setValue(value.getValue()* 2);
    }

    
}
