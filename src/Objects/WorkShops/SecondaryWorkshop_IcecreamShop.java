package Objects.WorkShops;

import Functions.Variable_Reading;

public class SecondaryWorkshop_IcecreamShop extends Workshop{
    public SecondaryWorkshop_IcecreamShop() {
        this.level = 1;
        this.upgrade_cost = Variable_Reading.getInstance().item_cost_upgrading("SecondaryWorkshop_IcecreamShop");
        this.needed_time = Variable_Reading.getInstance().each_time_needed("SecondaryWorkshop_IcecreamShop");
    }

    public void Upgrade(){
        this.level = this.level + 1;
    }
}
