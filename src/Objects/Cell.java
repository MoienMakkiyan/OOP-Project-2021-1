package Objects;

import java.util.ArrayList;

public class Cell {

    private int x;
    private int y;
    private ArrayList<String> animals;
    private ArrayList<String> products;
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

    public ArrayList<String> getAnimals() {
        return animals;
    }

    public void AddProduct (String name,int index){
        name+=String.valueOf(index);
        products.add(name);
    }

    public void AddAnimal(String name){
        animals.add(name);
    }

    public void RemoveAnimal(String name){
        animals.remove(name);
    }

    public boolean hasGrass(){
        if (hasGrass>0) return true;
        else return false;
    }

    public void eatGrass(){
        hasGrass--;
    }

    public ArrayList<String> getProducts() {
        return products;
    }

    public int getHasGrass() {
        return hasGrass;
    }
}
