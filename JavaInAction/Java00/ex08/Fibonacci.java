package JavaInAction.Java00.ex08;

public class Fibonacci {

public static int fibonacci(int MAX) {

    if (MAX <= 1) {
        return MAX;
    } else {
        return fibonacci(MAX - 2) + fibonacci(MAX - 1);
    }
}
public static void main(String[] args) {
    int MAX = 10;
    
    for (int i = 0; i < MAX; i++) {
        System.out.print(fibonacci(i) + " ");
    }
}
}
