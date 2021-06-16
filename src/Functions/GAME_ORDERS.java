package Functions;

import Objects.Animal.Wild;
import Objects.Cell;
import Objects.User;

public class GAME_ORDERS {

    Variable_Reading variable_reading = new Variable_Reading();
    Main_Manager main_manager = new Main_Manager(variable_reading.map_size(),variable_reading);


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
        if (main_manager.add_to_warehouse(x-1,y-1)){
            //TODO
            return true;
        }
        else {
            //TODO
            return false;
        }
    }

    public boolean Well (User user){
        if (main_manager.Well()){
            //TODO
            return true;
        }
        else {
            //TODO
            return false;
        }
    }

    public boolean Plant (int x , int y , User user){
        if (main_manager.AddGrass(x,y)){
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

        }
        else if (name.equalsIgnoreCase("Mill")){

        }
        else if (name.equalsIgnoreCase("Textile")){

        }
        else if (name.equalsIgnoreCase("Bakery")){

        }
        else if (name.equalsIgnoreCase("IcecreamShop")){

        }
        else if (name.equalsIgnoreCase("Tailoring")){

        }
        return true;
    }

    public boolean Cage (int x , int y , User user) {
        if (main_manager.Cage(x,y)){
            //TODO
            return true;
        }
        else {
            //TODO
            return false;
        }
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
        if (main_manager.Truck_Unload(name)){
            //TODO
            return true;
        }
        else {
            //TODO
            return false;
        }
    }

    public boolean Truck_Go (User user){
        if (main_manager.Truck_Go()){
            //TODO
            return true;
        }
        else {
            //TODO
            return false;
        }
    }
}
