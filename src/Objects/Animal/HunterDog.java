package Objects.Animal;

import Objects.X_Y;

public class HunterDog extends Animal {
    public HunterDog() {
        X_Y xy = random_location.random();
        this.x = xy.getX();
        this.y = xy.getY();
        this.speed = 1;
        this.type = "defender";
        this.activation = true;
        this.lives = Integer.MAX_VALUE;
        this.isHungry = false;
    }
}

