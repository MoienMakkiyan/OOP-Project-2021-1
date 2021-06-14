package Objects;

import java.util.ArrayList;

public class Cell {

    private int x;
    private int y;
    ArrayList<String> animals;
    ArrayList<String> products;
    private boolean hasGrass;

    public Cell(int x , int y) {
        this.x = x;
        this.y = y;
        animals = new ArrayList<>();
        products = new ArrayList<>();
    }

    public void setHasGrass(boolean hasGrass) {
        this.hasGrass = hasGrass;
    }
}
