package Objects.Animal;

import Functions.Random_Location;
import Objects.X_Y;

public class Bear extends Animal{

    private int cage_counter;
    public Bear() {
        X_Y xy = Random_Location.getInstance().random();
        this.x = xy.getX();
        this.y = xy.getY();
        this.speed = 2;
        this.type = "wild";
        this.activation = true;
        this.lives = 4;
        this.isHungry = false;
        cage_counter = 0;
    }

    public int getCage_counter() {
        return cage_counter;
    }

    public void setCage_counter(int cage_counter) {
        this.cage_counter = cage_counter;
    }
}
