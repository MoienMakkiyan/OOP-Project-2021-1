package Functions;

import Objects.Products.PocketMilk;
import Objects.User;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Variable_Reading {

    public Variable_Reading() {
        initializing();
    }

    private int map_size[] = new int[2];
    ArrayList<User> users = new ArrayList<>();
    int warehouse_capacity;
    int bread_capacity;
    int buffalomilk_capacity;
    int egg_capacity;
    int flour_capacity;
    int icecream_capacity;
    int pocketmilk_capacity;
    int shirt_capacity;
    int textile_capacity;
    int turkeyfeather_capacity;
    int bread_cost;
    int buffalomilk_cost;
    int egg_cost;
    int flour_cost;
    int icecream_cost;
    int pocketmilk_cost;
    int shirt_cost;
    int textile_cost;
    int turkeyfeather_cost;

    int milkpacking_upgrade_cost;
    int mill_upgrade_cost;
    int textile_upgrade_cost;
    int bakery_upgrade_cost;
    int icecream_shop_upgrade_cost;
    int tailpring_upgrade_cost;

    private void initializing(){

    }

    public int[] map_size(){
        return map_size;
    }
    public int warehouse_info(){
        return warehouse_capacity;
    }
    public int item_capacity(String name){
        if (name.equalsIgnoreCase("Bread"))
            return bread_capacity;
        else if (name.equalsIgnoreCase("BuffaloMilk"))
            return buffalomilk_capacity;
        else if (name.equalsIgnoreCase("Egg"))
            return egg_capacity;
        else if (name.equalsIgnoreCase("Flour"))
            return flour_capacity;
        else if (name.equalsIgnoreCase("Icecream"))
            return icecream_capacity;
        else if (name.equalsIgnoreCase("PocketMilk"))
            return pocketmilk_capacity;
        else if (name.equalsIgnoreCase("Shirt"))
            return shirt_capacity;
        else if (name.equalsIgnoreCase("Textile"))
            return textile_capacity;
        else return turkeyfeather_capacity;//its obvious that its a turkeyfeather capacity
    }
    public int item_price(String name){
        if (name.equalsIgnoreCase("Bread"))
            return bread_cost;
        else if (name.equalsIgnoreCase("BuffaloMilk"))
            return buffalomilk_cost;
        else if (name.equalsIgnoreCase("Egg"))
            return egg_cost;
        else if (name.equalsIgnoreCase("Flour"))
            return flour_cost;
        else if (name.equalsIgnoreCase("Icecream"))
            return icecream_cost;
        else if (name.equalsIgnoreCase("PocketMilk"))
            return pocketmilk_cost;
        else if (name.equalsIgnoreCase("Shirt"))
            return shirt_cost;
        else if (name.equalsIgnoreCase("Textile"))
            return textile_cost;
        else return turkeyfeather_cost;//its obvious that its a turkeyfeather cost
    }

    public int item_cost_buying(String name){
        int tmporary_variable=0;
        //TODO
        return tmporary_variable;
    }

    public int item_cost_upgrading(String name){
        if (name.equalsIgnoreCase("MilkPacking"))
            return milkpacking_upgrade_cost;
        else if (name.equalsIgnoreCase("Mill"))
            return mill_upgrade_cost;
        else
        return 1;
    }

    public int each_time_needed(String name){
        int tmporary_variable=0;
        //TODO
        return tmporary_variable;
    }

    public int starting_coin(){
        int tmporary_variable=0;
        //TODO
        return tmporary_variable;
    }

    public int truck_capacity(){
        int tmporary_variable=0;
        //TODO
        return tmporary_variable;
    }

    public int truck_time(){
        int tmporary_variable=0;
        //TODO
        return tmporary_variable;
    }

    public int Well_info(){
        int tmporary_variable=0;
        //TODO
        return tmporary_variable;
    }

    public int Well_Time(){
        int tmporary_variable=0;
        //TODO
        return tmporary_variable;
    }

    public int Get_WorkShops_Time(String name){
        int tmporary_variable=0;
        //TODO
        return tmporary_variable;
    }

    public ArrayList<User> getUsersINFO(){
        return users;
    }
}
