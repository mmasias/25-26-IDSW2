class Turn {

    private int currentPlayer;

    public Turn() {
        currentPlayer = (int) (Math.random() * 2);
    }

    public int getCurrentPlayer() {
        return currentPlayer;
    }

    public int getNextPlayer() {
        return (currentPlayer + 1) % 2;
    }

    public void switchPlayer() {
        currentPlayer = this.getNextPlayer();
    }
}
