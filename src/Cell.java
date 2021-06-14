import Objects.Animal.Animal;

public class Cell {
    public static Cell cells[];

    protected int x;
    protected int y;
    protected Animal animal;
    protected Product products;

    private boolean HasProduct() {
        return true;
    }

    private boolean HasAnimal() {
        return true;
    }

    public boolean isEmpty() {
        return !(HasAnimal() || HasProduct());
    }

    public static void makeCell(int size) {
        cells = new Cell[size * size];
        for (int i = 0; i < size * size; i++) {
            cells[i].x = i / size + 1;
            cells[i].y = i % size + 1;
        }
    }


}
