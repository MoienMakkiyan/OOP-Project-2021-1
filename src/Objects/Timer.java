package Objects;

import Functions.Variable_Reading;

public class Timer {
    Variable_Reading variable_reading;

    public Timer(Variable_Reading variable_reading) {
        this.variable_reading = variable_reading;
    }

    //WorkSops
    //MilkPacking
    private int MAX_MilkPacking = variable_reading.Get_WorkShops_Time("MilkPacking");
    private int CURRENT_MilkPacking = 0;
    public boolean checkMilkPackingTime(){
        CURRENT_MilkPacking++;
        if (CURRENT_MilkPacking==MAX_MilkPacking){
            CURRENT_MilkPacking=0;
            return true;
        }
        else return false;
    }
    //Mill
    private int MAX_Mill = variable_reading.Get_WorkShops_Time("Mill");
    private int CURRENT_Mill = 0;
    public boolean checkMillTime(){
        CURRENT_Mill++;
        if (CURRENT_Mill==MAX_Mill){
            CURRENT_Mill=0;
            return true;
        }
        else return false;
    }
    //Textile
    private int MAX_Textile = variable_reading.Get_WorkShops_Time("Textile");
    private int CURRENT_Textile = 0;
    public boolean checkTextileTime(){
        CURRENT_Textile++;
        if (CURRENT_Textile==MAX_Textile){
            CURRENT_Textile=0;
            return true;
        }
        else return false;
    }
    //Bakery
    private int MAX_Bakery = variable_reading.Get_WorkShops_Time("Bakery");
    private int CURRENT_Bakery = 0;
    public boolean checkBakeryTime(){
        CURRENT_Bakery++;
        if (CURRENT_Bakery==MAX_Bakery){
            CURRENT_Bakery=0;
            return true;
        }
        else return false;
    }
    //Icecream
    private int MAX_Icecream = variable_reading.Get_WorkShops_Time("Icecream");
    private int CURRENT_Icecream = 0;
    public boolean checkIcecreamTime(){
        CURRENT_Icecream++;
        if (CURRENT_Icecream==MAX_Icecream){
            CURRENT_Icecream=0;
            return true;
        }
        else return false;
    }
    //Tailoring
    private int MAX_Tailoring = variable_reading.Get_WorkShops_Time("Tailoring");
    private int CURRENT_Tailoring = 0;
    public boolean checkTailoringTime(){
        CURRENT_Tailoring++;
        if (CURRENT_Tailoring==MAX_Tailoring){
            CURRENT_Tailoring=0;
            return true;
        }
        else return false;
    }
}
