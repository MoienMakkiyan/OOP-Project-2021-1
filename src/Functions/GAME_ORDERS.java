package Functions;

import Objects.Cell;
import Objects.User;

public class GAME_ORDERS {

    Main_Manager main_manager = new Main_Manager();
    Variable_Reading variable_reading = new Variable_Reading();

    String Animal_Name = "Chicken Ostrich Buffalo Cat Dog";
    String Workshops_Name = "MilkPacking Mill Textile Bakery IcecreamShop Tailoring";

    public boolean Buy (String name , User user){
        if (Animal_Name.contains(name)){
            if (name.equalsIgnoreCase("Chicken")){
                if (user.getCoin()-variable_reading.item_cost_buying("Chicken")>0){
                    user.setCoin(user.getCoin()-variable_reading.item_cost_buying("Chicken"));
                    main_manager.Add_Animal("Chicken");
                    return true;
                }
                else {
                    //TODO
                    return false;
                }
            }
            else if (name.equalsIgnoreCase("Ostrich")){
                if (user.getCoin()-variable_reading.item_cost_buying("Ostrich")>0){
                    user.setCoin(user.getCoin()-variable_reading.item_cost_buying("Ostrich"));
                    main_manager.Add_Animal("Ostrich");
                    return true;
                }
                else {
                    //TODO
                    return false;
                }
            }
            else if (name.equalsIgnoreCase("Buffalo")){
                if (user.getCoin()-variable_reading.item_cost_buying("Buffalo")>0){
                    user.setCoin(user.getCoin()-variable_reading.item_cost_buying("Buffalo"));
                    main_manager.Add_Animal("Buffalo");
                    return true;
                }
                else {
                    //TODO
                    return false;
                }
            }
            else if (name.equalsIgnoreCase("Cat")){
                if (user.getCoin()-variable_reading.item_cost_buying("Cat")>0){
                    user.setCoin(user.getCoin()-variable_reading.item_cost_buying("Cat"));
                    main_manager.Add_Animal("Cat");
                    return true;
                }
                else {
                    //TODO
                    return false;
                }
            }
            else if (name.equalsIgnoreCase("Dog")){
                if (user.getCoin()-variable_reading.item_cost_buying("Dog")>0){
                    user.setCoin(user.getCoin()-variable_reading.item_cost_buying("Dog"));
                    main_manager.Add_Animal("Dog");
                    return true;
                }
                else {
                    //TODO
                    return false;
                }
            }
        }
        if (Workshops_Name.contains(name)){
            if (name.equalsIgnoreCase("MilkPacking")){
                if (user.getCoin()-variable_reading.item_cost_buying("MilkPacking")>0){
                    user.setCoin(user.getCoin()-variable_reading.item_cost_buying("MilkPacking"));
                    main_manager.Add_WorkShop("MilkPacking");
                    return true;
                }
                else {
                    //TODO
                    return false;
                }
            }
            else if (name.equalsIgnoreCase("Mill")){
                if (name.equalsIgnoreCase("Mill")){
                    if (user.getCoin()-variable_reading.item_cost_buying("Mill")>0){
                        user.setCoin(user.getCoin()-variable_reading.item_cost_buying("Mill"));
                        main_manager.Add_WorkShop("Mill");
                        return true;
                    }
                    else {
                        //TODO
                        return false;
                    }
                }
            }
            else if (name.equalsIgnoreCase("Textile")){
                if (name.equalsIgnoreCase("Textile")){
                    if (user.getCoin()-variable_reading.item_cost_buying("Textile")>0){
                        user.setCoin(user.getCoin()-variable_reading.item_cost_buying("Textile"));
                        main_manager.Add_WorkShop("Textile");
                        return true;
                    }
                    else {
                        //TODO
                        return false;
                    }
                }
            }
            else if (name.equalsIgnoreCase("Bakery")){
                if (name.equalsIgnoreCase("Bakery")){
                    if (user.getCoin()-variable_reading.item_cost_buying("Bakery")>0){
                        user.setCoin(user.getCoin()-variable_reading.item_cost_buying("Bakery"));
                        main_manager.Add_WorkShop("Bakery");
                        return true;
                    }
                    else {
                        //TODO
                        return false;
                    }
                }
            }
            else if (name.equalsIgnoreCase("IcecreamShop")){
                if (name.equalsIgnoreCase("IcecreamShop")){
                    if (user.getCoin()-variable_reading.item_cost_buying("IcecreamShop")>0){
                        user.setCoin(user.getCoin()-variable_reading.item_cost_buying("IcecreamShop"));
                        main_manager.Add_WorkShop("IcecreamShop");
                        return true;
                    }
                    else {
                        //TODO
                        return false;
                    }
                }
            }
            else if (name.equalsIgnoreCase("Tailoring")){
                if (name.equalsIgnoreCase("Tailoring")){
                    if (user.getCoin()-variable_reading.item_cost_buying("Tailoring")>0){
                        user.setCoin(user.getCoin()-variable_reading.item_cost_buying("Tailoring"));
                        main_manager.Add_WorkShop("Tailoring");
                        return true;
                    }
                    else {
                        //TODO
                        return false;
                    }
                }
            }
        }
        return false;//must be Edited in debuging
    }

    public boolean Pickup (int x , int y , User user){
        return true;

    }

    public boolean Well (User user){
        main_manager.Well();

        return true;//must be Edited in debuging
    }

    public boolean Plant (int x , int y , User user){
        Cell.cells[(int) (Math.sqrt(Cell.cells.length)*(x-1))+y-1].setHasGrass(true);
        return true;

    }

    public boolean Work (String name , User user){
        return true;

    }

    public boolean Cage (int x , int y , User user){
        return true;

    }

    public boolean Turn (int n , User user){
        return true;

    }

    public boolean Truck_Load (String name , User user){
        if (main_manager.inWerehouse(name)){
            if (main_manager.Truck_Load(name)){
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
        return main_manager.Truck_Unload(name);
    }

    public boolean Truck_Go (User user){
        return main_manager.Truck_Go();
    }
}
