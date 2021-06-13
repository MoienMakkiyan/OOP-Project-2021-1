package Objects.WorkShops;

public class PrimaryWorksop_MilkPacking extends Workshop {

    public PrimaryWorksop_MilkPacking() {
        this.level = 1;
        this.upgrade_cost = variable_reading.item_cost_upgrading("PrimaryWorksop_MilkPacking");
        this.needed_time = variable_reading.each_time_needed("PrimaryWorksop_MilkPacking");
    }

    public void Upgrade(){
        this.level = this.level + 1;
    }


}
