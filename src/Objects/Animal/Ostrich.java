package Objects.Animal;

public class Ostrich extends Domestic{
    private int timeToProduce;
    private String name;

    Ostrich(String name) {
        super(name);
        this.timeToProduce = 3;
        this.name =name;
    }
}
