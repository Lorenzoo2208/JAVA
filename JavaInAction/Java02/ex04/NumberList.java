package JavaInAction.Java02.ex04;
import java.util.ArrayList;
import java.util.List;

public class NumberList {
    private List<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        NumberList nl = new NumberList();
        nl.addNumber(5);
        nl.addNumber(10);
        nl.addNumber(20);
        System.out.println(nl.sumNumbers());
    }


    
}
