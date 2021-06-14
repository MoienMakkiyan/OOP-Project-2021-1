package Objects.WorkShops;

public class PrimaryWorksop_Textile extends Workshop{
    public PrimaryWorksop_Textile() {
        this.level = 1;
        this.upgrade_cost = variable_reading.item_cost_upgrading("PrimaryWorksop_Textile");
        this.needed_time = variable_reading.each_time_needed("PrimaryWorksop_Textile");
    }

    public void Upgrade(){
        this.level = this.level + 1;
    }
}
