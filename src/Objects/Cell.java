package Objects;

import Objects.Animal.Animal;
import Objects.Products.Product;

public class Cell {
    public static Cell cells[];

    private int x;
    private int y;
    private Animal animal;
    private Product products;
    private boolean hasGrass;

    public boolean isHasGrass() {
        return hasGrass;
    }

    public void setHasGrass(boolean hasGrass) {
        this.hasGrass = hasGrass;
    }

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
    public void deleteGrass(int x,int y){
        Cell.cells[(int) (Math.sqrt(Cell.cells.length)*(x-1))+y-1].setHasGrass(false);
    }
}
