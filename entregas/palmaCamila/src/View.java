public interface View {
    void displayBoard(char[][] cells);
    Coordinate requestCoordinate();
    void displayWinner(char color);
    void displayMessage(String message);
}
