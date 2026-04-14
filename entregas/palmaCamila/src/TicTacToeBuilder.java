public class TicTacToeBuilder {

    private View view;

    public TicTacToeBuilder withView(View view) {
        this.view = view;
        return this;
    }

    public TicTacToe build() {
        if (view == null)
            throw new IllegalStateException("TicTacToe requires a View");
        return new TicTacToe(view);
    }
}
