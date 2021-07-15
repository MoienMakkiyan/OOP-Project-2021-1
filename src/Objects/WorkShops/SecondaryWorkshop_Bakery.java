package Objects.WorkShops;

import Functions.Variable_Reading;

public class SecondaryWorkshop_Bakery extends Workshop{
    public SecondaryWorkshop_Bakery() {
        this.level = 1;
        this.upgrade_cost = Variable_Reading.getInstance().item_cost_upgrading("SecondaryWorkshop_Bakery");
        this.needed_time = Variable_Reading.getInstance().each_time_needed("SecondaryWorkshop_Bakery");
    }

    public void Upgrade(){
        this.level = this.level + 1;
    }
}
