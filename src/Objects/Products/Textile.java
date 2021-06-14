package Objects.Products;

import Objects.X_Y;

public class Textile extends Product{
    public Textile() {
        X_Y xy = random_location.random();
        this.x = xy.getX();
        this.y = xy.getY();
        this.price = variable_reading.item_price("Textile");
        this.capacity = variable_reading.item_capacity("Textile");
        this.InMap = true;
        this.InWerehouse = false;
        this.Processing = false;
        this.transporting = false;
        this.isDone = false;
    }
}
