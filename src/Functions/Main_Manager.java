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

    User CURRENT_USER;

    private Cell cell[][];
    private Warehouse warehouse;
    private Bucket_of_Water bucket_of_water;
    private WateringSystem wateringSystem;
    private Truck truck;
    private int currunt_level;

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

    public Variable_Reading getVariable_reading() {
        return variable_reading;
    }

    public void setVariable_reading(Variable_Reading variable_reading) {
        this.variable_reading = variable_reading;
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

    public int getCurrunt_level() {
        return currunt_level;
    }

    public void setCurrunt_level(int currunt_level) {
        this.currunt_level = currunt_level;
    }
}
