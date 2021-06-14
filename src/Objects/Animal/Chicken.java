package Objects.Animal;

public class Chicken extends Domestic {
    private int timeToProduce;
    private String name;

    Chicken(String name) {
        super(name);
        this.timeToProduce = 2;
        this.name =name;
    }

}