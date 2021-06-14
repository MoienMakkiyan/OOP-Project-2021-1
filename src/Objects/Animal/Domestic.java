package Objects.Animal;

import java.util.ArrayList;

public class Domestic extends Animal {

    private Product product;
    private int timeToProduce;
    private TypeD typeD;
    protected int lives = 10;
    public static ArrayList<Domestic> domestics = new ArrayList<>(0);

    Domestic(String type) {
        super(type);
        if (type .equalsIgnoreCase("CHICKEN")) {
            this.product = Product.egg;
            this.timeToProduce = 2;
            this.typeD = TypeD.chicken;
        } else if (type.equalsIgnoreCase("OSTRICH")) {
            this.product = Product.feather;
            this.timeToProduce = 3;
            this.typeD = TypeD.Ostrich;
        } else if (type.equalsIgnoreCase("BUFFALO")) {
            this.product = Product.milk;
            this.timeToProduce = 5;
            this.typeD = TypeD.Buffalo;
        }
    }

    public void reduceLives() {
        lives--;
    }

    public void eat() {
        if (lives <= 5) {// TODO
            this.lives = 10;
        }
    }
}

enum Product {
    egg,
    feather,
    milk
}

enum TypeD {
    chicken,
    Ostrich,
    Buffalo
}
