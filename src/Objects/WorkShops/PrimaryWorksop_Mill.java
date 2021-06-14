package Objects.WorkShops;

public class PrimaryWorksop_Mill extends Workshop {
    public PrimaryWorksop_Mill() {
        this.level = 1;
        this.upgrade_cost = variable_reading.item_cost_upgrading("PrimaryWorksop_Mill");
        this.needed_time = variable_reading.each_time_needed("PrimaryWorksop_Mill");
    }

    public void Upgrade(){
        this.level = this.level + 1;
    }
}
