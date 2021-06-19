package Functions;

import Objects.Products.BuffaloMilk;
import Objects.Products.PocketMilk;
import Objects.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Variable_Reading {

    public Variable_Reading() {
        initializing();
    }

    private int map_size[] = new int[2];
    ArrayList<User> users = new ArrayList<>();

    private int warehouse_capacity;
    private int bread_capacity;
    private int buffalomilk_capacity;
    private int egg_capacity;
    private int flour_capacity;
    private int icecream_capacity;
    private int pocketmilk_capacity;
    private int shirt_capacity;
    private int textile_capacity;
    private int turkeyfeather_capacity;

    private int bread_cost;
    private int buffalomilk_cost;
    private int egg_cost;
    private int flour_cost;
    private int icecream_cost;
    private int pocketmilk_cost;
    private int shirt_cost;
    private int textile_cost;
    private int turkeyfeather_cost;

    private int milkpacking_upgrade_cost;
    private int mill_upgrade_cost;
    private int textile_upgrade_cost;
    private int bakery_upgrade_cost;
    private int icecream_shop_upgrade_cost;
    private int tailpring_upgrade_cost;

    private int milkpacking_cost;
    private int mill_cost;
    private int textileWorkshop_cost;
    private int bakery_cost;
    private int icecream_shop_cost;
    private int tailpring_cost;

    private int starting_coin;
    private int truck_capacity;
    private int truck_time;
    private int Well_Time;
    private int Well_info;

    private void initializing() {
        read_capacities();
        read_costs();
        read_upgrade_costs();
        }

    public int[] map_size() {
        return map_size;
    }

    public int warehouse_info() {
        return warehouse_capacity;
    }

    public int item_capacity(String name) {
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

    public int item_price(String name) {
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

    private int egg_time;
    private int buffalomilk_time;
    private int turkeyfeather_time;



    public int item_cost_buying(String name) {
        if (name.equalsIgnoreCase("MilkPacking"))
            return milkpacking_cost;
        else if (name.equalsIgnoreCase("Mill"))
            return mill_cost;
        else if (name.equalsIgnoreCase("textile"))
            return textileWorkshop_cost;
        else if (name.equalsIgnoreCase("bakery"))
            return bakery_cost;
        else if (name.equalsIgnoreCase("icecreamshop"))
            return icecream_shop_cost;
        else
            return tailpring_cost;
    }

    public int item_cost_upgrading(String name) {
        if (name.equalsIgnoreCase("MilkPacking"))
            return milkpacking_upgrade_cost;
        else if (name.equalsIgnoreCase("Mill"))
            return mill_upgrade_cost;
        else if (name.equalsIgnoreCase("textile"))
            return textile_upgrade_cost;
        else if (name.equalsIgnoreCase("bakery"))
            return bakery_upgrade_cost;
        else if (name.equalsIgnoreCase("icecreamshop"))
            return icecream_shop_upgrade_cost;
        else
            return tailpring_upgrade_cost;
    }

    public int each_time_needed(String name) {
        if (name.equalsIgnoreCase("Egg"))
            return egg_time;
        else if (name.equalsIgnoreCase("BuffaloMilk"))
            return buffalomilk_time;
        else return turkeyfeather_time;
    }

    public int starting_coin() {
        return starting_coin;
    }

    public int truck_capacity() {
        return truck_capacity;
    }

    public int truck_time() {
        return truck_time;
    }

    public int Well_info() {
        return Well_info;
    }

    public int Well_Time() {
        return Well_Time;
    }

    int Mill_time;
    int Milkpacking_time;
    int textile_time;
    int bakery_time;
    int icecreamshop_time;
    int tailoring_time;

    public int Get_WorkShops_Time(String name) {
        if (name.equalsIgnoreCase("MilkPacking"))
            return Milkpacking_time;
        else if (name.equalsIgnoreCase("Mill"))
            return Mill_time;
        else if (name.equalsIgnoreCase("textile"))
            return textile_time;
        else if (name.equalsIgnoreCase("bakery"))
            return bakery_time;
        else if (name.equalsIgnoreCase("icecreamshop"))
            return icecreamshop_time;
        else
            return tailoring_time;
    }

    private void read_capacities(){
        File Capacities = new File("Capacity.txt");
        Scanner reader = null;
        try {
            reader = new Scanner(Capacities);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        warehouse_capacity = Integer.parseInt(reader.nextLine().split("\\s")[2]);
        bread_capacity = Integer.parseInt(reader.nextLine().split("\\s")[2]);
        buffalomilk_capacity = Integer.parseInt(reader.nextLine().split("\\s")[2]);
        egg_capacity = Integer.parseInt(reader.nextLine().split("\\s")[2]);
        flour_capacity = Integer.parseInt(reader.nextLine().split("\\s")[2]);
        icecream_capacity = Integer.parseInt(reader.nextLine().split("\\s")[2]);
        pocketmilk_capacity = Integer.parseInt(reader.nextLine().split("\\s")[2]);
        shirt_capacity = Integer.parseInt(reader.nextLine().split("\\s")[2]);
        textile_capacity = Integer.parseInt(reader.nextLine().split("\\s")[2]);
        turkeyfeather_capacity = Integer.parseInt(reader.nextLine().split("\\s")[2]);
        reader.close();
    }

    private void read_costs(){
        File Costs = new File("Costs.txt");
        Scanner reader = null;
        try {
            reader = new Scanner(Costs);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        bread_cost = Integer.parseInt(reader.nextLine().split("\\s")[2]);
        buffalomilk_cost = Integer.parseInt(reader.nextLine().split("\\s")[2]);
        egg_cost = Integer.parseInt(reader.nextLine().split("\\s")[2]);
        flour_cost = Integer.parseInt(reader.nextLine().split("\\s")[2]);
        icecream_cost = Integer.parseInt(reader.nextLine().split("\\s")[2]);
        pocketmilk_cost = Integer.parseInt(reader.nextLine().split("\\s")[2]);
        shirt_cost = Integer.parseInt(reader.nextLine().split("\\s")[2]);
        textile_cost = Integer.parseInt(reader.nextLine().split("\\s")[2]);
        turkeyfeather_cost = Integer.parseInt(reader.nextLine().split("\\s")[2]);
    }

    private void read_upgrade_costs(){
        File Costs = new File("Costs.txt");
        Scanner reader = null;
        try {
            reader = new Scanner(Costs);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        milkpacking_upgrade_cost = Integer.parseInt(reader.nextLine().split("\\s")[2]);
        mill_upgrade_cost = Integer.parseInt(reader.nextLine().split("\\s")[2]);
        textile_upgrade_cost = Integer.parseInt(reader.nextLine().split("\\s")[2]);
        bakery_upgrade_cost = Integer.parseInt(reader.nextLine().split("\\s")[2]);
        icecream_shop_upgrade_cost = Integer.parseInt(reader.nextLine().split("\\s")[2]);
        tailpring_upgrade_cost = Integer.parseInt(reader.nextLine().split("\\s")[2]);
    }

    public ArrayList<User> getUsersINFO() {
        return users;
    }
}
