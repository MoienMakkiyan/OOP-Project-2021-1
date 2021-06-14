package Objects.Animal;

public class Buffalo extends Domestic{
    private int timeToProduce;
    private String name;

    Buffalo(String name) {
        super(name);
        this.timeToProduce = 5;
        this.name =name;
    }
}
