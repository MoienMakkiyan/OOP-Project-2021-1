package Objects.WorkShops;

public class SecondaryWorkshop_Bakery extends Workshop{
    public SecondaryWorkshop_Bakery() {
        this.level = 1;
        this.upgrade_cost = variable_reading.item_cost_upgrading("SecondaryWorkshop_Bakery");
        this.needed_time = variable_reading.each_time_needed("SecondaryWorkshop_Bakery");
    }

    public void Upgrade(){
        this.level = this.level + 1;
    }
}
