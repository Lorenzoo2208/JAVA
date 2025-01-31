package JavaInAction.Java00.ex03;

public class Even {
    public static void main(String[] args) {
        // True
        System.out.println(isEven(6));
        // False
        System.out.println(isEven(9));
    }

    public static boolean isEven(int n){
        return n % 2 == 0;
    }

}