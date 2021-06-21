package Objects.Animal;

import Objects.X_Y;

public class Chicken extends Animal {

    int MAX_TIME;
    int CURRENT_TIME;

    public Chicken(int MAX_TIME) {
        X_Y xy = random_location.random();
        this.x = xy.getX();
        this.y = xy.getY();
        this.speed = 1;
        this.type = "producer";
        this.activation = true;
        this.lives = 100;
        this.MAX_TIME = MAX_TIME;
        this.CURRENT_TIME = 0;
    }
}