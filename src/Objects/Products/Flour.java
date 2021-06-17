package Objects.Products;

import Objects.X_Y;

public class Flour extends Product{
    public Flour() {
        X_Y xy = random_location.random();
        this.x = xy.getX();
        this.y = xy.getY();
        this.price = variable_reading.item_price("Flour");
        this.capacity = variable_reading.item_capacity("Flour");
        this.InMap = true;
        this.InWerehouse = false;
        this.Processing = false;
        this.transporting = false;
        this.isDone = false;
    }
}
