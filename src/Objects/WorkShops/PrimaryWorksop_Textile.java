package Objects.WorkShops;

import Functions.Main_Manager;
import Functions.Variable_Reading;

public class PrimaryWorksop_Textile extends Workshop{
    public PrimaryWorksop_Textile() {
        this.level = 1;
        this.upgrade_cost = Variable_Reading.getInstance().item_cost_upgrading("PrimaryWorksop_Textile");
        this.needed_time = Variable_Reading.getInstance().each_time_needed("PrimaryWorksop_Textile");
    }

    public void Upgrade(){
        this.level = this.level + 1;
        Main_Manager.getInstance().setTailoring_work_MAX(Main_Manager.getInstance().getTextile_work_MAX()/2);
    }
}
