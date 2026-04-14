import java.util.Scanner;

public class ConsoleView implements View {

    private Scanner scanner = new Scanner(System.in);

    public void displayBoard(char[][] cells) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                System.out.print(" " + cells[i][j]);
            }
            System.out.println();
        }
    }

    public Coordinate requestCoordinate() {
        System.out.print("> Row? [1..3] ");
        int row = scanner.nextInt();
        System.out.print("> Column? [1..3] ");
        int column = scanner.nextInt();
        return new Coordinate(row, column);
    }

    public void displayWinner(char color) {
        System.out.println("The winner is " + color);
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}
