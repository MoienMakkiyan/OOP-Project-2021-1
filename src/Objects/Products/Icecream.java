package Objects.Products;

import Objects.X_Y;

public class Icecream extends Product{
    public Icecream() {
        X_Y xy = random_location.random();
        this.x = xy.getX();
        this.y = xy.getY();
        this.price = variable_reading.item_price("Icecream");
        this.capacity = variable_reading.item_capacity("Icecream");
        this.InMap = true;
        this.InWerehouse = false;
        this.Processing = false;
        this.transporting = false;
        this.isDone = false;
    }
}
