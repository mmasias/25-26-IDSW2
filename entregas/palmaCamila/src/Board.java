class Board {

    private char[][] cells;

    public Board() {
        cells = new char[3][3];

        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                cells[i][j] = '_';
            }
        }
    }

    public char[][] getCells() {
        return cells;
    }

    public boolean isComplete(Player player) {
        int pieceCount = 0;
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                if (cells[i][j] == player.getColor()) {
                    pieceCount++;
                }
            }
        }
        return pieceCount == 3;
    }

    public boolean hasThreeInARow() {
        return this.hasThreeInARow('x') || this.hasThreeInARow('o');
    }

    private boolean hasThreeInARow(char color) {
        int[] rows = new int[3];
        int[] columns = new int[3];
        int diagonal = 0;
        int secondaryDiagonal = 0;
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                if (color == cells[i][j]) {
                    rows[i]++;
                    columns[j]++;
                    diagonal = diagonal + ((i == j) ? 1 : 0);
                    secondaryDiagonal = secondaryDiagonal + ((i + j == 2) ? 1 : 0);

                    if (rows[i] == 3 || columns[j] == 3 || diagonal == 3 || secondaryDiagonal == 3) {
                        return true;
                    }

                }
            }
        }
        return false;
    }

    public boolean isOccupied(Coordinate coordinate) {
        return cells[coordinate.getRow() - 1][coordinate.getColumn() - 1] != '_';
    }

    public void placePiece(Coordinate coordinate, char color) {
        cells[coordinate.getRow() - 1][coordinate.getColumn() - 1] = color;
    }

    public boolean isEmpty(Coordinate coordinate) {
        return !isOccupied(coordinate);
    }

    public void removePiece(Coordinate coordinate) {
        cells[coordinate.getRow() - 1][coordinate.getColumn() - 1] = '_';
    }

}
