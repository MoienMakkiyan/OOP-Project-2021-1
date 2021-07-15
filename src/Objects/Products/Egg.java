package Objects.Products;

import Functions.Random_Location;
import Functions.Variable_Reading;
import Objects.X_Y;

public class Egg extends Product{
    public Egg(int animal_x , int animal_y) {
        X_Y xy = Random_Location.getInstance().base_random(animal_x,animal_y);
        this.x = xy.getX();
        this.y = xy.getY();
        this.price = Variable_Reading.getInstance().item_price("Egg");
        this.capacity = Variable_Reading.getInstance().item_capacity("Egg");
        this.InMap = true;
        this.InWerehouse = false;
        this.Processing = false;
        this.transporting = false;
        this.isDone = false;
    }
}
