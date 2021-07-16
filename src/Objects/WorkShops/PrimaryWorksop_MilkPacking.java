package Objects.WorkShops;

import Functions.Variable_Reading;

public class PrimaryWorksop_MilkPacking extends Workshop {

    public PrimaryWorksop_MilkPacking() {
        this.level = 1;
        this.upgrade_cost = Variable_Reading.getInstance().item_cost_upgrading("PrimaryWorksop_MilkPacking");
        this.needed_time = Variable_Reading.getInstance().each_time_needed("PrimaryWorksop_MilkPacking");
    }

    public void Upgrade(){
        this.level = this.level + 1;

    }
}
