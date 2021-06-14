package Objects.WorkShops;

public class SecondaryWorkshop_IcecreamShop extends Workshop{
    public SecondaryWorkshop_IcecreamShop() {
        this.level = 1;
        this.upgrade_cost = variable_reading.item_cost_upgrading("SecondaryWorkshop_IcecreamShop");
        this.needed_time = variable_reading.each_time_needed("SecondaryWorkshop_IcecreamShop");
    }

    public void Upgrade(){
        this.level = this.level + 1;
    }
}
