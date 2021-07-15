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
        return instance;
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

    public static void setInstance(Variable_Reading instance) {
        Variable_Reading.instance = instance;
    }

    public int[] getMap_size() {
        return map_size;
    }

    public void setMap_size(int[] map_size) {
        this.map_size = map_size;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public void setMissions(ArrayList<Mission> missions) {
        this.missions = missions;
    }

    public int getWarehouse_capacity() {
        return warehouse_capacity;
    }

    public void setWarehouse_capacity(int warehouse_capacity) {
        this.warehouse_capacity = warehouse_capacity;
    }

    public int getBread_capacity() {
        return bread_capacity;
    }

    public void setBread_capacity(int bread_capacity) {
        this.bread_capacity = bread_capacity;
    }

    public int getBuffalomilk_capacity() {
        return buffalomilk_capacity;
    }

    public void setBuffalomilk_capacity(int buffalomilk_capacity) {
        this.buffalomilk_capacity = buffalomilk_capacity;
    }

    public int getEgg_capacity() {
        return egg_capacity;
    }

    public void setEgg_capacity(int egg_capacity) {
        this.egg_capacity = egg_capacity;
    }

    public int getFlour_capacity() {
        return flour_capacity;
    }

    public void setFlour_capacity(int flour_capacity) {
        this.flour_capacity = flour_capacity;
    }

    public int getIcecream_capacity() {
        return icecream_capacity;
    }

    public void setIcecream_capacity(int icecream_capacity) {
        this.icecream_capacity = icecream_capacity;
    }

    public int getPocketmilk_capacity() {
        return pocketmilk_capacity;
    }

    public void setPocketmilk_capacity(int pocketmilk_capacity) {
        this.pocketmilk_capacity = pocketmilk_capacity;
    }

    public int getShirt_capacity() {
        return shirt_capacity;
    }

    public void setShirt_capacity(int shirt_capacity) {
        this.shirt_capacity = shirt_capacity;
    }

    public int getTextile_capacity() {
        return textile_capacity;
    }

    public void setTextile_capacity(int textile_capacity) {
        this.textile_capacity = textile_capacity;
    }

    public int getTurkeyfeather_capacity() {
        return turkeyfeather_capacity;
    }

    public void setTurkeyfeather_capacity(int turkeyfeather_capacity) {
        this.turkeyfeather_capacity = turkeyfeather_capacity;
    }

    public int getWild_animal_capacity() {
        return Wild_animal_capacity;
    }

    public void setWild_animal_capacity(int wild_animal_capacity) {
        Wild_animal_capacity = wild_animal_capacity;
    }

    public int getChicken_cost() {
        return Chicken_cost;
    }

    public void setChicken_cost(int chicken_cost) {
        Chicken_cost = chicken_cost;
    }

    public int getOstrich_cost() {
        return Ostrich_cost;
    }

    public void setOstrich_cost(int ostrich_cost) {
        Ostrich_cost = ostrich_cost;
    }

    public int getBuffalo_cost() {
        return Buffalo_cost;
    }

    public void setBuffalo_cost(int buffalo_cost) {
        Buffalo_cost = buffalo_cost;
    }

    public int getHunterDog_cost() {
        return HunterDog_cost;
    }

    public void setHunterDog_cost(int hunterDog_cost) {
        HunterDog_cost = hunterDog_cost;
    }

    public int getCollectorCat_cost() {
        return CollectorCat_cost;
    }

    public void setCollectorCat_cost(int collectorCat_cost) {
        CollectorCat_cost = collectorCat_cost;
    }

    public int getLion_cost() {
        return lion_cost;
    }

    public void setLion_cost(int lion_cost) {
        this.lion_cost = lion_cost;
    }

    public int getBear_cost() {
        return bear_cost;
    }

    public void setBear_cost(int bear_cost) {
        this.bear_cost = bear_cost;
    }

    public int getTiger_cost() {
        return tiger_cost;
    }

    public void setTiger_cost(int tiger_cost) {
        this.tiger_cost = tiger_cost;
    }

    public int getBread_cost() {
        return bread_cost;
    }

    public void setBread_cost(int bread_cost) {
        this.bread_cost = bread_cost;
    }

    public int getBuffalomilk_cost() {
        return buffalomilk_cost;
    }

    public void setBuffalomilk_cost(int buffalomilk_cost) {
        this.buffalomilk_cost = buffalomilk_cost;
    }

    public int getEgg_cost() {
        return egg_cost;
    }

    public void setEgg_cost(int egg_cost) {
        this.egg_cost = egg_cost;
    }

    public int getFlour_cost() {
        return flour_cost;
    }

    public void setFlour_cost(int flour_cost) {
        this.flour_cost = flour_cost;
    }

    public int getIcecream_cost() {
        return icecream_cost;
    }

    public void setIcecream_cost(int icecream_cost) {
        this.icecream_cost = icecream_cost;
    }

    public int getPocketmilk_cost() {
        return pocketmilk_cost;
    }

    public void setPocketmilk_cost(int pocketmilk_cost) {
        this.pocketmilk_cost = pocketmilk_cost;
    }

    public int getShirt_cost() {
        return shirt_cost;
    }

    public void setShirt_cost(int shirt_cost) {
        this.shirt_cost = shirt_cost;
    }

    public int getTextile_cost() {
        return textile_cost;
    }

    public void setTextile_cost(int textile_cost) {
        this.textile_cost = textile_cost;
    }

    public int getTurkeyfeather_cost() {
        return turkeyfeather_cost;
    }

    public void setTurkeyfeather_cost(int turkeyfeather_cost) {
        this.turkeyfeather_cost = turkeyfeather_cost;
    }

    public int getMilkpacking_upgrade_cost() {
        return milkpacking_upgrade_cost;
    }

    public void setMilkpacking_upgrade_cost(int milkpacking_upgrade_cost) {
        this.milkpacking_upgrade_cost = milkpacking_upgrade_cost;
    }

    public int getMill_upgrade_cost() {
        return mill_upgrade_cost;
    }

    public void setMill_upgrade_cost(int mill_upgrade_cost) {
        this.mill_upgrade_cost = mill_upgrade_cost;
    }

    public int getTextile_upgrade_cost() {
        return textile_upgrade_cost;
    }

    public void setTextile_upgrade_cost(int textile_upgrade_cost) {
        this.textile_upgrade_cost = textile_upgrade_cost;
    }

    public int getBakery_upgrade_cost() {
        return bakery_upgrade_cost;
    }

    public void setBakery_upgrade_cost(int bakery_upgrade_cost) {
        this.bakery_upgrade_cost = bakery_upgrade_cost;
    }

    public int getIcecream_shop_upgrade_cost() {
        return icecream_shop_upgrade_cost;
    }

    public void setIcecream_shop_upgrade_cost(int icecream_shop_upgrade_cost) {
        this.icecream_shop_upgrade_cost = icecream_shop_upgrade_cost;
    }

    public int getTailpring_upgrade_cost() {
        return tailpring_upgrade_cost;
    }

    public void setTailpring_upgrade_cost(int tailpring_upgrade_cost) {
        this.tailpring_upgrade_cost = tailpring_upgrade_cost;
    }

    public int getMilkpacking_cost() {
        return milkpacking_cost;
    }

    public void setMilkpacking_cost(int milkpacking_cost) {
        this.milkpacking_cost = milkpacking_cost;
    }

    public int getMill_cost() {
        return mill_cost;
    }

    public void setMill_cost(int mill_cost) {
        this.mill_cost = mill_cost;
    }

    public int getTextileWorkshop_cost() {
        return textileWorkshop_cost;
    }

    public void setTextileWorkshop_cost(int textileWorkshop_cost) {
        this.textileWorkshop_cost = textileWorkshop_cost;
    }

    public int getBakery_cost() {
        return bakery_cost;
    }

    public void setBakery_cost(int bakery_cost) {
        this.bakery_cost = bakery_cost;
    }

    public int getIcecream_shop_cost() {
        return icecream_shop_cost;
    }

    public void setIcecream_shop_cost(int icecream_shop_cost) {
        this.icecream_shop_cost = icecream_shop_cost;
    }

    public int getTailpring_cost() {
        return tailpring_cost;
    }

    public void setTailpring_cost(int tailpring_cost) {
        this.tailpring_cost = tailpring_cost;
    }

    public int getStarting_coin() {
        return starting_coin;
    }

    public void setStarting_coin(int starting_coin) {
        this.starting_coin = starting_coin;
    }

    public int getTruck_capacity() {
        return truck_capacity;
    }

    public void setTruck_capacity(int truck_capacity) {
        this.truck_capacity = truck_capacity;
    }

    public int getTruck_time() {
        return truck_time;
    }

    public void setTruck_time(int truck_time) {
        this.truck_time = truck_time;
    }

    public int getWell_Time() {
        return Well_Time;
    }

    public void setWell_Time(int well_Time) {
        Well_Time = well_Time;
    }

    public int getWell_info() {
        return Well_info;
    }

    public void setWell_info(int well_info) {
        Well_info = well_info;
    }

    public int getEgg_time() {
        return egg_time;
    }

    public void setEgg_time(int egg_time) {
        this.egg_time = egg_time;
    }

    public int getBuffalomilk_time() {
        return buffalomilk_time;
    }

    public void setBuffalomilk_time(int buffalomilk_time) {
        this.buffalomilk_time = buffalomilk_time;
    }

    public int getTurkeyfeather_time() {
        return turkeyfeather_time;
    }

    public void setTurkeyfeather_time(int turkeyfeather_time) {
        this.turkeyfeather_time = turkeyfeather_time;
    }

    public int getMill_time() {
        return Mill_time;
    }

    public void setMill_time(int mill_time) {
        Mill_time = mill_time;
    }

    public int getMilkpacking_time() {
        return Milkpacking_time;
    }

    public void setMilkpacking_time(int milkpacking_time) {
        Milkpacking_time = milkpacking_time;
    }

    public int getTextile_time() {
        return textile_time;
    }

    public void setTextile_time(int textile_time) {
        this.textile_time = textile_time;
    }

    public int getBakery_time() {
        return bakery_time;
    }

    public void setBakery_time(int bakery_time) {
        this.bakery_time = bakery_time;
    }

    public int getIcecreamshop_time() {
        return icecreamshop_time;
    }

    public void setIcecreamshop_time(int icecreamshop_time) {
        this.icecreamshop_time = icecreamshop_time;
    }

    public int getTailoring_time() {
        return tailoring_time;
    }

    public void setTailoring_time(int tailoring_time) {
        this.tailoring_time = tailoring_time;
    }

    public int getFirst_destroy() {
        return first_destroy;
    }

    public void setFirst_destroy(int first_destroy) {
        this.first_destroy = first_destroy;
    }

    public int getSecond_destroy() {
        return second_destroy;
    }

    public void setSecond_destroy(int second_destroy) {
        this.second_destroy = second_destroy;
    }

    public int getThird_destroy() {
        return third_destroy;
    }

    public void setThird_destroy(int third_destroy) {
        this.third_destroy = third_destroy;
    }

    public int getScape_time() {
        return scape_time;
    }

    public void setScape_time(int scape_time) {
        this.scape_time = scape_time;
    }
}
