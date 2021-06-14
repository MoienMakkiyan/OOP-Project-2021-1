package Objects.Products;
import Functions.Random_Location;
import Objects.XY;

public class Bread extends Product{
    public Bread() {
        XY xy = random_location.random();
        this.x = xy.getX();
        this.y = xy.getY();
        this.price = variable_reading.item_price("Bread");
        this.capacity = variable_reading.item_capacity("Bread");
        this.InMap = true;
        this.InWerehouse = false;
        this.Processing = false;
        this.transporting = false;
        this.isDone = false;
    }
}
