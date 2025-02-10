package JavaInAction.Java04.ex02;

public class Matrix {
    
    private int[][] matrix;

	public Matrix(int rows, int cols) {
		matrix = new int[rows][cols];
		int y = 1;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++, y++) {
				matrix[i][j] = y;
			}
		}
	}

	public void print() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public Position find(int value) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == value) {
					return new Position(i, j);
				}
			}
		}
		return new Position(-1, -1);
	}
    
}
