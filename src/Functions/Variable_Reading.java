package Functions;

import Objects.Mission;
import Objects.Products.BuffaloMilk;
import Objects.Products.PocketMilk;
import Objects.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

public class Variable_Reading {

    private static Variable_Reading instance = null;
    private Variable_Reading() {
        initializing();
    }

    public static Variable_Reading getInstance(){
        if (instance == null)
            instance = new Variable_Reading();
        return instance
    }

    private int map_size[] = new int[2];
    ArrayList<User> users = new ArrayList<>();
    ArrayList<Mission> missions = new ArrayList<>();

    private int warehouse_capacity = 0;
    private int bread_capacity = 0;
    private int buffalomilk_capacity = 0;
    private int egg_capacity = 0;
    private int flour_capacity = 0;
    private int icecream_capacity = 0;
    private int pocketmilk_capacity = 0;
    private int shirt_capacity = 0;
    private int textile_capacity = 0;
    private int turkeyfeather_capacity = 0;
    private int Wild_animal_capacity = 0;

    private int Chicken_cost = 0;
    private int Ostrich_cost = 0;
    private int Buffalo_cost = 0;
    private int HunterDog_cost = 0;
    private int CollectorCat_cost = 0;
    private int lion_cost = 0;
    private int bear_cost = 0;
    private int tiger_cost = 0;

    private int bread_cost = 0;
    private int buffalomilk_cost = 0;
    private int egg_cost = 0;
    private int flour_cost = 0;
    private int icecream_cost = 0;
    private int pocketmilk_cost = 0;
    private int shirt_cost = 0;
    private int textile_cost = 0;
    private int turkeyfeather_cost = 0;

    private int milkpacking_upgrade_cost = 0;
    private int mill_upgrade_cost = 0;
    private int textile_upgrade_cost = 0;
    private int bakery_upgrade_cost = 0;
    private int icecream_shop_upgrade_cost = 0;
    private int tailpring_upgrade_cost = 0;

    private int milkpacking_cost = 0;
    private int mill_cost = 0;
    private int textileWorkshop_cost = 0;
    private int bakery_cost = 0;
    private int icecream_shop_cost = 0;
    private int tailpring_cost = 0;

    private int starting_coin = 0;
    private int truck_capacity = 0;
    private int truck_time = 0;
    private int Well_Time = 0;
    private int Well_info = 0;

    private int egg_time = 0;
    private int buffalomilk_time = 0;
    private int turkeyfeather_time = 0;

    private int Mill_time = 0;
    private int Milkpacking_time = 0;
    private int textile_time = 0;
    private int bakery_time = 0;
    private int icecreamshop_time = 0;
    private int tailoring_time = 0;

    private int first_destroy = 0;
    private int second_destroy = 0;
    private int third_destroy = 0;
    private int scape_time = 0;


    private void initializing() {
        String a = null;
        File directoryPath = new File("Data");
        File filesList[] = directoryPath.listFiles();
        for(File file : filesList) {
            Scanner FileReader = null;
            try {
                FileReader = new Scanner(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            if (file.getName().equalsIgnoreCase("Capacity_Info.txt")){
                bread_capacity = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
                buffalomilk_capacity = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
                egg_capacity = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
                flour_capacity = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
                icecream_capacity = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
                pocketmilk_capacity = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
                shirt_capacity = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
                textile_capacity = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
                turkeyfeather_capacity = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
                Wild_animal_capacity = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
            }
            else if (file.getName().equalsIgnoreCase("Cost_Info.txt")){
                Chicken_cost = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
                Ostrich_cost = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
                Buffalo_cost = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
                HunterDog_cost = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
                CollectorCat_cost = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
                bread_cost = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
                buffalomilk_cost = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
                egg_cost = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
                flour_cost = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
                icecream_cost = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
                pocketmilk_cost = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
                shirt_cost = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
                textile_cost = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
                turkeyfeather_cost = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
                lion_cost = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
                bear_cost = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
                tiger_cost = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
                milkpacking_upgrade_cost = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
                mill_upgrade_cost = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
                textile_upgrade_cost = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
                bakery_upgrade_cost = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
                icecream_shop_upgrade_cost = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
                tailpring_upgrade_cost = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
                milkpacking_cost = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
                mill_cost = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
                textileWorkshop_cost = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
                bakery_cost = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
                icecream_shop_cost = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
                tailpring_cost = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
            }
            else if (file.getName().equalsIgnoreCase("Game_Info.txt")){
                map_size = back_map_size(FileReader.nextLine().split("\\s"));
                warehouse_capacity = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
                truck_capacity = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
                truck_time = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
                Well_Time = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
                Well_info = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
                starting_coin = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
            }
            else if (file.getName().equalsIgnoreCase("Game_Info.txt")){
                egg_time = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
                buffalomilk_time = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
                turkeyfeather_time = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
                Mill_time = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
                Milkpacking_time = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
                textile_time = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
                bakery_time = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
                icecreamshop_time = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
                tailoring_time = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
                first_destroy = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
                second_destroy = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
                third_destroy = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
                scape_time = Integer.parseInt(FileReader.nextLine().split("\\s")[2]);
            }
            else if (file.getName().equalsIgnoreCase("All_User.txt")){
                while (FileReader.hasNextLine()){
                    String[] data = FileReader.nextLine().split("\\s");
                    try {
                        users.add(new User(data[0],data[1],Integer.parseInt(data[2]),Integer.parseInt(data[3])));
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                }
            }
            FileReader.close();
        }
        /* TODO for missions data*/
    }

    public void save() throws IOException {
            FileWriter myWriter = new FileWriter("All_User.txt");
            for (int i=0;i<users.size();i++){
                myWriter.write(users.get(i).getName());
                myWriter.write(" ");
                myWriter.write(users.get(i).getPassword());
                myWriter.write(" ");
                myWriter.write(String.valueOf(users.get(i).getLevel()));
                myWriter.write(" ");
                myWriter.write(String.valueOf(users.get(i).getCoin()));
                myWriter.write("\n");
            }
            myWriter.close();
    }

    public ArrayList<Mission> getMissions() {
        return missions;
    }

    private int[] back_map_size(String []in){
        int a[] = new int[2];
        a[0] = Integer.parseInt(in[2]);
        a[1] = Integer.parseInt(in[4]);
        return a;
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

    public ArrayList<User> getUsersINFO() {
        return users;
    }

}
