package JavaInAction.Java00.ex05;

public class Table {
    public int size;

    public Table(int size) {
        this.size = size;
    }

    public void printTable() {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Inserisci la grandezza della tabella: ");
        int size = scanner.nextInt();
        scanner.close();
        Table table = new Table(size);
        table.printTable();
    }
}