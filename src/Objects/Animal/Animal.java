package Objects.Animal;

import Functions.Random_Location;

public class Animal {

    protected Random_Location random_location = new Random_Location();
    protected int x;
    protected int y;
    protected int speed;
    protected int lives;
    protected String type;
    protected boolean activation;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isActivation() {
        return activation;
    }

    public void setActivation(boolean activation) {
        this.activation = activation;
    }

    public void walking() {
        int direction = assignDirection(speed);
        assignXY(direction, speed);
    }

    private int assignDirection(int speed) {
        int direction = 0;
        if (this.x > 6 - speed && this.y <= 6 - speed && this.y >= 1 + speed) {
            direction = 3 + (int) (Math.random() * (5));
            if (direction == 3) {
                direction = 0;
            }
        } else if (this.x < 1 && this.y <= 6 - speed && this.y >= 1 + speed) {
            direction = (int) (Math.random() * (5));
        } else if (this.x >= 1 + speed && this.x <= 6 - speed && this.y < 1 + speed) {
            direction = 2 + (int) (Math.random() * (5));
        } else if (this.x >= 1 + speed && this.x <= 6 - speed && this.y > 6 - speed) {
            direction = (int) (Math.random() * (5));
            if (direction == 3) {
                direction = 6;
            } else if (direction == 4) {
                direction = 7;
            }
        } else if (this.x < 1 + speed && this.y < 1 + speed) {
            direction = 2 + (int) (Math.random() * (3));
        } else if (this.x > 6 - speed && this.y < 1 + speed) {
            direction = 4 + (int) (Math.random() * (3));
        } else if (this.x < 1 + speed && this.y > 6 + speed) {
            direction = 0 + (int) (Math.random() * (3));
        } else if (this.x > 6 - speed && this.y > 6 - speed) {
            direction = 5 + (int) (Math.random() * (3));
            if (direction == 5) {
                direction = 0;
            }
        }
        return direction;
    }

    private void assignXY(int direction, int speed) {
        if (direction == 0) {
            this.y += speed;
        } else if (direction == 1) {
            this.y += speed;
            this.x += speed;
        } else if (direction == 2) {
            this.x += speed;
        } else if (direction == 3) {
            this.x += speed;
            this.y -= speed;
        } else if (direction == 4) {
            this.y -= speed;
        } else if (direction == 5) {
            this.x -= speed;
            this.y -= speed;
        } else if (direction == 6) {
            this.x -= speed;
        } else if (direction == 7) {
            this.x -= speed;
            this.y += speed;
        }
    }

    public void eat(){
        lives=100;
    }

    public void cage(){
        lives--;
    }

    public void uncage(){
        lives++;
    }
}

