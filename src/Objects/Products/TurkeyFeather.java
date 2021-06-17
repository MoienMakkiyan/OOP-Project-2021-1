package Objects.Products;

import Objects.X_Y;

public class TurkeyFeather extends Product{
    public TurkeyFeather(int animal_x , int animal_y) {
        X_Y xy = random_location.base_random(animal_x,animal_y);
        this.x = xy.getX();
        this.y = xy.getY();
        this.price = variable_reading.item_price("TurkeyFeather");
        this.capacity = variable_reading.item_capacity("TurkeyFeather");
        this.InMap = true;
        this.InWerehouse = false;
        this.Processing = false;
        this.transporting = false;
        this.isDone = false;
    }
}
