package JavaInAction.Java03.ex00;

public class Subscriber {
    public void update(Publisher p){
        System.out.println(p.getState());
    }
}
