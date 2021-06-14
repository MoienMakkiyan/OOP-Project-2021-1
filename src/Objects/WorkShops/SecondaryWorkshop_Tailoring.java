package Objects.WorkShops;

public class SecondaryWorkshop_Tailoring extends Workshop{
    public SecondaryWorkshop_Tailoring() {
        this.level = 1;
        this.upgrade_cost = variable_reading.item_cost_upgrading("SecondaryWorkshop_Tailoring");
        this.needed_time = variable_reading.each_time_needed("SecondaryWorkshop_Tailoring");
    }

    public void Upgrade(){
        this.level = this.level + 1;
    }
}
