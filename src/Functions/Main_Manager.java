package Functions;

import Objects.*;
import Objects.Animal.Animal;
import Objects.Animal.Wild;
import Objects.Products.*;
import Objects.WorkShops.*;

import java.util.ArrayList;

public class Main_Manager {

    Cell cell[][];
    Variable_Reading variable_reading;
    ArrayList<Animal> animals = new ArrayList<>();
    private ArrayList<ArrayList> workshops = new ArrayList<>();
    Warehouse warehouse = new Warehouse(variable_reading.warehouse_info());
    Bucket_of_Water bucket_of_water = new Bucket_of_Water(variable_reading.Well_info());
    WateringSystem wateringSystem = new WateringSystem(variable_reading.Well_Time(), bucket_of_water);


    ArrayList<Bread> breads = new ArrayList<>();
    ArrayList<BuffaloMilk> buffaloMilks = new ArrayList<>();
    ArrayList<Egg> eggs = new ArrayList<>();
    ArrayList<Flour> flours = new ArrayList<>();
    ArrayList<Icecream> icecreams = new ArrayList<>();
    ArrayList<PocketMilk> pocketMilks = new ArrayList<>();
    ArrayList<TurkeyFeather> turkeyFeathers = new ArrayList<>();
    ArrayList<Shirt> shirts = new ArrayList<>();
    ArrayList<Textile> textiles = new ArrayList<>();

    ArrayList<PrimaryWorksop_MilkPacking> primaryWorkshop_milkPackings = new ArrayList<>();
    ArrayList<PrimaryWorksop_Mill> primaryWorkshop_mills = new ArrayList<>();
    ArrayList<PrimaryWorksop_Textile> primaryWorkshop_textiles = new ArrayList<>();
    ArrayList<SecondaryWorkshop_Bakery> secondaryWorkshop_bakeries = new ArrayList<>();
    ArrayList<SecondaryWorkshop_IcecreamShop> secondaryWorkshop_icecreamShops = new ArrayList<>();
    ArrayList<SecondaryWorkshop_Tailoring> secondaryWorkshop_tailorings = new ArrayList<>();

    private boolean filling_well = false;
    private boolean add_egg = false;
    private boolean add_turkeyfeather = false;
    private boolean add_buffalomilk = false;
    private boolean mill_work = false;
    private boolean textile_work = false;
    private boolean milkpacking_work = false;
    private boolean bakery_work = false;
    private boolean tailoring_work = false;
    private boolean icecreamshop_work = false;
    private boolean truck_working = false;

    private int filling_well_MAX = variable_reading.Well_Time();
    private int add_egg_MAX = variable_reading.each_time_needed("egg");
    private int add_turkeyfeather_MAX = variable_reading.each_time_needed("turkeyfeather");
    private int add_buffalomilk_MAX = variable_reading.each_time_needed("buffalomilk");
    private int mill_work_MAX = variable_reading.Get_WorkShops_Time("mill");
    private int textile_work_MAX = variable_reading.Get_WorkShops_Time("textile");
    private int milkpacking_work_MAX = variable_reading.Get_WorkShops_Time("milkpacking");
    private int bakery_work_MAX = variable_reading.Get_WorkShops_Time("bakery");
    private int tailoring_work_MAX = variable_reading.Get_WorkShops_Time("tailpring");
    private int icecreamshop_work_MAX = variable_reading.Get_WorkShops_Time("icecreamshop");
    private int truck_working_MAX = variable_reading.truck_time();

    private int filling_well_CURRENT = 0;
    private int add_egg_CURRENT = 0;
    private int add_turkeyfeather_CURRENT = 0;
    private int add_buffalomilk_CURRENT = 0;
    private int mill_work_CURRENT = 0;
    private int textile_work_CURRENT = 0;
    private int milkpacking_work_CURRENT = 0;
    private int bakery_work_CURRENT = 0;
    private int tailoring_work_CURRENT = 0;
    private int icecreamshop_work_CURRENT = 0;
    private int truck_working_CURRENT = 0;

    public Main_Manager(int[] a, Variable_Reading variable_reading) {
        make_map(a[0], a[1]);
        this.variable_reading = variable_reading;
    }

    public void Add_Animal(String name) {
        if (animals.add(new Animal(name))) {
            //TODO
        } else {
            //TODO
        }
    }

    public void Add_WorkShop(String name) {

        workshops.add(primaryWorkshop_milkPackings);
        workshops.add(primaryWorkshop_mills);
        workshops.add(primaryWorkshop_textiles);
        workshops.add(secondaryWorkshop_bakeries);
        workshops.add(secondaryWorkshop_icecreamShops);
        workshops.add(secondaryWorkshop_tailorings);

        if (name.equalsIgnoreCase("MilkPacking")) {
            if (primaryWorkshop_milkPackings.add(new PrimaryWorksop_MilkPacking())) {
                //TODO
            } else {
                //TODO
            }
        } else if (name.equalsIgnoreCase("Mill")) {
            if (primaryWorkshop_mills.add(new PrimaryWorksop_Mill())) {
                //TODO
            } else {
                //TODO
            }
        } else if (name.equalsIgnoreCase("Textile")) {
            if (primaryWorkshop_textiles.add(new PrimaryWorksop_Textile())) {
                //TODO
            } else {
                //TODO
            }
        } else if (name.equalsIgnoreCase("Bakery")) {
            if (secondaryWorkshop_bakeries.add(new SecondaryWorkshop_Bakery())) {
                //TODO
            } else {
                //TODO
            }
        } else if (name.equalsIgnoreCase("IcecreamShop")) {
            if (secondaryWorkshop_icecreamShops.add(new SecondaryWorkshop_IcecreamShop())) {
                //TODO
            } else {
                //TODO
            }
        } else if (name.equalsIgnoreCase("Tailoring")) {
            if (secondaryWorkshop_tailorings.add(new SecondaryWorkshop_Tailoring())) {
                //TODO
            } else {
                //TODO
            }
        }
    }

    Truck truck = new Truck();

    public boolean Truck_Load(String name) {
        if (truck.Load(name)){
            warehouse.Remove(name, variable_reading.item_capacity(name.split("\\s")[0]));
            return true;
        }
        else return false;
    }

    public boolean Truck_Unload(String name) {
        if (truck.Unload(name)){
            warehouse.Add(name, variable_reading.item_capacity(name.split("\\s")[0]));
            return true;
        }
        else return false;
    }

    public boolean Truck_Go() {
        if (!truck_working){
            truck_working = true;
            return true;
        }
        return false;
    }

    public boolean inWerehouse(String name) {
        if (warehouse.haveSTH(name)) {
            //TODO
            return true;
        } else {
            //TODO
            return false;
        }
    }



    private void make_map(int n, int m) {
        cell = new Cell[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                cell[i][j] = new Cell(i + 1, j + 1);
            }
        }
    }


    public boolean AddGrass(int x, int y) {
        if (bucket_of_water.getCerrunt_amount() > 0) {
            cell[x][y].addGrass();
            wateringSystem.reduceWater();
            //TODO
            return true;
        } else {
            //TODO
            return false;
        }
    }

    public boolean Well() {
        if (wateringSystem.isEmpty()&&!filling_well) {
            filling_well = true;
            return true;
        } else return false;
    }



    public boolean add_to_warehouse(int x, int y) {
        String product = cell[x][y].takeProduct();
        if (!product.equals("")) {

            warehouse.Add(product, variable_reading.item_capacity(product));
            //TODO
            return true;
        } else {
            //TODO
            return false;
        }
    }




    public boolean Cage(int x, int y) {
        if (animals.size() != 0) {
            for (int i = 0; i < animals.size(); i++) {
                if (animals.get(i).getX() == x) {
                    if (animals.get(i).getY() == y) {
                        if (animals.get(i).isActivation() == true)
                            if (animals.get(i) instanceof Wild) {
//                                animals.get(i).cage();
//                                animals.get(i).setActivation(false);//TODO
                            }
                    }
                }
            }
        }
        return true;
    }


    public boolean MilkPacking_Work() {
        if (is_sth_in_WereHouse("BuffaloMilk")&&primaryWorkshop_milkPackings.size()>0&&!milkpacking_work) {
            milkpacking_work = true;
            return true;
        } else {
            //TODO
            return false;
        }
    }

    public boolean Mill_Work() {
        if (is_sth_in_WereHouse("Egg")&&primaryWorkshop_mills.size()>0&&!mill_work) {
            mill_work = true;
            return true;
        } else {
            //TODO
            return false;
        }
    }

    public boolean Textile_Work() {
        if (is_sth_in_WereHouse("TurkeyFeather")&&primaryWorkshop_textiles.size()>0&&!textile_work) {
            textile_work = true;
            //TODO
            return true;
        } else {
            //TODO
            return false;
        }
    }

    public boolean Bakery_Work() {
        if (is_sth_in_WereHouse("Flour")&&secondaryWorkshop_bakeries.size()>0&&!bakery_work) {
            bakery_work = true;
            return true;
        } else {
            //TODO
            return false;
        }
    }

    public boolean IcecreamShop_Work() {
        if (is_sth_in_WereHouse("PocketMilk")&&secondaryWorkshop_icecreamShops.size()>0&&!icecreamshop_work) {
            icecreamshop_work = true;
            return true;
        } else {
            //TODO
            return false;
        }
    }

    public boolean Tailoring_Work() {
        if (is_sth_in_WereHouse("Textile")&&secondaryWorkshop_tailorings.size()>0&&!textile_work) {
            textile_work = true;
            return true;
        } else {
            //TODO
            return false;
        }
    }

    private boolean is_sth_in_WereHouse(String name) {
        if (warehouse.haveSTH(name)) {
            //TODO
            return true;
        } else {
            //TODO
            return false;
        }
    }

    private void Add_Primary_Products(int x, int y, String animal) {
        if (animal.equalsIgnoreCase("chicken")) {
            eggs.add(new Egg(x, y));
            cell[eggs.get(eggs.size() - 1).getX() - 1][eggs.get(eggs.size() - 1).getY() - 1].AddProduct("egg", eggs.size());
        } else if (animal.equalsIgnoreCase("Buffalo")) {
            buffaloMilks.add(new BuffaloMilk(x, y));
            cell[x - 1][y - 1].AddProduct("buffaloMilk", eggs.size());
        } else if (animal.equalsIgnoreCase("Ostrich")) {
            turkeyFeathers.add(new TurkeyFeather(x, y));
            cell[x - 1][y - 1].AddProduct("turkeyFeather", eggs.size());
        } else {
            //TODO
        }
    }


    public boolean changeTurn(int n) {
        for (int i=0;i<n;i++){
            if (filling_well){
                filling_well_CURRENT++;
                if (filling_well_CURRENT==filling_well_MAX){
                    wateringSystem.fillWell();
                    filling_well_CURRENT=0;
                    filling_well=false;
                }
            }
            if (add_egg){
                add_egg_CURRENT++;
                if (add_egg_CURRENT==add_egg_MAX){
                    //TODO
                    add_egg_CURRENT=0;
                    add_egg=false;
                }
            }
            if (add_turkeyfeather){
                add_turkeyfeather_CURRENT++;
                if (add_turkeyfeather_CURRENT==add_turkeyfeather_MAX){
                    //TODO
                    add_turkeyfeather_CURRENT=0;
                    add_turkeyfeather=false;
                }
            }
            if (add_buffalomilk){
                add_buffalomilk_CURRENT++;
                if (add_buffalomilk_CURRENT==add_buffalomilk_MAX){
                    //TODO
                    add_buffalomilk_CURRENT=0;
                    add_buffalomilk=false;
                }
            }
            if (mill_work){
                mill_work_CURRENT++;
                if (mill_work_CURRENT==mill_work_MAX){
                    //TODO
                    mill_work_CURRENT=0;
                    mill_work=false;
                }
            }
            if(textile_work){
                textile_work_CURRENT++;
                if (textile_work_CURRENT==textile_work_MAX){
                    //TODO
                    textile_work_CURRENT=0;
                    textile_work=false;
                }
            }
            if (milkpacking_work){
                milkpacking_work_CURRENT++;
                if (milkpacking_work_CURRENT==milkpacking_work_MAX){
                    //TODO
                    milkpacking_work_CURRENT=0;
                    milkpacking_work=false;
                }
            }
            if (bakery_work){
                bakery_work_CURRENT++;
                if (bakery_work_CURRENT==bakery_work_MAX){
                    //TODO
                    bakery_work_CURRENT=0;
                    bakery_work=false;
                }
            }
            if (tailoring_work){
                tailoring_work_CURRENT++;
                if (tailoring_work_CURRENT==tailoring_work_MAX){
                    //TODO
                    tailoring_work_CURRENT=0;
                    tailoring_work=false;
                }
            }
            if (icecreamshop_work){
                icecreamshop_work_CURRENT++;
                if (icecreamshop_work_CURRENT==icecreamshop_work_MAX){
                    //TODO
                    icecreamshop_work_CURRENT=0;
                    icecreamshop_work=false;
                }
            }
            if (truck_working){
                truck_working_CURRENT++;
                if (truck_working_CURRENT==truck_working_MAX){
                    boolean go = truck.Go();
                    truck_working_CURRENT=0;
                    truck_working=false;
                }
            }
        }
        return true;
    }
}
