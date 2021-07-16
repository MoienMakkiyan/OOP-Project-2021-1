package Objects.Animal;

import Functions.Random_Location;
import Objects.X_Y;

public class Lion extends Animal {

    public Lion() {
        X_Y xy = Random_Location.getInstance().random();
        this.x = xy.getX();
        this.y = xy.getY();
        this.speed = 1;
        this.type = "wild";
        this.activation = true;
        this.lives = 3;
        this.isHungry = false;
    }
}
