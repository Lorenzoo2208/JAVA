package JavaInAction.Java00.ex04;

public class Natural {
    public static void main(String[] args) {
        Natural natural = new Natural();
        natural.printNatural(10);
    }

public void printNatural(int N) {
    for (int i = 1; i <= N; i++) {
        if (i > 1) {
            System.out.print(", ");
        }
        System.out.print(i);
    }
}
}