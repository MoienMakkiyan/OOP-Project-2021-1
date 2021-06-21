package Objects.Animal;

import Objects.X_Y;

public class Buffalo extends Animal{
    public Buffalo() {
        X_Y xy = random_location.random();
        this.x = xy.getX();
        this.y = xy.getY();
        this.speed = 1;
        this.type = "producer";
        this.activation = true;
        this.lives = 100;
    }
}
