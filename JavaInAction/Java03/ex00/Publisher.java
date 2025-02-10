package JavaInAction.Java03.ex00;

public class Publisher {
    private int state;
    private Subscriber subscriber;

    public void changeState(int newState) {
        this.state = newState;
        if(subscriber != null) {
            subscriber.update(this);
        }
    }

    public Publisher(int initialState) {
        this.state = initialState;
    }

    public void setSubscriber(Subscriber subscriber){
        this.subscriber = subscriber;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Subscriber getSubscriber() {
        return subscriber;
    }
}   
