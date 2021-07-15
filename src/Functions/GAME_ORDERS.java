package Functions;

import Objects.Logger;
import Objects.Products.Egg;
import Objects.User;

public class GAME_ORDERS {

    private static GAME_ORDERS instance = null;

    private GAME_ORDERS(){
    }

    //Logger logger;

    //Variable_Reading variable_reading;
    //Main_Manager main_manager;

    /*public GAME_ORDERS(Logger logger, Variable_Reading variable_reading, Main_Manager main_manager) {
        this.logger = logger;
        this.variable_reading = variable_reading;
        this.main_manager = main_manager;
    }*/

    String Animal_Name = "Chicken Ostrich Buffalo Cat Dog";
    String Workshops_Name = "MilkPacking Mill Textile Bakery IcecreamShop Tailoring";

    public boolean Buy (String name , User user){
        if (Animal_Name.contains(name)){
            if (name.equalsIgnoreCase("Chicken")){
                if (user.getCoin()-Variable_Reading.getInstance().item_cost_buying("Chicken")>0){
                    user.setCoin(user.getCoin()-Variable_Reading.getInstance().item_cost_buying("Chicken"));
                    Main_Manager.getInstance().Add_Animal("Chicken");
                    Logger.getInstance().getLogger().info("Buy : Chicken Bought Successfully! ");
                    return true;
                }
                else {
                    Logger.getInstance().getLogger().warning("Buy : Chicken Unsuccessful Buying! ");
                    return false;
                }
            }
            else if (name.equalsIgnoreCase("Ostrich")){
                if (user.getCoin()-Variable_Reading.getInstance().item_cost_buying("Ostrich")>0){
                    user.setCoin(user.getCoin()-Variable_Reading.getInstance().item_cost_buying("Ostrich"));
                    Main_Manager.getInstance().Add_Animal("Ostrich");
                    Logger.getInstance().getLogger().info("Buy : Ostrich Bought Successfully! ");
                    return true;
                }
                else {
                    Logger.getInstance().getLogger().warning("Buy : Ostrich Unsuccessful Buying! ");
                    return false;
                }
            }
            else if (name.equalsIgnoreCase("Buffalo")){
                if (user.getCoin()-Variable_Reading.getInstance().item_cost_buying("Buffalo")>0){
                    user.setCoin(user.getCoin()-Variable_Reading.getInstance().item_cost_buying("Buffalo"));
                    Main_Manager.getInstance().Add_Animal("Buffalo");
                    Logger.getInstance().getLogger().info("Buy : Buffalo Bought Successfully! ");
                    return true;
                }
                else {
                    Logger.getInstance().getLogger().warning("Buy : Buffalo Unsuccessful Buying! ");
                    return false;
                }
            }
            else if (name.equalsIgnoreCase("Cat")){
                if (user.getCoin()-Variable_Reading.getInstance().item_cost_buying("Cat")>0){
                    user.setCoin(user.getCoin()-Variable_Reading.getInstance().item_cost_buying("Cat"));
                    Main_Manager.getInstance().Add_Animal("Cat");
                    Logger.getInstance().getLogger().info("Buy : Cat Bought Successfully! ");
                    return true;
                }
                else {
                    Logger.getInstance().getLogger().warning("Buy : Cat Unsuccessful Buying! ");
                    return false;
                }
            }
            else if (name.equalsIgnoreCase("Dog")){
                if (user.getCoin()-Variable_Reading.getInstance().item_cost_buying("Dog")>0){
                    user.setCoin(user.getCoin()-Variable_Reading.getInstance().item_cost_buying("Dog"));
                    Main_Manager.getInstance().Add_Animal("Dog");
                    Logger.getInstance().getLogger().info("Buy : Dog Bought Successfully! ");
                    return true;
                }
                else {
                    Logger.getInstance().getLogger().warning("Buy : Dog Unsuccessful Buying! ");
                    return false;
                }
            }
        }
        return false;
    }

    public boolean Build (String name , User user){
        if (Workshops_Name.contains(name)){
            if (name.equalsIgnoreCase("MilkPacking")){
                if (user.getCoin()-Variable_Reading.getInstance().item_cost_buying("MilkPacking")>0){
                    user.setCoin(user.getCoin()-Variable_Reading.getInstance().item_cost_buying("MilkPacking"));
                    Main_Manager.getInstance().Add_WorkShop("MilkPacking");
                    Logger.getInstance().getLogger().info("Build : MilkPacking Built Successfully! ");
                    return true;
                }
                else {
                    Logger.getInstance().getLogger().warning("Build : MilkPacking Unsuccessful Building! ");
                    return false;
                }
            }
            else if (name.equalsIgnoreCase("Mill")){
                if (name.equalsIgnoreCase("Mill")){
                    if (user.getCoin()-Variable_Reading.getInstance().item_cost_buying("Mill")>0){
                        user.setCoin(user.getCoin()-Variable_Reading.getInstance().item_cost_buying("Mill"));
                        Main_Manager.getInstance().Add_WorkShop("Mill");
                        Logger.getInstance().getLogger().info("Build : Mill Built Successfully! ");
                        return true;
                    }
                    else {
                        Logger.getInstance().getLogger().warning("Build : Mill Unsuccessful Building! ");
                        return false;
                    }
                }
            }
            else if (name.equalsIgnoreCase("Textile")){
                if (name.equalsIgnoreCase("Textile")){
                    if (user.getCoin()-Variable_Reading.getInstance().item_cost_buying("Textile")>0){
                        user.setCoin(user.getCoin()-Variable_Reading.getInstance().item_cost_buying("Textile"));
                        Main_Manager.getInstance().Add_WorkShop("Textile");
                        Logger.getInstance().getLogger().info("Build : Textile Built Successfully! ");
                        return true;
                    }
                    else {
                        Logger.getInstance().getLogger().warning("Build : Textile Unsuccessful Building! ");
                        return false;
                    }
                }
            }
            else if (name.equalsIgnoreCase("Bakery")){
                if (name.equalsIgnoreCase("Bakery")){
                    if (user.getCoin()-Variable_Reading.getInstance().item_cost_buying("Bakery")>0){
                        user.setCoin(user.getCoin()-Variable_Reading.getInstance().item_cost_buying("Bakery"));
                        Main_Manager.getInstance().Add_WorkShop("Bakery");
                        Logger.getInstance().getLogger().info("Build : Bakery Built Successfully! ");
                        return true;
                    }
                    else {
                        Logger.getInstance().getLogger().warning("Build : Bakery Unsuccessful Building! ");
                        return false;
                    }
                }
            }
            else if (name.equalsIgnoreCase("IcecreamShop")){
                if (name.equalsIgnoreCase("IcecreamShop")){
                    if (user.getCoin()-Variable_Reading.getInstance().item_cost_buying("IcecreamShop")>0){
                        user.setCoin(user.getCoin()-Variable_Reading.getInstance().item_cost_buying("IcecreamShop"));
                        Main_Manager.getInstance().Add_WorkShop("IcecreamShop");
                        Logger.getInstance().getLogger().info("Build : IcecreamShop Built Successfully! ");
                        return true;
                    }
                    else {
                        Logger.getInstance().getLogger().warning("Build : IcecreamShop Unsuccessful Building! ");
                        return false;
                    }
                }
            }
            else if (name.equalsIgnoreCase("Tailoring")){
                if (name.equalsIgnoreCase("Tailoring")){
                    if (user.getCoin()-Variable_Reading.getInstance().item_cost_buying("Tailoring")>0){
                        user.setCoin(user.getCoin()-Variable_Reading.getInstance().item_cost_buying("Tailoring"));
                        Main_Manager.getInstance().Add_WorkShop("Tailoring");
                        Logger.getInstance().getLogger().info("Build : Tailoring Built Successfully! ");
                        return true;
                    }
                    else {
                        Logger.getInstance().getLogger().warning("Build : Tailoring Unsuccessful Building! ");
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public boolean Pickup (int x , int y , User user){
        if (Main_Manager.getInstance().add_to_warehouse(x-1,y-1)){
            //TODO
            return true;
        }
        else {
            //TODO
            return false;
        }
    }

    public boolean Well (User user){
        if (Main_Manager.getInstance().Well()){
            //TODO
            return true;
        }
        else {
            //TODO
            return false;
        }
    }

    public boolean Plant (int x , int y , User user){
        if (Main_Manager.getInstance().AddGrass(x,y)){
            //TODO
            return true;
        }
        else {
            //TODO
            return false;
        }
    }

    public boolean Work (String name , User user){
        if (name.equalsIgnoreCase("MilkPacking")){
            Main_Manager.getInstance().MilkPacking_Work();
        }
        else if (name.equalsIgnoreCase("Mill")){
            Main_Manager.getInstance().Mill_Work();
        }
        else if (name.equalsIgnoreCase("Textile")){
            Main_Manager.getInstance().Textile_Work();
        }
        else if (name.equalsIgnoreCase("Bakery")){
            Main_Manager.getInstance().Bakery_Work();
        }
        else if (name.equalsIgnoreCase("IcecreamShop")){
            Main_Manager.getInstance().IcecreamShop_Work();
        }
        else if (name.equalsIgnoreCase("Tailoring")){
            Main_Manager.getInstance().Tailoring_Work();
        }
        return true;
    }

    public boolean Cage (int x , int y , User user) {
        if (Main_Manager.getInstance().Cage(x,y)){
            //TODO
            return true;
        }
        else {
            //TODO
            return false;
        }
    }

    public boolean Turn (int n , User user){
        if (Main_Manager.getInstance().changeTurn(n)){
            //TODO
            return true;
        }
        else {
            //TODO
            return false;
        }
    }

    public boolean Truck_Load (String name , User user){
        if (Main_Manager.getInstance().inWerehouse(name)){
            if (Main_Manager.getInstance().Truck_Load(name)){
                //TODO
                return true;
            }
            else {
                //TODO
                return false;
            }
        }
        else {
            //TODO
            return false;
        }
    }

    public boolean Truck_Unload (String name , User user){
        if (Main_Manager.getInstance().Truck_Unload(name)){
            //TODO
            return true;
        }
        else {
            //TODO
            return false;
        }
    }

    public boolean Truck_Go (User user){
        if (Main_Manager.getInstance().Truck_Go()){
            user.setCoin(user.getCoin()+ Main_Manager.getInstance().SELLING_PROFIT());
            return true;
        }
        else {
            return false;
        }
    }

    public void set_level_tasks(int level, User user){

    }

    public static GAME_ORDERS getInstance(){
        if (instance == null)
            instance = new GAME_ORDERS();
        return instance;
    }
}
