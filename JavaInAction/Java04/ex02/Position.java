package JavaInAction.Java04.ex02;

public class Position {
    int row, col;

    @Override
    public String toString() {
        return "(" + row + ", " + col + ")";
    }

    public Position(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public Position(Position p) {
        this.row = p.row;
        this.col = p.col;
    } 
}