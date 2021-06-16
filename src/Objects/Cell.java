package Objects;

import java.util.ArrayList;

public class Cell {

    private int x;
    private int y;
    ArrayList<String> animals;
    ArrayList<String> products;
    private int hasGrass;

    public Cell(int x , int y) {
        this.x = x;
        this.y = y;
        hasGrass=0;
        animals = new ArrayList<>();
        products = new ArrayList<>();
    }

    public void addGrass() {
        this.hasGrass++;
    }

    public String takeProduct(){
        String back = "";
        if (products.size()>0){
            back = products.get(0);
            products.remove(0);
        }
        else {
            //TODO
        }
        return back;
    }
}
