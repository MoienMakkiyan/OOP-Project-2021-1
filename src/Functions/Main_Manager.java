package Functions;

import Objects.*;
import Objects.Animal.*;
import Objects.Products.*;
import Objects.WorkShops.*;
import java.util.ArrayList;

public class Main_Manager {

    private static Main_Manager instance = null;

    private Main_Manager(){
    }

    public static Main_Manager getInstance(){
        if (instance == null)
            instance = new Main_Manager();
        return instance;
    }

    private Cell cell[][];
    private Variable_Reading variable_reading;
    private Warehouse warehouse;
    private Bucket_of_Water bucket_of_water;
    private WateringSystem wateringSystem;
    private Truck truck;

    private ArrayList<ArrayList> animals;
    private ArrayList<ArrayList> workshops;
    private ArrayList<ArrayList> products;
    private ArrayList<Mission> missions;

    private ArrayList<Bear> bears;
    private ArrayList<Buffalo> buffalos;
    private ArrayList<Chicken> chickens;
    private ArrayList<CollectorCat> collectorCats;
    private ArrayList<HunterDog> hunterDogs;
    private ArrayList<Lion> lions;
    private ArrayList<Ostrich> ostriches;
    private ArrayList<Tiger> tigers;

    private ArrayList<Bread> breads;
    private ArrayList<BuffaloMilk> buffaloMilks;
    private ArrayList<Egg> eggs;
    private ArrayList<Flour> flours;
    private ArrayList<Icecream> icecreams;
    private ArrayList<PocketMilk> pocketMilks;
    private ArrayList<TurkeyFeather> turkeyFeathers;
    private ArrayList<Shirt> shirts;
    private ArrayList<Textile> textiles;

    private ArrayList<PrimaryWorksop_MilkPacking> primaryWorkshop_milkPackings;
    private ArrayList<PrimaryWorksop_Mill> primaryWorkshop_mills;
    private ArrayList<PrimaryWorksop_Textile> primaryWorkshop_textiles;
    private ArrayList<SecondaryWorkshop_Bakery> secondaryWorkshop_bakeries;
    private ArrayList<SecondaryWorkshop_IcecreamShop> secondaryWorkshop_icecreamShops;
    private ArrayList<SecondaryWorkshop_Tailoring> secondaryWorkshop_tailorings;

    private boolean filling_well;
    private boolean add_egg;
    private boolean add_turkeyfeather;
    private boolean add_buffalomilk;
    private boolean mill_work;
    private boolean textile_work;
    private boolean milkpacking_work;
    private boolean bakery_work;
    private boolean tailoring_work;
    private boolean icecreamshop_work;
    private boolean truck_working;

    private int filling_well_MAX;
    private int add_egg_MAX;
    private int add_turkeyfeather_MAX;
    private int add_buffalomilk_MAX;
    private int mill_work_MAX;
    private int textile_work_MAX;
    private int milkpacking_work_MAX;
    private int bakery_work_MAX;
    private int tailoring_work_MAX;
    private int icecreamshop_work_MAX;
    private int truck_working_MAX;

    private int filling_well_CURRENT;
    private int add_egg_CURRENT;
    private int add_turkeyfeather_CURRENT;
    private int add_buffalomilk_CURRENT;
    private int mill_work_CURRENT;
    private int textile_work_CURRENT;
    private int milkpacking_work_CURRENT;
    private int bakery_work_CURRENT;
    private int tailoring_work_CURRENT;
    private int icecreamshop_work_CURRENT;
    private int truck_working_CURRENT;

    /*public Main_Manager(int[] a, Variable_Reading variable_reading) {
        make_map(a[0], a[1]);
        this.variable_reading = variable_reading;
        this.warehouse = new Warehouse(variable_reading.warehouse_info());
        this.bucket_of_water = new Bucket_of_Water(variable_reading.Well_info());
        this.wateringSystem = new WateringSystem(variable_reading.Well_Time(), bucket_of_water);
        this.missions = variable_reading.getMissions();
        this.truck = new Truck();
        this.animals = new ArrayList<>();
        this.workshops = new ArrayList<>();
        this.products = new ArrayList<>();

        this.breads = new ArrayList<>();
        this.buffaloMilks = new ArrayList<>();
        this.eggs = new ArrayList<>();
        this.flours = new ArrayList<>();
        this.icecreams = new ArrayList<>();
        this.pocketMilks = new ArrayList<>();
        this.turkeyFeathers = new ArrayList<>();
        this.shirts = new ArrayList<>();
        this.textiles = new ArrayList<>();

        this.primaryWorkshop_milkPackings = new ArrayList<>();
        this.primaryWorkshop_mills = new ArrayList<>();
        this.primaryWorkshop_textiles = new ArrayList<>();
        this.secondaryWorkshop_bakeries = new ArrayList<>();
        this.secondaryWorkshop_icecreamShops = new ArrayList<>();
        this.secondaryWorkshop_tailorings = new ArrayList<>();

        this.bears = new ArrayList<>();
        this.buffalos = new ArrayList<>();
        this.chickens = new ArrayList<>();
        this.collectorCats = new ArrayList<>();
        this.hunterDogs = new ArrayList<>();
        this.lions = new ArrayList<>();
        this.ostriches = new ArrayList<>();
        this.tigers = new ArrayList<>();

        this.filling_well = false;
        this.add_egg = false;
        this.add_turkeyfeather = false;
        this.add_buffalomilk = false;
        this.mill_work = false;
        this.textile_work = false;
        this.milkpacking_work = false;
        this.bakery_work = false;
        this.tailoring_work = false;
        this.icecreamshop_work = false;
        this.truck_working = false;

        this.filling_well_MAX = variable_reading.Well_Time();
        this.add_egg_MAX = variable_reading.each_time_needed("egg");
        this.add_turkeyfeather_MAX = variable_reading.each_time_needed("turkeyfeather");
        this.add_buffalomilk_MAX = variable_reading.each_time_needed("buffalomilk");
        this.mill_work_MAX = variable_reading.Get_WorkShops_Time("mill");
        this.textile_work_MAX = variable_reading.Get_WorkShops_Time("textile");
        this.milkpacking_work_MAX = variable_reading.Get_WorkShops_Time("milkpacking");
        this.bakery_work_MAX = variable_reading.Get_WorkShops_Time("bakery");
        this.tailoring_work_MAX = variable_reading.Get_WorkShops_Time("tailpring");
        this.icecreamshop_work_MAX = variable_reading.Get_WorkShops_Time("icecreamshop");
        this.truck_working_MAX = variable_reading.truck_time();

        this.filling_well_CURRENT = 0;
        this.add_egg_CURRENT = 0;
        this.add_turkeyfeather_CURRENT = 0;
        this.add_buffalomilk_CURRENT = 0;
        this.mill_work_CURRENT = 0;
        this.textile_work_CURRENT = 0;
        this.milkpacking_work_CURRENT = 0;
        this.bakery_work_CURRENT = 0;
        this.tailoring_work_CURRENT = 0;
        this.icecreamshop_work_CURRENT = 0;
        this.truck_working_CURRENT = 0;

        workshops.add(primaryWorkshop_milkPackings);
        workshops.add(primaryWorkshop_mills);
        workshops.add(primaryWorkshop_textiles);
        workshops.add(secondaryWorkshop_bakeries);
        workshops.add(secondaryWorkshop_icecreamShops);
        workshops.add(secondaryWorkshop_tailorings);

        animals.add(bears);
        animals.add(buffalos);
        animals.add(chickens);
        animals.add(collectorCats);
        animals.add(hunterDogs);
        animals.add(lions);
        animals.add(ostriches);
        animals.add(tigers);

        products.add(breads);
        products.add(buffaloMilks);
        products.add(eggs);
        products.add(flours);
        products.add(icecreams);
        products.add(pocketMilks);
        products.add(shirts);
        products.add(textiles);
        products.add(turkeyFeathers);
    }*/

    public void Add_Animal(String name) {
        //TODO
    }

    public void Add_WorkShop(String name) {


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

    public boolean Truck_Load(String name) {
        if (truck.Load(name)&&!truck_working){
            warehouse.Remove(name, variable_reading.item_capacity(name.split("\\s")[0]));
            return true;
        }
        else return false;
    }

    public boolean Truck_Unload(String name) {
        if (truck.Unload(name)&&!truck_working){
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
        //TODO
        return true;
    }

    public boolean MilkPacking_Work() {
        if (is_sth_in_WereHouse("BuffaloMilk")&&primaryWorkshop_milkPackings.size()>0&&!milkpacking_work) {
            milkpacking_work = true;
            warehouse.Remove("BuffaloMilk", variable_reading.item_capacity("BuffaloMilk"));
            return true;
        } else {
            return false;
        }
    }

    public boolean Mill_Work() {
        if (is_sth_in_WereHouse("Egg")&&primaryWorkshop_mills.size()>0&&!mill_work) {
            mill_work = true;
            warehouse.Remove("Egg", variable_reading.item_capacity("Egg"));
            return true;
        } else {
            return false;
        }
    }

    public boolean Textile_Work() {
        if (is_sth_in_WereHouse("TurkeyFeather")&&primaryWorkshop_textiles.size()>0&&!textile_work) {
            textile_work = true;
            warehouse.Remove("TurkeyFeather", variable_reading.item_capacity("TurkeyFeather"));
            return true;
        } else {
            return false;
        }
    }

    public boolean Bakery_Work() {
        if (is_sth_in_WereHouse("Flour")&&secondaryWorkshop_bakeries.size()>0&&!bakery_work) {
            bakery_work = true;
            warehouse.Remove("Flour", variable_reading.item_capacity("Flour"));
            return true;
        } else {
            return false;
        }
    }

    public boolean IcecreamShop_Work() {
        if (is_sth_in_WereHouse("PocketMilk")&&secondaryWorkshop_icecreamShops.size()>0&&!icecreamshop_work) {
            icecreamshop_work = true;
            warehouse.Remove("PocketMilk", variable_reading.item_capacity("PocketMilk"));
            return true;
        } else {
            return false;
        }
    }

    public boolean Tailoring_Work() {
        if (is_sth_in_WereHouse("Textile")&&secondaryWorkshop_tailorings.size()>0&&!textile_work) {
            textile_work = true;
            warehouse.Remove("Textile", variable_reading.item_capacity("Textile"));
            return true;
        } else {
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
            cell[eggs.get(eggs.size() - 1).getX() - 1][eggs.get(eggs.size() - 1).getY() - 1].AddProduct("egg", eggs.size()-1);
        } else if (animal.equalsIgnoreCase("Buffalo")) {
            buffaloMilks.add(new BuffaloMilk(x, y));
            cell[x - 1][y - 1].AddProduct("buffaloMilk", buffaloMilks.size()-1);
        } else if (animal.equalsIgnoreCase("Ostrich")) {
            turkeyFeathers.add(new TurkeyFeather(x, y));
            cell[x - 1][y - 1].AddProduct("turkeyFeather", turkeyFeathers.size()-1);
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
            /*if (add_egg){
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
            }*/
            if (mill_work){
                mill_work_CURRENT++;
                if (mill_work_CURRENT==mill_work_MAX){
                    flours.add(new Flour());
                    mill_work_CURRENT=0;
                    mill_work=false;
                }
            }
            if (textile_work){
                textile_work_CURRENT++;
                if (textile_work_CURRENT==textile_work_MAX){
                    textiles.add(new Textile());
                    textile_work_CURRENT=0;
                    textile_work=false;
                }
            }
            if (milkpacking_work){
                milkpacking_work_CURRENT++;
                if (milkpacking_work_CURRENT==milkpacking_work_MAX){
                    pocketMilks.add(new PocketMilk());
                    milkpacking_work_CURRENT=0;
                    milkpacking_work=false;
                }
            }
            if (bakery_work){
                bakery_work_CURRENT++;
                if (bakery_work_CURRENT==bakery_work_MAX){
                    breads.add(new Bread());
                    bakery_work_CURRENT=0;
                    bakery_work=false;
                }
            }
            if (tailoring_work){
                tailoring_work_CURRENT++;
                if (tailoring_work_CURRENT==tailoring_work_MAX){
                    shirts.add(new Shirt());
                    tailoring_work_CURRENT=0;
                    tailoring_work=false;
                }
            }
            if (icecreamshop_work){
                icecreamshop_work_CURRENT++;
                if (icecreamshop_work_CURRENT==icecreamshop_work_MAX){
                    icecreams.add(new Icecream());
                    icecreamshop_work_CURRENT=0;
                    icecreamshop_work=false;
                }
            }
            if (truck_working){
                truck_working_CURRENT++;
                if (truck_working_CURRENT==truck_working_MAX){
                    truck.Go();
                    truck_working_CURRENT=0;
                    truck_working=false;
                }
            }
            for (Buffalo buffalo : buffalos){
                cell[buffalo.getX()-1][buffalo.getY()].RemoveAnimal("buffalo");
                buffalo.walking();
                cell[buffalo.getX()-1][buffalo.getY()].AddAnimal("buffalo");
                buffalo.time_pass();
                if (buffalo.time_to_produce()){
                    Add_Primary_Products(buffalo.getX(),buffalo.getY(),"buffalo");
                }
            }
            for (Chicken chicken : chickens){
                cell[chicken.getX()-1][chicken.getY()].RemoveAnimal("chicken");
                chicken.walking();
                cell[chicken.getX()-1][chicken.getY()].AddAnimal("chicken");
                chicken.time_pass();
                if (chicken.time_to_produce()){
                    Add_Primary_Products(chicken.getX(),chicken.getY(),"chicken");
                }
            }
            for (Ostrich ostrich : ostriches){
                cell[ostrich.getX()-1][ostrich.getY()].RemoveAnimal("ostrich");
                ostrich.walking();
                cell[ostrich.getX()-1][ostrich.getY()].AddAnimal("ostrich");
                ostrich.time_pass();
                if (ostrich.time_to_produce()){
                    Add_Primary_Products(ostrich.getX(),ostrich.getY(),"ostrich");
                }
            }
        }
        return true;
    }

    public int SELLING_PROFIT(){
        int sum = 0;
        for (int i=0;i<truck.getInTruck().size();i++)
            sum+=variable_reading.item_price(truck.getInTruck().get(i).split("\\s")[0]);
        truck.clear();
        return sum;
    }
}
