package Functions;

import Objects.*;
import Objects.Animal.*;
import Objects.Products.*;
import Objects.WorkShops.*;
import java.util.ArrayList;

public class Main_Manager {

    private static Main_Manager instance = null;

    User CURRENT_USER;

    private Cell cell[][];
    private Warehouse warehouse;
    private Bucket_of_Water bucket_of_water;
    private WateringSystem wateringSystem;
    private Truck truck;
    private int current_level;

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

    private boolean mill_work_2;
    private boolean textile_work_2;
    private boolean milkpacking_work_2;
    private boolean bakery_work_2;
    private boolean tailoring_work_2;
    private boolean icecreamshop_work_2;

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


    private Main_Manager(){
        make_map(Variable_Reading.getInstance().getMap_size()[0],Variable_Reading.getInstance().getMap_size()[1]);
        this.warehouse = new Warehouse(Variable_Reading.getInstance().warehouse_info());
        this.bucket_of_water = new Bucket_of_Water(Variable_Reading.getInstance().Well_info());
        this.wateringSystem = new WateringSystem(Variable_Reading.getInstance().Well_Time(), bucket_of_water);
        this.missions = Variable_Reading.getInstance().getMissions();
        this.truck = new Truck();
        this.animals = new ArrayList<>();
        this.workshops = new ArrayList<>();
        this.products = new ArrayList<>();

        this.mill_work_2 = false;
        this.textile_work_2 = false;
        this.milkpacking_work_2 = false;
        this.bakery_work_2 = false;
        this.tailoring_work_2 = false;
        this.icecreamshop_work_2 = false;

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

        this.filling_well_MAX = Variable_Reading.getInstance().Well_Time();
        this.add_egg_MAX = Variable_Reading.getInstance().each_time_needed("egg");
        this.add_turkeyfeather_MAX = Variable_Reading.getInstance().each_time_needed("turkeyfeather");
        this.add_buffalomilk_MAX = Variable_Reading.getInstance().each_time_needed("buffalomilk");
        this.mill_work_MAX = Variable_Reading.getInstance().Get_WorkShops_Time("mill");
        this.textile_work_MAX = Variable_Reading.getInstance().Get_WorkShops_Time("textile");
        this.milkpacking_work_MAX = Variable_Reading.getInstance().Get_WorkShops_Time("milkpacking");
        this.bakery_work_MAX = Variable_Reading.getInstance().Get_WorkShops_Time("bakery");
        this.tailoring_work_MAX = Variable_Reading.getInstance().Get_WorkShops_Time("tailpring");
        this.icecreamshop_work_MAX = Variable_Reading.getInstance().Get_WorkShops_Time("icecreamshop");
        this.truck_working_MAX = Variable_Reading.getInstance().truck_time();

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
    }

    public static Main_Manager getInstance(){
        if (instance == null)
            instance = new Main_Manager();
        return instance;
    }

    public void Add_Animal(String name) {
        if (name.equalsIgnoreCase("Bear")) {
            bears.add(new Bear());
        }
        else if (name.equalsIgnoreCase("Buffalo")) {
            buffalos.add(new Buffalo(Variable_Reading.getInstance().getBuffalomilk_time()));
        }
        else if (name.equalsIgnoreCase("Chicken")) {
            chickens.add(new Chicken(Variable_Reading.getInstance().getEgg_time()));
        }
        else if (name.equalsIgnoreCase("CollectorCat")) {
            collectorCats.add(new CollectorCat());
        }
        else if (name.equalsIgnoreCase("HunterDog")) {
            hunterDogs.add(new HunterDog());
        }
        else if (name.equalsIgnoreCase("Lion")) {
            lions.add(new Lion());
        }
        else if (name.equalsIgnoreCase("Ostrich")) {
            ostriches.add(new Ostrich(Variable_Reading.getInstance().getTurkeyfeather_time()));
        }
        else if (name.equalsIgnoreCase("Tiger")) {
            tigers.add(new Tiger());
        }
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
            warehouse.Remove(name, Variable_Reading.getInstance().item_capacity(name.split("\\s")[0]));
            if (name.equalsIgnoreCase("Bread")){
                for (Bread bread : breads){
                    if (!bread.isTransporting()){
                        bread.setTransporting(true);
                        break;
                    }
                }
            }
            else if (name.equalsIgnoreCase("BuffaloMilk")){
                for (BuffaloMilk buffaloMilk : buffaloMilks){
                    if (!buffaloMilk.isTransporting()){
                        buffaloMilk.setTransporting(true);
                        break;
                    }
                }
            }
            else if (name.equalsIgnoreCase("Egg")){
                for (Egg egg : eggs){
                    if (!egg.isTransporting()){
                        egg.setTransporting(true);
                        break;
                    }
                }
            }
            else if (name.equalsIgnoreCase("Flour")){
                for (Flour flour : flours){
                    if (!flour.isTransporting()){
                        flour.setTransporting(true);
                        break;
                    }
                }
            }
            else if (name.equalsIgnoreCase("Icecream")){
                for (Icecream icecream : icecreams){
                    if (!icecream.isTransporting()){
                        icecream.setTransporting(true);
                        break;
                    }
                }
            }
            else if (name.equalsIgnoreCase("PocketMilk")){
                for (PocketMilk pocketMilk : pocketMilks){
                    if (!pocketMilk.isTransporting()){
                        pocketMilk.setTransporting(true);
                        break;
                    }
                }
            }
            else if (name.equalsIgnoreCase("Shirt")){
                for (Shirt shirt : shirts){
                    if (!shirt.isTransporting()){
                        shirt.setTransporting(true);
                        break;
                    }
                }
            }
            else if (name.equalsIgnoreCase("Textile")){
                for (Textile textile : textiles){
                    if (!textile.isTransporting()){
                        textile.setTransporting(true);
                        break;
                    }
                }
            }
            else if (name.equalsIgnoreCase("TurkeyFeather")){
                for (TurkeyFeather turkeyFeather : turkeyFeathers){
                    if (!turkeyFeather.isTransporting()){
                        turkeyFeather.setTransporting(true);
                        break;
                    }
                }
            }
            return true;
        }
        else return false;
    }

    public boolean Truck_Unload(String name) {
        if (truck.Unload(name)&&!truck_working){
            warehouse.Add(name, Variable_Reading.getInstance().item_capacity(name.split("\\s")[0]));
            if (name.equalsIgnoreCase("Bread")){
                for (Bread bread : breads){
                    if (bread.isTransporting()){
                        bread.setTransporting(false);
                        break;
                    }
                }
            }
            else if (name.equalsIgnoreCase("BuffaloMilk")){
                for (BuffaloMilk buffaloMilk : buffaloMilks){
                    if (buffaloMilk.isTransporting()){
                        buffaloMilk.setTransporting(false);
                        break;
                    }
                }
            }
            else if (name.equalsIgnoreCase("Egg")){
                for (Egg egg : eggs){
                    if (egg.isTransporting()){
                        egg.setTransporting(false);
                        break;
                    }
                }
            }
            else if (name.equalsIgnoreCase("Flour")){
                for (Flour flour : flours){
                    if (flour.isTransporting()){
                        flour.setTransporting(false);
                        break;
                    }
                }
            }
            else if (name.equalsIgnoreCase("Icecream")){
                for (Icecream icecream : icecreams){
                    if (icecream.isTransporting()){
                        icecream.setTransporting(false);
                        break;
                    }
                }
            }
            else if (name.equalsIgnoreCase("PocketMilk")){
                for (PocketMilk pocketMilk : pocketMilks){
                    if (pocketMilk.isTransporting()){
                        pocketMilk.setTransporting(false);
                        break;
                    }
                }
            }
            else if (name.equalsIgnoreCase("Shirt")){
                for (Shirt shirt : shirts){
                    if (shirt.isTransporting()){
                        shirt.setTransporting(false);
                        break;
                    }
                }
            }
            else if (name.equalsIgnoreCase("Textile")){
                for (Textile textile : textiles){
                    if (textile.isTransporting()){
                        textile.setTransporting(false);
                        break;
                    }
                }
            }
            else if (name.equalsIgnoreCase("TurkeyFeather")){
                for (TurkeyFeather turkeyFeather : turkeyFeathers){
                    if (turkeyFeather.isTransporting()){
                        turkeyFeather.setTransporting(false);
                        break;
                    }
                }
            }
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
            cell[x-1][y-1].addGrass();
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
            warehouse.Add(product, Variable_Reading.getInstance().item_capacity(product));
            if (product.equalsIgnoreCase("Bread")){
                for (Bread bread : breads){
                    if (bread.getX() == x+1 && bread.getY() == y+1) {
                        bread.setInMap(false);
                        bread.setInWerehouse(true);
                    }
                }
            }
            else if (product.equalsIgnoreCase("BuffaloMilk")){
                for (BuffaloMilk buffaloMilk : buffaloMilks){
                    if (buffaloMilk.getX() == x+1 && buffaloMilk.getY() == y+1) {
                        buffaloMilk.setInMap(false);
                        buffaloMilk.setInWerehouse(true);
                    }
                }
            }
            else if (product.equalsIgnoreCase("Egg")){
                for (Egg egg : eggs){
                    if (egg.getX() == x+1 && egg.getY() == y+1) {
                        egg.setInMap(false);
                        egg.setInWerehouse(true);
                    }
                }
            }
            else if (product.equalsIgnoreCase("Flour")){
                for (Flour flour : flours){
                    if (flour.getX() == x+1 && flour.getY() == y+1) {
                        flour.setInMap(false);
                        flour.setInWerehouse(true);
                    }
                }
            }
            else if (product.equalsIgnoreCase("Icecream")){
                for (Icecream icecream : icecreams){
                    if (icecream.getX() == x+1 && icecream.getY() == y+1) {
                        icecream.setInMap(false);
                        icecream.setInWerehouse(true);
                    }
                }
            }
            else if (product.equalsIgnoreCase("PocketMilk")){
                for (PocketMilk pocketMilk : pocketMilks){
                    if (pocketMilk.getX() == x+1 && pocketMilk.getY() == y+1) {
                        pocketMilk.setInMap(false);
                        pocketMilk.setInWerehouse(true);
                    }
                }
            }
            else if (product.equalsIgnoreCase("Shirt")){
                for (Shirt shirt : shirts){
                    if (shirt.getX() == x+1 && shirt.getY() == y+1) {
                        shirt.setInMap(false);
                        shirt.setInWerehouse(true);
                    }
                }
            }
            else if (product.equalsIgnoreCase("Textile")){
                for (Textile textile : textiles){
                    if (textile.getX() == x+1 && textile.getY() == y+1) {
                        textile.setInMap(false);
                        textile.setInWerehouse(true);
                    }
                }
            }
            else if (product.equalsIgnoreCase("TurkeyFeather")){
                for (TurkeyFeather turkeyFeather : turkeyFeathers){
                    if (turkeyFeather.getX() == x+1 && turkeyFeather.getY() == y+1) {
                        turkeyFeather.setInMap(false);
                        turkeyFeather.setInWerehouse(true);
                    }
                }
            }
            //TODO
            return true;
        } else {
            //TODO there wasn't a product there
            return false;
        }
    }

    public boolean Cage(int x, int y) {
        if (cell[x-1][y-1].getAnimals().size()>0){
            for (String name : cell[x-1][y-1].getAnimals()){
                if (name.equalsIgnoreCase("Bear")){
                    for (Bear bear : bears){
                        if (bear.getX() == x && bear.getY() == y){
                            bear.setCage_counter(bear.getCage_counter()+2);
                            bear.setActivation(false);
                            return true;
                        }
                    }
                }
                else if (name.equalsIgnoreCase("Lion")){
                    for (Lion lion : lions){
                        if (lion.getX() == x && lion.getY() == y){
                            lion.setCage_counter(lion.getCage_counter()+2);
                            lion.setActivation(false);
                            return true;
                        }
                    }
                }
                else if (name.equalsIgnoreCase("Tiger")){
                    for (Tiger tiger : tigers){
                        if (tiger.getX() == x && tiger.getY() == y){
                            tiger.setCage_counter(tiger.getCage_counter()+2);
                            tiger.setActivation(false);
                            return true;
                        }
                    }
                }
                else {
                    //TODO there is no wild animal in this cell
                    return false;
                }
            }
        }
        else {
            //TODO no animal in this cell
            return false;
        }
        return false;
    }

    public boolean MilkPacking_Work() {
        if (is_sth_in_WereHouse("BuffaloMilk")&&primaryWorkshop_milkPackings.size()>0&&!milkpacking_work) {
            if (primaryWorkshop_milkPackings.get(0).getLevel() == 1){
                milkpacking_work = true;
                warehouse.Remove("BuffaloMilk", Variable_Reading.getInstance().item_capacity("BuffaloMilk"));
            }
            else if (primaryWorkshop_milkPackings.get(0).getLevel() == 2){
                if (is_sth_in_WereHouse_double("BuffaloMilk")){
                    mill_work = true;
                    warehouse.Remove("BuffaloMilk", Variable_Reading.getInstance().item_capacity("BuffaloMilk"));
                    warehouse.Remove("BuffaloMilk", Variable_Reading.getInstance().item_capacity("BuffaloMilk"));
                    milkpacking_work_2 = true;
                }
                else {
                    mill_work = true;
                    warehouse.Remove("BuffaloMilk", Variable_Reading.getInstance().item_capacity("BuffaloMilk"));
                    milkpacking_work_2 = false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public boolean Mill_Work() {
        if (is_sth_in_WereHouse("Egg")&&primaryWorkshop_mills.size()>0&&!mill_work) {
            if (primaryWorkshop_mills.get(0).getLevel() == 1){
                mill_work = true;
                warehouse.Remove("Egg", Variable_Reading.getInstance().item_capacity("Egg"));
            }
            else if (primaryWorkshop_mills.get(0).getLevel() == 2){
                if (is_sth_in_WereHouse_double("Egg")){
                    mill_work = true;
                    warehouse.Remove("Egg", Variable_Reading.getInstance().item_capacity("Egg"));
                    warehouse.Remove("Egg", Variable_Reading.getInstance().item_capacity("Egg"));
                    mill_work_2 = true;
                }
                else {
                    mill_work = true;
                    warehouse.Remove("Egg", Variable_Reading.getInstance().item_capacity("Egg"));
                    mill_work_2 = false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public boolean Textile_Work() {
        if (is_sth_in_WereHouse("TurkeyFeather")&&primaryWorkshop_textiles.size()>0&&!textile_work) {
            if (primaryWorkshop_textiles.get(0).getLevel() == 1){
                textile_work = true;
                warehouse.Remove("TurkeyFeather", Variable_Reading.getInstance().item_capacity("TurkeyFeather"));
            }
            else if (primaryWorkshop_textiles.get(0).getLevel() == 2){
                if (is_sth_in_WereHouse_double("TurkeyFeather")){
                    textile_work = true;
                    warehouse.Remove("TurkeyFeather", Variable_Reading.getInstance().item_capacity("TurkeyFeather"));
                    warehouse.Remove("TurkeyFeather", Variable_Reading.getInstance().item_capacity("TurkeyFeather"));
                    textile_work_2 = true;
                }
                else {
                    textile_work = true;
                    warehouse.Remove("TurkeyFeather", Variable_Reading.getInstance().item_capacity("TurkeyFeather"));
                    textile_work_2 = false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public boolean Bakery_Work() {
        if (is_sth_in_WereHouse("Flour")&&secondaryWorkshop_bakeries.size()>0&&!bakery_work) {
            if (secondaryWorkshop_bakeries.get(0).getLevel() == 1){
                bakery_work = true;
                warehouse.Remove("Flour", Variable_Reading.getInstance().item_capacity("Flour"));
            }
            else if (secondaryWorkshop_bakeries.get(0).getLevel() == 2){
                if (is_sth_in_WereHouse_double("Flour")){
                    bakery_work = true;
                    warehouse.Remove("Flour", Variable_Reading.getInstance().item_capacity("Flour"));
                    warehouse.Remove("Flour", Variable_Reading.getInstance().item_capacity("Flour"));
                    bakery_work_2 = true;
                }
                else {
                    bakery_work = true;
                    warehouse.Remove("Flour", Variable_Reading.getInstance().item_capacity("Flour"));
                    bakery_work_2 = false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public boolean IcecreamShop_Work() {
        if (is_sth_in_WereHouse("PocketMilk")&&secondaryWorkshop_icecreamShops.size()>0&&!icecreamshop_work) {
            if (secondaryWorkshop_icecreamShops.get(0).getLevel() == 1){
                icecreamshop_work = true;
                warehouse.Remove("PocketMilk", Variable_Reading.getInstance().item_capacity("PocketMilk"));
            }
            else if (secondaryWorkshop_icecreamShops.get(0).getLevel() == 2){
                icecreamshop_work = true;
                warehouse.Remove("PocketMilk", Variable_Reading.getInstance().item_capacity("PocketMilk"));
                warehouse.Remove("PocketMilk", Variable_Reading.getInstance().item_capacity("PocketMilk"));
                icecreamshop_work_2 = true;
            }
            else {
                icecreamshop_work = true;
                warehouse.Remove("PocketMilk", Variable_Reading.getInstance().item_capacity("PocketMilk"));
                icecreamshop_work_2 = false;
            }
            return true;
        } else {
            return false;
        }
    }

    public boolean Tailoring_Work() {
        if (is_sth_in_WereHouse("Textile")&&secondaryWorkshop_tailorings.size()>0&&!textile_work) {
            if (secondaryWorkshop_tailorings.get(0).getLevel() == 1){
                tailoring_work = true;
                warehouse.Remove("Textile", Variable_Reading.getInstance().item_capacity("Textile"));
            }
            else if (secondaryWorkshop_tailorings.get(0).getLevel() == 2){
                if (is_sth_in_WereHouse_double("Textile")){
                    tailoring_work = true;
                    warehouse.Remove("Textile", Variable_Reading.getInstance().item_capacity("Textile"));
                    warehouse.Remove("Textile", Variable_Reading.getInstance().item_capacity("Textile"));
                    tailoring_work_2 = true;
                }
                else {
                    tailoring_work = true;
                    warehouse.Remove("Textile", Variable_Reading.getInstance().item_capacity("Textile"));
                    tailoring_work_2 = false;
                }
            }
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

    private boolean is_sth_in_WereHouse_double(String name) {
        if (warehouse.haveSTHDouble(name)) {
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
            cell[x - 1][y - 1].AddProduct("egg", eggs.size()-1);
        } else if (animal.equalsIgnoreCase("Buffalo")) {
            buffaloMilks.add(new BuffaloMilk(x, y));
            cell[x - 1][y - 1].AddProduct("buffaloMilk", buffaloMilks.size()-1);
        } else if (animal.equalsIgnoreCase("Ostrich")) {
            turkeyFeathers.add(new TurkeyFeather(x, y));
            cell[x - 1][y - 1].AddProduct("turkeyFeather", turkeyFeathers.size()-1);
        } else {
            //TODO never happen
        }
    }

    public boolean changeTurn(int n) {
        missions.get(current_level-1).setTime_passed_in_this_level(missions.get(current_level-1).getTime_passed_in_this_level()+1);
        for (int i=0;i<n;i++){
            missions.get(current_level-1).setTime_passed_in_this_level(missions.get(current_level-1).getTime_passed_in_this_level()+1);

            if (filling_well){
                filling_well_CURRENT++;
                if (filling_well_CURRENT==filling_well_MAX){
                    wateringSystem.fillWell();
                    filling_well_CURRENT=0;
                    filling_well=false;
                }
            }

            if (mill_work){
                mill_work_CURRENT++;
                if (primaryWorkshop_mills.get(0).getLevel() == 1){
                    if (mill_work_CURRENT==mill_work_MAX){
                        flours.add(new Flour());
                        mill_work_CURRENT=0;
                        mill_work=false;
                    }
                }
                else if (primaryWorkshop_mills.get(0).getLevel() == 2){
                    if (mill_work_2){
                        if (mill_work_CURRENT==mill_work_MAX*2){
                            flours.add(new Flour());
                            flours.add(new Flour());
                            mill_work_CURRENT=0;
                            mill_work=false;
                            mill_work_2=false;
                        }
                    }
                    else {
                        if (mill_work_CURRENT==mill_work_MAX){
                            flours.add(new Flour());
                            mill_work_CURRENT=0;
                            mill_work=false;
                            mill_work_2=false;
                        }
                    }
                }

            }

            if (textile_work){
                textile_work_CURRENT++;
                if (primaryWorkshop_textiles.get(0).getLevel() == 1){
                    if (textile_work_CURRENT==textile_work_MAX){
                        textiles.add(new Textile());
                        textile_work_CURRENT=0;
                        textile_work=false;
                    }
                }
                else if (primaryWorkshop_textiles.get(0).getLevel() == 2){
                    if (textile_work_2){
                        if (textile_work_CURRENT==textile_work_MAX*2){
                            textiles.add(new Textile());
                            textiles.add(new Textile());
                            textile_work_CURRENT=0;
                            textile_work=false;
                            textile_work_2=false;
                        }
                    }
                    else {
                        if (textile_work_CURRENT==textile_work_MAX){
                            textiles.add(new Textile());
                            textile_work_CURRENT=0;
                            textile_work=false;
                            textile_work_2=false;
                        }
                    }
                }
            }

            if (milkpacking_work){
                milkpacking_work_CURRENT++;
                if (primaryWorkshop_milkPackings.get(0).getLevel() == 1){
                    if (milkpacking_work_CURRENT==milkpacking_work_MAX){
                        pocketMilks.add(new PocketMilk());
                        milkpacking_work_CURRENT=0;
                        milkpacking_work=false;
                    }
                }
                else if (primaryWorkshop_milkPackings.get(0).getLevel() == 2){
                    if (milkpacking_work_2){
                        if (milkpacking_work_CURRENT==milkpacking_work_MAX*2){
                            pocketMilks.add(new PocketMilk());
                            pocketMilks.add(new PocketMilk());
                            milkpacking_work_CURRENT=0;
                            milkpacking_work=false;
                            milkpacking_work_2=true;
                        }
                    }
                    else {
                        if (milkpacking_work_CURRENT==milkpacking_work_MAX){
                            pocketMilks.add(new PocketMilk());
                            milkpacking_work_CURRENT=0;
                            milkpacking_work=false;
                            milkpacking_work_2=true;
                        }
                    }
                }
            }

            if (bakery_work){
                bakery_work_CURRENT++;
                if (secondaryWorkshop_bakeries.get(0).getLevel() == 1){
                    if (bakery_work_CURRENT==bakery_work_MAX){
                        breads.add(new Bread());
                        bakery_work_CURRENT=0;
                        bakery_work=false;
                    }
                }
                else if (secondaryWorkshop_bakeries.get(0).getLevel() == 2){
                    if (bakery_work_2){
                        if (bakery_work_CURRENT==bakery_work_MAX*2){
                            breads.add(new Bread());
                            breads.add(new Bread());
                            bakery_work_CURRENT=0;
                            bakery_work=false;
                            bakery_work_2=false;
                        }
                    }
                    else {
                        if (bakery_work_CURRENT==bakery_work_MAX){
                            breads.add(new Bread());
                            bakery_work_CURRENT=0;
                            bakery_work=false;
                            bakery_work_2=false;
                        }
                    }
                }
            }

            if (tailoring_work){
                tailoring_work_CURRENT++;
                if (secondaryWorkshop_tailorings.get(0).getLevel() == 1){
                    if (tailoring_work_CURRENT==tailoring_work_MAX){
                        shirts.add(new Shirt());
                        tailoring_work_CURRENT=0;
                        tailoring_work=false;
                    }
                }
                else if (secondaryWorkshop_tailorings.get(0).getLevel() == 2){
                    if (tailoring_work_2){
                        if (tailoring_work_CURRENT==tailoring_work_MAX*2){
                            shirts.add(new Shirt());
                            shirts.add(new Shirt());
                            tailoring_work_CURRENT=0;
                            tailoring_work=false;
                            tailoring_work_2=false;
                        }
                    }
                    else {
                        if (tailoring_work_CURRENT==tailoring_work_MAX){
                            shirts.add(new Shirt());
                            tailoring_work_CURRENT=0;
                            tailoring_work=false;
                            tailoring_work_2=false;
                        }
                    }
                }

            }

            if (icecreamshop_work){
                icecreamshop_work_CURRENT++;
                if (secondaryWorkshop_icecreamShops.get(0).getLevel() == 1){
                    if (icecreamshop_work_CURRENT==icecreamshop_work_MAX){
                        icecreams.add(new Icecream());
                        icecreamshop_work_CURRENT=0;
                        icecreamshop_work=false;
                    }
                }
                else if (secondaryWorkshop_icecreamShops.get(0).getLevel() == 2){
                    if (icecreamshop_work_2){
                        if (icecreamshop_work_CURRENT==icecreamshop_work_MAX*2){
                            icecreams.add(new Icecream());
                            icecreams.add(new Icecream());
                            icecreamshop_work_CURRENT=0;
                            icecreamshop_work=false;
                            icecreamshop_work_2=false;
                        }
                    }
                    else {
                        if (icecreamshop_work_CURRENT==icecreamshop_work_MAX){
                            icecreams.add(new Icecream());
                            icecreamshop_work_CURRENT=0;
                            icecreamshop_work=false;
                            icecreamshop_work_2=false;
                        }
                    }
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
                cell[buffalo.getX()-1][buffalo.getY()-1].RemoveAnimal("buffalo");
                buffalo.walk();
                cell[buffalo.getX()-1][buffalo.getY()-1].AddAnimal("buffalo");
                buffalo.time_pass();
                if (buffalo.time_to_produce()){
                    Add_Primary_Products(buffalo.getX(),buffalo.getY(),"buffalo");
                }
                if (buffalo.isHungry()&&cell[buffalo.getX()-1][buffalo.getY()-1].hasGrass()){
                    cell[buffalo.getX()-1][buffalo.getY()-1].eatGrass();
                    buffalo.eat();
                }
            }

            for (Chicken chicken : chickens){
                cell[chicken.getX()-1][chicken.getY()-1].RemoveAnimal("chicken");
                chicken.walk();
                cell[chicken.getX()-1][chicken.getY()-1].AddAnimal("chicken");
                chicken.time_pass();
                if (chicken.time_to_produce()){
                    Add_Primary_Products(chicken.getX(),chicken.getY(),"chicken");
                }
                if (chicken.isHungry()&&cell[chicken.getX()-1][chicken.getY()-1].hasGrass()){
                    cell[chicken.getX()-1][chicken.getY()-1].eatGrass();
                    chicken.eat();
                }
            }

            for (Ostrich ostrich : ostriches){
                cell[ostrich.getX()-1][ostrich.getY()-1].RemoveAnimal("ostrich");
                ostrich.walk();
                cell[ostrich.getX()-1][ostrich.getY()-1].AddAnimal("ostrich");
                ostrich.time_pass();
                if (ostrich.time_to_produce()){
                    Add_Primary_Products(ostrich.getX(),ostrich.getY(),"ostrich");
                }
                if (ostrich.isHungry()&&cell[ostrich.getX()-1][ostrich.getY()-1].hasGrass()){
                    cell[ostrich.getX()-1][ostrich.getY()-1].eatGrass();
                    ostrich.eat();
                }
            }

            for (Bear bear : bears){
                if (bear.isActivation()){
                    cell[bear.getX()-1][bear.getY()-1].RemoveAnimal("bear");
                    bear.simple_walk();
                    cell[bear.getX()-1][bear.getY()-1].AddAnimal("bear");
                }
                bear.passTime();
                if (bear.caught()){
                    cell[bear.getX()-1][bear.getY()-1].RemoveAnimal("bear");
                    bears.remove(bear);
                    warehouse.Add("wild_animal",Variable_Reading.getInstance().getWild_animal_capacity());
                }
                if (!bear.isActivation()&&cell[bear.getX()-1][bear.getY()-1].getProducts().size()>0){
                    int mm = bear.getX();
                    int nn = bear.getY();
                    for (Bread bread : breads){
                        if (bread.isInMap()&&bread.getX()==mm&&bread.getY()==nn){
                            breads.remove(bread);
                        }
                    }
                    for (BuffaloMilk buffaloMilk : buffaloMilks){
                        if (buffaloMilk.isInMap()&&buffaloMilk.getX()==mm&&buffaloMilk.getY()==nn){
                            buffaloMilks.remove(buffaloMilk);
                        }
                    }
                    for (Egg egg : eggs){
                        if (egg.isInMap()&&egg.getX()==mm&&egg.getY()==nn){
                            eggs.remove(egg);
                        }
                    }
                    for (Flour flour : flours){
                        if (flour.isInMap()&&flour.getX()==mm&&flour.getY()==nn){
                            flours.remove(flour);
                        }
                    }
                    for (Icecream icecream : icecreams){
                        if (icecream.isInMap()&&icecream.getX()==mm&&icecream.getY()==nn){
                            icecreams.remove(icecream);
                        }
                    }
                    for (PocketMilk pocketMilk : pocketMilks){
                        if (pocketMilk.isInMap()&&pocketMilk.getX()==mm&&pocketMilk.getY()==nn){
                            pocketMilks.remove(pocketMilk);
                        }
                    }
                    for (Shirt shirt : shirts){
                        if (shirt.isInMap()&&shirt.getX()==mm&&shirt.getY()==nn){
                            shirts.remove(shirt);
                        }
                    }
                    for (Textile textile : textiles){
                        if (textile.isInMap()&&textile.getX()==mm&&textile.getY()==nn){
                            textiles.remove(textile);
                        }
                    }
                    for (TurkeyFeather turkeyFeather : turkeyFeathers){
                        if (turkeyFeather.isInMap()&&turkeyFeather.getX()==mm&&turkeyFeather.getY()==nn){
                            turkeyFeathers.remove(turkeyFeather);
                        }
                    }
                    cell[bear.getX()-1][bear.getY()-1].getProducts().clear();
                }
            }

            for (Lion lion : lions){
                if (lion.isActivation()){
                    cell[lion.getX()-1][lion.getY()-1].RemoveAnimal("lion");
                    lion.simple_walk();
                    cell[lion.getX()-1][lion.getY()-1].AddAnimal("lion");
                }
                lion.passTime();
                if (lion.caught()){
                    cell[lion.getX()-1][lion.getY()-1].RemoveAnimal("lion");
                    lions.remove(lion);
                    warehouse.Add("wild_animal",Variable_Reading.getInstance().getWild_animal_capacity());
                }
                if (!lion.isActivation()&&cell[lion.getX()-1][lion.getY()-1].getProducts().size()>0){
                    int mm = lion.getX();
                    int nn = lion.getY();
                    for (Bread bread : breads){
                        if (bread.isInMap()&&bread.getX()==mm&&bread.getY()==nn){
                            breads.remove(bread);
                        }
                    }
                    for (BuffaloMilk buffaloMilk : buffaloMilks){
                        if (buffaloMilk.isInMap()&&buffaloMilk.getX()==mm&&buffaloMilk.getY()==nn){
                            buffaloMilks.remove(buffaloMilk);
                        }
                    }
                    for (Egg egg : eggs){
                        if (egg.isInMap()&&egg.getX()==mm&&egg.getY()==nn){
                            eggs.remove(egg);
                        }
                    }
                    for (Flour flour : flours){
                        if (flour.isInMap()&&flour.getX()==mm&&flour.getY()==nn){
                            flours.remove(flour);
                        }
                    }
                    for (Icecream icecream : icecreams){
                        if (icecream.isInMap()&&icecream.getX()==mm&&icecream.getY()==nn){
                            icecreams.remove(icecream);
                        }
                    }
                    for (PocketMilk pocketMilk : pocketMilks){
                        if (pocketMilk.isInMap()&&pocketMilk.getX()==mm&&pocketMilk.getY()==nn){
                            pocketMilks.remove(pocketMilk);
                        }
                    }
                    for (Shirt shirt : shirts){
                        if (shirt.isInMap()&&shirt.getX()==mm&&shirt.getY()==nn){
                            shirts.remove(shirt);
                        }
                    }
                    for (Textile textile : textiles){
                        if (textile.isInMap()&&textile.getX()==mm&&textile.getY()==nn){
                            textiles.remove(textile);
                        }
                    }
                    for (TurkeyFeather turkeyFeather : turkeyFeathers){
                        if (turkeyFeather.isInMap()&&turkeyFeather.getX()==mm&&turkeyFeather.getY()==nn){
                            turkeyFeathers.remove(turkeyFeather);
                        }
                    }
                    cell[lion.getX()-1][lion.getY()-1].getProducts().clear();
                }
            }

            for (Tiger tiger : tigers){
                if (tiger.isActivation()){
                    cell[tiger.getX()-1][tiger.getY()-1].RemoveAnimal("tiger");
                    tiger.simple_walk();
                    cell[tiger.getX()-1][tiger.getY()-1].AddAnimal("tiger");
                }
                tiger.passTime();
                if (tiger.caught()){
                    cell[tiger.getX()-1][tiger.getY()-1].RemoveAnimal("tiger");
                    tigers.remove(tiger);
                    warehouse.Add("wild_animal",Variable_Reading.getInstance().getWild_animal_capacity());
                }
                if (!tiger.isActivation()&&cell[tiger.getX()-1][tiger.getY()-1].getProducts().size()>0){
                    int mm = tiger.getX();
                    int nn = tiger.getY();
                    for (Bread bread : breads){
                        if (bread.isInMap()&&bread.getX()==mm&&bread.getY()==nn){
                            breads.remove(bread);
                        }
                    }
                    for (BuffaloMilk buffaloMilk : buffaloMilks){
                        if (buffaloMilk.isInMap()&&buffaloMilk.getX()==mm&&buffaloMilk.getY()==nn){
                            buffaloMilks.remove(buffaloMilk);
                        }
                    }
                    for (Egg egg : eggs){
                        if (egg.isInMap()&&egg.getX()==mm&&egg.getY()==nn){
                            eggs.remove(egg);
                        }
                    }
                    for (Flour flour : flours){
                        if (flour.isInMap()&&flour.getX()==mm&&flour.getY()==nn){
                            flours.remove(flour);
                        }
                    }
                    for (Icecream icecream : icecreams){
                        if (icecream.isInMap()&&icecream.getX()==mm&&icecream.getY()==nn){
                            icecreams.remove(icecream);
                        }
                    }
                    for (PocketMilk pocketMilk : pocketMilks){
                        if (pocketMilk.isInMap()&&pocketMilk.getX()==mm&&pocketMilk.getY()==nn){
                            pocketMilks.remove(pocketMilk);
                        }
                    }
                    for (Shirt shirt : shirts){
                        if (shirt.isInMap()&&shirt.getX()==mm&&shirt.getY()==nn){
                            shirts.remove(shirt);
                        }
                    }
                    for (Textile textile : textiles){
                        if (textile.isInMap()&&textile.getX()==mm&&textile.getY()==nn){
                            textiles.remove(textile);
                        }
                    }
                    for (TurkeyFeather turkeyFeather : turkeyFeathers){
                        if (turkeyFeather.isInMap()&&turkeyFeather.getX()==mm&&turkeyFeather.getY()==nn){
                            turkeyFeathers.remove(turkeyFeather);
                        }
                    }
                    cell[tiger.getX()-1][tiger.getY()-1].getProducts().clear();
                }
            }

            for (CollectorCat collectorCat : collectorCats){
                cell[collectorCat.getX()][collectorCat.getY()-1].RemoveAnimal("collectorCat");
                collectorCat.Cat_walk();
                cell[collectorCat.getX()][collectorCat.getY()-1].AddAnimal("collectorCat");
                if (cell[collectorCat.getX()-1][collectorCat.getY()-1].getProducts().size()>0){
                    int mm = collectorCat.getX();
                    int nn = collectorCat.getY();
                    for (Bread bread : breads){
                        if (bread.isInMap()&&bread.getX()==mm&&bread.getY()==nn){
                            bread.setInMap(false);
                            bread.setInWerehouse(true);
                            warehouse.Add("Bread",Variable_Reading.getInstance().item_capacity("Bread"));
                        }
                    }
                    for (BuffaloMilk buffaloMilk : buffaloMilks){
                        if (buffaloMilk.isInMap()&&buffaloMilk.getX()==mm&&buffaloMilk.getY()==nn){
                            buffaloMilk.setInMap(false);
                            buffaloMilk.setInWerehouse(true);
                            warehouse.Add("BuffaloMilk",Variable_Reading.getInstance().item_capacity("BuffaloMilk"));
                        }
                    }
                    for (Egg egg : eggs){
                        if (egg.isInMap()&&egg.getX()==mm&&egg.getY()==nn){
                            egg.setInMap(false);
                            egg.setInWerehouse(true);
                            warehouse.Add("Egg",Variable_Reading.getInstance().item_capacity("Egg"));
                        }
                    }
                    for (Flour flour : flours){
                        if (flour.isInMap()&&flour.getX()==mm&&flour.getY()==nn){
                            flour.setInMap(false);
                            flour.setInWerehouse(true);
                            warehouse.Add("Flour",Variable_Reading.getInstance().item_capacity("Flour"));
                        }
                    }
                    for (Icecream icecream : icecreams){
                        if (icecream.isInMap()&&icecream.getX()==mm&&icecream.getY()==nn){
                            icecream.setInMap(false);
                            icecream.setInWerehouse(true);
                            warehouse.Add("Icecream",Variable_Reading.getInstance().item_capacity("Icecream"));
                        }
                    }
                    for (PocketMilk pocketMilk : pocketMilks){
                        if (pocketMilk.isInMap()&&pocketMilk.getX()==mm&&pocketMilk.getY()==nn){
                            pocketMilk.setInMap(false);
                            pocketMilk.setInWerehouse(true);
                            warehouse.Add("PocketMilk",Variable_Reading.getInstance().item_capacity("PocketMilk"));
                        }
                    }
                    for (Shirt shirt : shirts){
                        if (shirt.isInMap()&&shirt.getX()==mm&&shirt.getY()==nn){
                            shirt.setInMap(false);
                            shirt.setInWerehouse(true);
                            warehouse.Add("Shirt",Variable_Reading.getInstance().item_capacity("Shirt"));
                        }
                    }
                    for (Textile textile : textiles){
                        if (textile.isInMap()&&textile.getX()==mm&&textile.getY()==nn){
                            textile.setInMap(false);
                            textile.setInWerehouse(true);
                            warehouse.Add("Textile",Variable_Reading.getInstance().item_capacity("Textile"));
                        }
                    }
                    for (TurkeyFeather turkeyFeather : turkeyFeathers){
                        if (turkeyFeather.isInMap()&&turkeyFeather.getX()==mm&&turkeyFeather.getY()==nn){
                            turkeyFeather.setInMap(false);
                            turkeyFeather.setInWerehouse(true);
                            warehouse.Add("TurkeyFeather",Variable_Reading.getInstance().item_capacity("TurkeyFeather"));
                        }
                    }
                    cell[collectorCat.getX()-1][collectorCat.getY()-1].getProducts().clear();
                }
            }

            for (HunterDog hunterDog : hunterDogs){
                cell[hunterDog.getX()-1][hunterDog.getY()-1].RemoveAnimal("hunterDog");
                hunterDog.Cat_walk();
                cell[hunterDog.getX()-1][hunterDog.getY()-1].AddAnimal("hunterDog");
                boolean deed = false;
                if (!deed){
                    for (Bear bear : bears){
                        if (bear.getX() == hunterDog.getX() && bear.getY() == hunterDog.getY() && !deed && bear.isActivation()){
                            cell[hunterDog.getX()-1][hunterDog.getY()-1].RemoveAnimal("hunterDog");
                            cell[bear.getX()-1][bear.getY()-1].RemoveAnimal("bear");
                            hunterDogs.remove(hunterDog);
                            bears.remove(bear);
                            deed = true;
                        }
                    }
                }
                if (!deed){
                    for (Lion lion : lions){
                        if (lion.getX() == hunterDog.getX() && lion.getY() == hunterDog.getY() && !deed && lion.isActivation()){
                            cell[hunterDog.getX()-1][hunterDog.getY()-1].RemoveAnimal("hunterDog");
                            cell[lion.getX()-1][lion.getY()-1].RemoveAnimal("lion");
                            hunterDogs.remove(hunterDog);
                            lions.remove(lion);
                            deed = true;
                        }
                    }
                }
                if (!deed){
                    for (Tiger tiger : tigers){
                        if (tiger.getX() == hunterDog.getX() && tiger.getY() == hunterDog.getY() && !deed && tiger.isActivation()){
                            cell[hunterDog.getX()-1][hunterDog.getY()-1].RemoveAnimal("hunterDog");
                            cell[tiger.getX()-1][tiger.getY()-1].RemoveAnimal("tiger");
                            hunterDogs.remove(hunterDog);
                            tigers.remove(tiger);
                            deed = true;
                        }
                    }
                }
            }

            if (missions.get(current_level-1).getBear_add_time().contains(missions.get(current_level-1).getTime_passed_in_this_level())){
                Add_wild_animal("bear");
            }

            if (missions.get(current_level-1).getLion_add_time().contains(missions.get(current_level-1).getTime_passed_in_this_level())){
                Add_wild_animal("lion");
            }

            if (missions.get(current_level-1).getTiger_add_time().contains(missions.get(current_level-1).getTime_passed_in_this_level())){
                Add_wild_animal("tiger");
            }
        }
        return true;
    }

    public void Add_wild_animal(String name){
        if (name.equalsIgnoreCase("bear")){
            Bear bear = new Bear();
            bears.add(bear);
            cell[bear.getX()-1][bear.getY()].AddAnimal("bear");
        }
        else if (name.equalsIgnoreCase("tiger")){
            Tiger tiger = new Tiger();
            tigers.add(tiger);
            cell[tiger.getX()-1][tiger.getY()].AddAnimal("tiger");
        }
        else if (name.equalsIgnoreCase("lion")){
            Lion lion = new Lion();
            lions.add(lion);
            cell[lion.getX()-1][lion.getY()].AddAnimal("lion");
        }
    }

    public int SELLING_PROFIT(){
        int sum = 0;
        for (int i=0;i<truck.getInTruck().size();i++)
            sum+=Variable_Reading.getInstance().item_price(truck.getInTruck().get(i).split("\\s")[0]);
        for (String name : truck.getInTruck()){
            if (name.equalsIgnoreCase("Bread")){
                for (Bread bread : breads){
                    if (bread.isTransporting()){
                        bread.setDone(true);
                        break;
                    }
                }
            }
            else if (name.equalsIgnoreCase("BuffaloMilk")){
                for (BuffaloMilk buffaloMilk : buffaloMilks){
                    if (buffaloMilk.isTransporting()){
                        buffaloMilk.setDone(true);
                        break;
                    }
                }
            }
            else if (name.equalsIgnoreCase("Egg")){
                for (Egg egg : eggs){
                    if (egg.isTransporting()){
                        egg.setDone(true);
                        break;
                    }
                }
            }
            else if (name.equalsIgnoreCase("Flour")){
                for (Flour flour : flours){
                    if (flour.isTransporting()){
                        flour.setDone(true);
                        break;
                    }
                }
            }
            else if (name.equalsIgnoreCase("Icecream")){
                for (Icecream icecream : icecreams){
                    if (icecream.isTransporting()){
                        icecream.setDone(true);
                        break;
                    }
                }
            }
            else if (name.equalsIgnoreCase("PocketMilk")){
                for (PocketMilk pocketMilk : pocketMilks){
                    if (pocketMilk.isTransporting()){
                        pocketMilk.setDone(true);
                        break;
                    }
                }
            }
            else if (name.equalsIgnoreCase("Shirt")){
                for (Shirt shirt : shirts){
                    if (shirt.isTransporting()){
                        shirt.setDone(true);
                        break;
                    }
                }
            }
            else if (name.equalsIgnoreCase("Textile")){
                for (Textile textile : textiles){
                    if (textile.isTransporting()){
                        textile.setDone(true);
                        break;
                    }
                }
            }
            else if (name.equalsIgnoreCase("TurkeyFeather")){
                for (TurkeyFeather turkeyFeather : turkeyFeathers){
                    if (turkeyFeather.isTransporting()){
                        turkeyFeather.setDone(true);
                        break;
                    }
                }
            }
        }
        truck.clear();
        return sum;
    }

    public static void setInstance(Main_Manager instance) {
        Main_Manager.instance = instance;
    }

    public User getCURRENT_USER() {
        return CURRENT_USER;
    }

    public void setCURRENT_USER(User CURRENT_USER) {
        this.CURRENT_USER = CURRENT_USER;
        Load_Data();
    }

    public void Load_Data(){
        //TODO
    }

    public Cell[][] getCell() {
        return cell;
    }

    public void setCell(Cell[][] cell) {
        this.cell = cell;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public Bucket_of_Water getBucket_of_water() {
        return bucket_of_water;
    }

    public void setBucket_of_water(Bucket_of_Water bucket_of_water) {
        this.bucket_of_water = bucket_of_water;
    }

    public WateringSystem getWateringSystem() {
        return wateringSystem;
    }

    public void setWateringSystem(WateringSystem wateringSystem) {
        this.wateringSystem = wateringSystem;
    }

    public Truck getTruck() {
        return truck;
    }

    public void setTruck(Truck truck) {
        this.truck = truck;
    }

    public ArrayList<ArrayList> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<ArrayList> animals) {
        this.animals = animals;
    }

    public ArrayList<ArrayList> getWorkshops() {
        return workshops;
    }

    public void setWorkshops(ArrayList<ArrayList> workshops) {
        this.workshops = workshops;
    }

    public ArrayList<ArrayList> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<ArrayList> products) {
        this.products = products;
    }

    public ArrayList<Mission> getMissions() {
        return missions;
    }

    public void setMissions(ArrayList<Mission> missions) {
        this.missions = missions;
    }

    public ArrayList<Bear> getBears() {
        return bears;
    }

    public void setBears(ArrayList<Bear> bears) {
        this.bears = bears;
    }

    public ArrayList<Buffalo> getBuffalos() {
        return buffalos;
    }

    public void setBuffalos(ArrayList<Buffalo> buffalos) {
        this.buffalos = buffalos;
    }

    public ArrayList<Chicken> getChickens() {
        return chickens;
    }

    public void setChickens(ArrayList<Chicken> chickens) {
        this.chickens = chickens;
    }

    public ArrayList<CollectorCat> getCollectorCats() {
        return collectorCats;
    }

    public void setCollectorCats(ArrayList<CollectorCat> collectorCats) {
        this.collectorCats = collectorCats;
    }

    public ArrayList<HunterDog> getHunterDogs() {
        return hunterDogs;
    }

    public void setHunterDogs(ArrayList<HunterDog> hunterDogs) {
        this.hunterDogs = hunterDogs;
    }

    public ArrayList<Lion> getLions() {
        return lions;
    }

    public void setLions(ArrayList<Lion> lions) {
        this.lions = lions;
    }

    public ArrayList<Ostrich> getOstriches() {
        return ostriches;
    }

    public void setOstriches(ArrayList<Ostrich> ostriches) {
        this.ostriches = ostriches;
    }

    public ArrayList<Tiger> getTigers() {
        return tigers;
    }

    public void setTigers(ArrayList<Tiger> tigers) {
        this.tigers = tigers;
    }

    public ArrayList<Bread> getBreads() {
        return breads;
    }

    public void setBreads(ArrayList<Bread> breads) {
        this.breads = breads;
    }

    public ArrayList<BuffaloMilk> getBuffaloMilks() {
        return buffaloMilks;
    }

    public void setBuffaloMilks(ArrayList<BuffaloMilk> buffaloMilks) {
        this.buffaloMilks = buffaloMilks;
    }

    public ArrayList<Egg> getEggs() {
        return eggs;
    }

    public void setEggs(ArrayList<Egg> eggs) {
        this.eggs = eggs;
    }

    public ArrayList<Flour> getFlours() {
        return flours;
    }

    public void setFlours(ArrayList<Flour> flours) {
        this.flours = flours;
    }

    public ArrayList<Icecream> getIcecreams() {
        return icecreams;
    }

    public void setIcecreams(ArrayList<Icecream> icecreams) {
        this.icecreams = icecreams;
    }

    public ArrayList<PocketMilk> getPocketMilks() {
        return pocketMilks;
    }

    public void setPocketMilks(ArrayList<PocketMilk> pocketMilks) {
        this.pocketMilks = pocketMilks;
    }

    public ArrayList<TurkeyFeather> getTurkeyFeathers() {
        return turkeyFeathers;
    }

    public void setTurkeyFeathers(ArrayList<TurkeyFeather> turkeyFeathers) {
        this.turkeyFeathers = turkeyFeathers;
    }

    public ArrayList<Shirt> getShirts() {
        return shirts;
    }

    public void setShirts(ArrayList<Shirt> shirts) {
        this.shirts = shirts;
    }

    public ArrayList<Textile> getTextiles() {
        return textiles;
    }

    public void setTextiles(ArrayList<Textile> textiles) {
        this.textiles = textiles;
    }

    public ArrayList<PrimaryWorksop_MilkPacking> getPrimaryWorkshop_milkPackings() {
        return primaryWorkshop_milkPackings;
    }

    public void setPrimaryWorkshop_milkPackings(ArrayList<PrimaryWorksop_MilkPacking> primaryWorkshop_milkPackings) {
        this.primaryWorkshop_milkPackings = primaryWorkshop_milkPackings;
    }

    public ArrayList<PrimaryWorksop_Mill> getPrimaryWorkshop_mills() {
        return primaryWorkshop_mills;
    }

    public void setPrimaryWorkshop_mills(ArrayList<PrimaryWorksop_Mill> primaryWorkshop_mills) {
        this.primaryWorkshop_mills = primaryWorkshop_mills;
    }

    public ArrayList<PrimaryWorksop_Textile> getPrimaryWorkshop_textiles() {
        return primaryWorkshop_textiles;
    }

    public void setPrimaryWorkshop_textiles(ArrayList<PrimaryWorksop_Textile> primaryWorkshop_textiles) {
        this.primaryWorkshop_textiles = primaryWorkshop_textiles;
    }

    public ArrayList<SecondaryWorkshop_Bakery> getSecondaryWorkshop_bakeries() {
        return secondaryWorkshop_bakeries;
    }

    public void setSecondaryWorkshop_bakeries(ArrayList<SecondaryWorkshop_Bakery> secondaryWorkshop_bakeries) {
        this.secondaryWorkshop_bakeries = secondaryWorkshop_bakeries;
    }

    public ArrayList<SecondaryWorkshop_IcecreamShop> getSecondaryWorkshop_icecreamShops() {
        return secondaryWorkshop_icecreamShops;
    }

    public void setSecondaryWorkshop_icecreamShops(ArrayList<SecondaryWorkshop_IcecreamShop> secondaryWorkshop_icecreamShops) {
        this.secondaryWorkshop_icecreamShops = secondaryWorkshop_icecreamShops;
    }

    public ArrayList<SecondaryWorkshop_Tailoring> getSecondaryWorkshop_tailorings() {
        return secondaryWorkshop_tailorings;
    }

    public void setSecondaryWorkshop_tailorings(ArrayList<SecondaryWorkshop_Tailoring> secondaryWorkshop_tailorings) {
        this.secondaryWorkshop_tailorings = secondaryWorkshop_tailorings;
    }

    public boolean isFilling_well() {
        return filling_well;
    }

    public void setFilling_well(boolean filling_well) {
        this.filling_well = filling_well;
    }

    public boolean isAdd_egg() {
        return add_egg;
    }

    public void setAdd_egg(boolean add_egg) {
        this.add_egg = add_egg;
    }

    public boolean isAdd_turkeyfeather() {
        return add_turkeyfeather;
    }

    public void setAdd_turkeyfeather(boolean add_turkeyfeather) {
        this.add_turkeyfeather = add_turkeyfeather;
    }

    public boolean isAdd_buffalomilk() {
        return add_buffalomilk;
    }

    public void setAdd_buffalomilk(boolean add_buffalomilk) {
        this.add_buffalomilk = add_buffalomilk;
    }

    public boolean isMill_work() {
        return mill_work;
    }

    public void setMill_work(boolean mill_work) {
        this.mill_work = mill_work;
    }

    public boolean isTextile_work() {
        return textile_work;
    }

    public void setTextile_work(boolean textile_work) {
        this.textile_work = textile_work;
    }

    public boolean isMilkpacking_work() {
        return milkpacking_work;
    }

    public void setMilkpacking_work(boolean milkpacking_work) {
        this.milkpacking_work = milkpacking_work;
    }

    public boolean isBakery_work() {
        return bakery_work;
    }

    public void setBakery_work(boolean bakery_work) {
        this.bakery_work = bakery_work;
    }

    public boolean isTailoring_work() {
        return tailoring_work;
    }

    public void setTailoring_work(boolean tailoring_work) {
        this.tailoring_work = tailoring_work;
    }

    public boolean isIcecreamshop_work() {
        return icecreamshop_work;
    }

    public void setIcecreamshop_work(boolean icecreamshop_work) {
        this.icecreamshop_work = icecreamshop_work;
    }

    public boolean isTruck_working() {
        return truck_working;
    }

    public void setTruck_working(boolean truck_working) {
        this.truck_working = truck_working;
    }

    public int getFilling_well_MAX() {
        return filling_well_MAX;
    }

    public void setFilling_well_MAX(int filling_well_MAX) {
        this.filling_well_MAX = filling_well_MAX;
    }

    public int getAdd_egg_MAX() {
        return add_egg_MAX;
    }

    public void setAdd_egg_MAX(int add_egg_MAX) {
        this.add_egg_MAX = add_egg_MAX;
    }

    public int getAdd_turkeyfeather_MAX() {
        return add_turkeyfeather_MAX;
    }

    public void setAdd_turkeyfeather_MAX(int add_turkeyfeather_MAX) {
        this.add_turkeyfeather_MAX = add_turkeyfeather_MAX;
    }

    public int getAdd_buffalomilk_MAX() {
        return add_buffalomilk_MAX;
    }

    public void setAdd_buffalomilk_MAX(int add_buffalomilk_MAX) {
        this.add_buffalomilk_MAX = add_buffalomilk_MAX;
    }

    public int getMill_work_MAX() {
        return mill_work_MAX;
    }

    public void setMill_work_MAX(int mill_work_MAX) {
        this.mill_work_MAX = mill_work_MAX;
    }

    public int getTextile_work_MAX() {
        return textile_work_MAX;
    }

    public void setTextile_work_MAX(int textile_work_MAX) {
        this.textile_work_MAX = textile_work_MAX;
    }

    public int getMilkpacking_work_MAX() {
        return milkpacking_work_MAX;
    }

    public void setMilkpacking_work_MAX(int milkpacking_work_MAX) {
        this.milkpacking_work_MAX = milkpacking_work_MAX;
    }

    public int getBakery_work_MAX() {
        return bakery_work_MAX;
    }

    public void setBakery_work_MAX(int bakery_work_MAX) {
        this.bakery_work_MAX = bakery_work_MAX;
    }

    public int getTailoring_work_MAX() {
        return tailoring_work_MAX;
    }

    public void setTailoring_work_MAX(int tailoring_work_MAX) {
        this.tailoring_work_MAX = tailoring_work_MAX;
    }

    public int getIcecreamshop_work_MAX() {
        return icecreamshop_work_MAX;
    }

    public void setIcecreamshop_work_MAX(int icecreamshop_work_MAX) {
        this.icecreamshop_work_MAX = icecreamshop_work_MAX;
    }

    public int getTruck_working_MAX() {
        return truck_working_MAX;
    }

    public void setTruck_working_MAX(int truck_working_MAX) {
        this.truck_working_MAX = truck_working_MAX;
    }

    public int getFilling_well_CURRENT() {
        return filling_well_CURRENT;
    }

    public void setFilling_well_CURRENT(int filling_well_CURRENT) {
        this.filling_well_CURRENT = filling_well_CURRENT;
    }

    public int getAdd_egg_CURRENT() {
        return add_egg_CURRENT;
    }

    public void setAdd_egg_CURRENT(int add_egg_CURRENT) {
        this.add_egg_CURRENT = add_egg_CURRENT;
    }

    public int getAdd_turkeyfeather_CURRENT() {
        return add_turkeyfeather_CURRENT;
    }

    public void setAdd_turkeyfeather_CURRENT(int add_turkeyfeather_CURRENT) {
        this.add_turkeyfeather_CURRENT = add_turkeyfeather_CURRENT;
    }

    public int getAdd_buffalomilk_CURRENT() {
        return add_buffalomilk_CURRENT;
    }

    public void setAdd_buffalomilk_CURRENT(int add_buffalomilk_CURRENT) {
        this.add_buffalomilk_CURRENT = add_buffalomilk_CURRENT;
    }

    public int getMill_work_CURRENT() {
        return mill_work_CURRENT;
    }

    public void setMill_work_CURRENT(int mill_work_CURRENT) {
        this.mill_work_CURRENT = mill_work_CURRENT;
    }

    public int getTextile_work_CURRENT() {
        return textile_work_CURRENT;
    }

    public void setTextile_work_CURRENT(int textile_work_CURRENT) {
        this.textile_work_CURRENT = textile_work_CURRENT;
    }

    public int getMilkpacking_work_CURRENT() {
        return milkpacking_work_CURRENT;
    }

    public void setMilkpacking_work_CURRENT(int milkpacking_work_CURRENT) {
        this.milkpacking_work_CURRENT = milkpacking_work_CURRENT;
    }

    public int getBakery_work_CURRENT() {
        return bakery_work_CURRENT;
    }

    public void setBakery_work_CURRENT(int bakery_work_CURRENT) {
        this.bakery_work_CURRENT = bakery_work_CURRENT;
    }

    public int getTailoring_work_CURRENT() {
        return tailoring_work_CURRENT;
    }

    public void setTailoring_work_CURRENT(int tailoring_work_CURRENT) {
        this.tailoring_work_CURRENT = tailoring_work_CURRENT;
    }

    public int getIcecreamshop_work_CURRENT() {
        return icecreamshop_work_CURRENT;
    }

    public void setIcecreamshop_work_CURRENT(int icecreamshop_work_CURRENT) {
        this.icecreamshop_work_CURRENT = icecreamshop_work_CURRENT;
    }

    public int getTruck_working_CURRENT() {
        return truck_working_CURRENT;
    }

    public void setTruck_working_CURRENT(int truck_working_CURRENT) {
        this.truck_working_CURRENT = truck_working_CURRENT;
    }

    public int getCurrent_level() {
        return current_level;
    }

    public void setCurrent_level(int current_level) {
        this.current_level = current_level;
    }
}
