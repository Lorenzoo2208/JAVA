package JavaInAction.Java05.ex00;

public class StaticFieldsTest {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        InstanceCounter instance;
        instance = new InstanceCounter();
        instance = new InstanceCounter();
        instance = new InstanceCounter();
        System.out.println("Instance count:" + InstanceCounter.count);
        //Expected: Instance count: 3
        
    }
}
