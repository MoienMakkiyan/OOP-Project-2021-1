package Objects.Animal;

import Objects.X_Y;

public class Tiger extends Animal {

    Tiger() {
        X_Y xy = random_location.random();
        this.x = xy.getX();
        this.y = xy.getY();
        this.speed = 1;
        this.type = "wild";
        this.activation = true;
        this.lives = 4;
        this.isHungry = false;
    }
}
