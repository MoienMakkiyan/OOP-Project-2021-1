package Objects.Products;

import Objects.XY;

public class Textile extends Product{
    public Textile() {
        XY xy = random_location.random();
        this.x = xy.getX();
        this.y = xy.getY();
        this.price = variable_reading.item_price("Textile");
        this.capacity = variable_reading.item_capacity("Textile");
        this.InMap = true;
        this.InWerehouse = false;
        this.Processing = false;
        this.transporting = false;
    }
}
