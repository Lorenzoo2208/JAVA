package JavaInAction.Java04.ex02;

public class Matrix {
    
    public Matrix(int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print((i * cols) + j + 1 + "\t");
            }
            System.out.println();
        }
    }
    
    
}
