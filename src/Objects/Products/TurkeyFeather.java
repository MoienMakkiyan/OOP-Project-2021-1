package Objects.Products;

import Objects.XY;

public class TurkeyFeather extends Product{
    public TurkeyFeather() {
        XY xy = random_location.random();
        this.x = xy.getX();
        this.y = xy.getY();
        this.price = variable_reading.item_price("TurkeyFeather");
        this.capacity = variable_reading.item_capacity("TurkeyFeather");
        this.InMap = true;
        this.InWerehouse = false;
        this.Processing = false;
        this.transporting = false;
    }
}
