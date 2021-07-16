package Objects.WorkShops;

import Functions.Main_Manager;
import Functions.Variable_Reading;

public class SecondaryWorkshop_Tailoring extends Workshop{
    public SecondaryWorkshop_Tailoring() {
        this.level = 1;
        this.upgrade_cost = Variable_Reading.getInstance().item_cost_upgrading("SecondaryWorkshop_Tailoring");
        this.needed_time = Variable_Reading.getInstance().each_time_needed("SecondaryWorkshop_Tailoring");
    }

    public void Upgrade(){
        this.level = this.level + 1;
        Main_Manager.getInstance().setTailoring_work_MAX(Main_Manager.getInstance().getTailoring_work_MAX()/2);
    }
}
