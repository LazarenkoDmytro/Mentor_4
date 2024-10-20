public class Main {

    public static void main(String[] args) {
        Board board = new Board();

        board.addShape(0, new Circle(3, new Point(0, 0)));
        board.addShape(2, new Triangle(new Point(0, 0), new Point(1, 1), new Point(0, 1)));
        board.addShape(3, new Rectangle(new Point(0, 0), new Point(0, 1), new Point(2, 1), new Point(2, 0)));

        board.printBoard();
    }
}
