package JavaInAction.Java00.ex07;
import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quanti numeri vuoi inserire? ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        System.out.println("Inserisci i numeri:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Il valore massimo è: " + max);
        scanner.close();
    }
}
