package JavaInAction.Java03.ex01;

public class CopyConstructorTest {
    public static void main(String[] args) {
        Book original = new Book("1984", "George Orwell");
        Book copy = new Book(original);

        original.display();
        copy.display();
    }
}
