import java.util.ArrayList;

public class Warehouse {
    final int capacity;
    private int current_inventory = 0;
    static ArrayList<Product> warehouse_product = new ArrayList<Product>();

    Variable_Reading variable_reading = new Variable_Reading();

    public Warehouse() {
        this.capacity = variable_reading.warehouse_info();
    }

    public boolean add_product(Product product){
        if (product.getRequired_space()+current_inventory<=capacity){
            //TODO
            return true;
        }
        else{
            //TODO
            return false;
        }
    }

    public int getCurrent_inventory() {
        return current_inventory;
    }

    public void setCurrent_inventory(int current_inventory) {
        this.current_inventory = current_inventory;
    }
}
