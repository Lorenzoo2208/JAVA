package JavaInAction.Java04.ex01;

public class Matrix {
    private int rows;
    private int cols;
    int j; 
    int i = 0;

    public Matrix(int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print((i * cols) + j + 1 + "\t");
            }
            System.out.println();
        }
    }

    public void print() {
        System.out.print("");    
    }

    public int getRows() {
        return rows;
    }
    public void setRows(int rows) {
        this.rows = rows;
    }
    public int getCols() {
        return cols;
    }
    public void setCols(int cols) {
        this.cols = cols;
    }

     
}
