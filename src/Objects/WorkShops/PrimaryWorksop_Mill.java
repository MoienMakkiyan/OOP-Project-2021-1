package Objects.WorkShops;

import Functions.Main_Manager;
import Functions.Variable_Reading;

public class PrimaryWorksop_Mill extends Workshop {
    public PrimaryWorksop_Mill() {
        this.level = 1;
        this.upgrade_cost = Variable_Reading.getInstance().item_cost_upgrading("PrimaryWorksop_Mill");
        this.needed_time = Variable_Reading.getInstance().each_time_needed("PrimaryWorksop_Mill");
    }

    public void Upgrade(){
        this.level = this.level + 1;
        Main_Manager.getInstance().setMill_work_MAX(Main_Manager.getInstance().getMill_work_MAX()/2);
    }
}
