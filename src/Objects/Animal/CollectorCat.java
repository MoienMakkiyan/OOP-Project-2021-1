package Objects.Animal;

import Functions.Random_Location;
import Objects.X_Y;

public class CollectorCat extends Animal {
    public CollectorCat() {
        X_Y xy = Random_Location.getInstance().random();
        this.x = xy.getX();
        this.y = xy.getY();
        this.speed = 1;
        this.type = "defender";
        this.activation = true;
        this.lives = Integer.MAX_VALUE;
        this.isHungry = false;
    }
}

