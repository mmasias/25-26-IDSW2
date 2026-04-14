class Main {
    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToeBuilder()
            .withView(new ConsoleView())
            .build();
        ticTacToe.play();
    }
}