public class Coordinate {

    private int row;
    private int column;

    public Coordinate(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public boolean isValid() {
        return (row >= 1 && row <= 3 && column >= 1 && column <= 3);
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

}
