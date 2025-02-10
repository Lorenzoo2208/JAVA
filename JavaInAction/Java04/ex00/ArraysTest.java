package JavaInAction.Java04.ex00;

public class ArraysTest {
    private static final Integer[] intArray = {1, 2, 3};
    private static final String[] strArray = {"one", "two", "three"};

    public static void main(String[] args) {
        modifyArrays();
        printArray(intArray);
        printArray(strArray);
    }

    public static void printArray(Object[] array) {
        System.out.println(java.util.Arrays.toString(array));
    }

    public static void modifyArrays() {
        intArray[1] = 99;
        strArray[1] = "ninetynine";
    }
}