public class TresEnRaya {

    private Board board;
    private Player[] players;
    private Turn turn;
    private View view;

    public TresEnRaya(View view) {
        this.view = view;
        board = new Board();
        players = new Player[2];
        players[0] = new Player('x');
        players[1] = new Player('o');
        turn = new Turn();
    }

    public void play() {
        do {
            view.displayBoard(board.getCells());
            Player currentPlayer = players[turn.getCurrentPlayer()];

            if (!board.isComplete(currentPlayer)) {
                placePiece(currentPlayer);
            } else {
                movePiece(currentPlayer);
            }

            turn.switchPlayer();
        } while (!board.hasThreeInARow());

        displayResult();
    }

    private void placePiece(Player player) {
        Coordinate coordinate;
        do {
            coordinate = view.requestCoordinate();
        } while (!isValidDestination(coordinate));
        board.placePiece(coordinate, player.getColor());
    }

    private void movePiece(Player player) {
        Coordinate origin = requestOrigin();
        board.removePiece(origin);

        Coordinate destination = requestDestination();
        board.placePiece(destination, player.getColor());
    }

    private Coordinate requestOrigin() {
        Coordinate origin;
        do {
            view.displayMessage("Select the piece to move:");
            origin = view.requestCoordinate();
        } while (!isValidOrigin(origin));
        return origin;
    }

    private Coordinate requestDestination() {
        Coordinate destination;
        do {
            view.displayMessage("Select where to move it:");
            destination = view.requestCoordinate();
        } while (!isValidDestination(destination));
        return destination;
    }

    private boolean isValidDestination(Coordinate coordinate) {
        return coordinate.isValid() && !board.isOccupied(coordinate);
    }

    private boolean isValidOrigin(Coordinate coordinate) {
        return coordinate.isValid() && !board.isEmpty(coordinate);
    }

    private void displayResult() {
        view.displayBoard(board.getCells());
        view.displayWinner(players[turn.getNextPlayer()].getColor());
    }
}
