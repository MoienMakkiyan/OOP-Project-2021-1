package Objects.Animal;

import Objects.X_Y;

public class Lion extends Animal {

    Lion() {
        X_Y xy = random_location.random();
        this.x = xy.getX();
        this.y = xy.getY();
        this.speed = 1;
        this.type = "wild";
        this.activation = true;
        this.lives = 3;
    }
}
