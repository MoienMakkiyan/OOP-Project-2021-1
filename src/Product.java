public class Product {
    private String name;
    private int required_space;

    Variable_Reading variable_reading = new Variable_Reading();

    public Product(String name) {
        this.required_space = variable_reading.item_capacity(name);
    }
    /* TODO */


    public String getName() {
        return name;
    }

    public int getRequired_space() {
        return required_space;
    }
}
