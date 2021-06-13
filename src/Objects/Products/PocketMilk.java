package Objects.Products;

import Objects.XY;

public class PocketMilk extends Product{
    public PocketMilk() {
        XY xy = random_location.random();
        this.x = xy.getX();
        this.y = xy.getY();
        this.price = variable_reading.item_price("PocketMilk");
        this.capacity = variable_reading.item_capacity("PocketMilk");
        this.InMap = true;
        this.InWerehouse = false;
        this.Processing = false;
        this.transporting = false;
    }
}
