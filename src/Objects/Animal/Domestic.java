package Objects.Animal;

import java.util.ArrayList;

public class Domestic extends Animal {

    protected int lives = 10;

    Domestic(String type) {
        super(type);
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

