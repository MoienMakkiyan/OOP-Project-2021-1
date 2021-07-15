package Objects.Animal;

import Functions.Random_Location;
import Objects.X_Y;

public class Bear extends Animal{


    public Bear() {
        X_Y xy = Random_Location.getInstance().random();
        this.x = xy.getX();
        this.y = xy.getY();
        this.speed = 1;
        this.type = "wild";
        this.activation = true;
        this.lives = 4;
        this.isHungry = false;
    }
}
