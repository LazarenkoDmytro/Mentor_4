public class Board {

    private final Shape[] storage = new Shape[4];

    public Board() {
    }

    public void addShape(int idx, Shape s) {
        storage[idx] = s;
    }

    public void deleteShape(int idx) {
        storage[idx] = null;
    }

    public void printBoard() {
        double area = 0d;
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] != null) {
                System.out.println(storage[i] + " on position " + i);
                area += storage[i].getArea();
            }
        }

        System.out.printf("Total area = %.2f", area);
    }
}
