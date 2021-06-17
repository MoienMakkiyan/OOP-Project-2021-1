package Functions;

import Objects.*;
import Objects.Animal.Animal;
import Objects.Animal.Wild;
import Objects.Products.*;
import Objects.WorkShops.*;

import java.util.ArrayList;

public class Main_Manager {

    Variable_Reading variable_reading;
    public Main_Manager(int []a ,Variable_Reading variable_reading) {
        make_map(a[0],a[1]);
        this.variable_reading = variable_reading;
    }

    ArrayList<Animal> animals = new ArrayList<>();


    public void Add_Animal(String name){
        if (animals.add(new Animal(name))){
            //TODO
        }
        else {
            //TODO
        }
    }

    private ArrayList<ArrayList> workshops = new ArrayList<>();

    ArrayList<PrimaryWorksop_MilkPacking>  primaryWorkshop_milkPackings = new ArrayList<>();
    ArrayList<PrimaryWorksop_Mill> primaryWorkshop_mills = new ArrayList<>();
    ArrayList<PrimaryWorksop_Textile> primaryWorkshop_textiles = new ArrayList<>();
    ArrayList<SecondaryWorkshop_Bakery> secondaryWorkshop_bakeries = new ArrayList<>();
    ArrayList<SecondaryWorkshop_IcecreamShop> secondaryWorkshop_icecreamShops = new ArrayList<>();
    ArrayList<SecondaryWorkshop_Tailoring> secondaryWorkshop_tailorings = new ArrayList<>();

    public void Add_WorkShop(String name){

        workshops.add(primaryWorkshop_milkPackings);
        workshops.add(primaryWorkshop_mills);
        workshops.add(primaryWorkshop_textiles);
        workshops.add(secondaryWorkshop_bakeries);
        workshops.add(secondaryWorkshop_icecreamShops);
        workshops.add(secondaryWorkshop_tailorings);

        if (name.equalsIgnoreCase("MilkPacking")){
            if (primaryWorkshop_milkPackings.add(new PrimaryWorksop_MilkPacking())){
                //TODO
            }
            else {
                //TODO
            }
        }
        else if (name.equalsIgnoreCase("Mill")){
            if (primaryWorkshop_mills.add(new PrimaryWorksop_Mill())){
                //TODO
            }
            else {
                //TODO
            }
        }
        else if (name.equalsIgnoreCase("Textile")){
            if (primaryWorkshop_textiles.add(new PrimaryWorksop_Textile())){
                //TODO
            }
            else {
                //TODO
            }
        }
        else if (name.equalsIgnoreCase("Bakery")){
            if (secondaryWorkshop_bakeries.add(new SecondaryWorkshop_Bakery())){
                //TODO
            }
            else {
                //TODO
            }
        }
        else if (name.equalsIgnoreCase("IcecreamShop")){
            if (secondaryWorkshop_icecreamShops.add(new SecondaryWorkshop_IcecreamShop())){
                //TODO
            }
            else {
                //TODO
            }
        }
        else if (name.equalsIgnoreCase("Tailoring")){
            if (secondaryWorkshop_tailorings.add(new SecondaryWorkshop_Tailoring())){
                //TODO
            }
            else {
                //TODO
            }
        }
    }

    Truck truck = new Truck();
    public boolean Truck_Load(String name){
        return truck.Load(name);
    }
    public boolean Truck_Unload(String name){
        return truck.Unload(name);
    }
    public boolean Truck_Go(){
        return truck.Go();
    }

    public boolean inWerehouse(String name){
        //TODO
        return false;
    }

    Cell cell[][];
    private void make_map(int n, int m){
        cell = new Cell[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                cell[i][j] = new Cell(i+1,j+1);
            }
        }
    }

    Bucket_of_Water bucket_of_water = new Bucket_of_Water(variable_reading.Well_info());
    WateringSystem wateringSystem = new WateringSystem(variable_reading.Well_Time(),bucket_of_water);
    public boolean AddGrass(int x, int y){
        if (bucket_of_water.getCerrunt_amount()>0){
            cell[x][y].addGrass();
            wateringSystem.reduceWater();
            //TODO
            return true;
        }
        else {
            //TODO
            return false;
        }
    }

    public boolean Well(){
        if (wateringSystem.isEmpty()){
            wateringSystem.fillWell();
            return true;
        }
        else return false;
    }

    Warehouse warehouse = new Warehouse(variable_reading.warehouse_info());
    public boolean add_to_warehouse(int x, int y){
        String product = cell[x][y].takeProduct();
        if (!product.equals("")){

            warehouse.Add(product,variable_reading.item_capacity(product));
            //TODO
            return true;
        }
        else {
            //TODO
            return false;
        }
    }

    //private void Add



    public boolean Cage (int x , int y ) {
        if (animals.size() != 0) {
            for (int i = 0; i < animals.size(); i++) {
                if (animals.get(i).getX() == x) {
                    if (animals.get(i).getY() == y) {
                        if (animals.get(i).isActivation()==true)
                            if (animals.get(i) instanceof Wild){
//                                animals.get(i).cage();
//                                animals.get(i).setActivation(false);//TODO
                            }
                    }
                }
            }
        }
        return true;
    }
    //MilkPacking Mill Textile Bakery IcecreamShop Tailoring;

    ArrayList<Bread> breads = new ArrayList<>();
    ArrayList<BuffaloMilk> buffaloMilks = new ArrayList<>();
    ArrayList<Egg> eggs = new ArrayList<>();
    ArrayList<Flour> flours = new ArrayList<>();
    ArrayList<Icecream> icecreams = new ArrayList<>();
    ArrayList<PocketMilk> pocketMilks = new ArrayList<>();
    ArrayList<TurkeyFeather> turkeyFeathers = new ArrayList<>();
    ArrayList<Shirt> shirts = new ArrayList<>();
    ArrayList<Textile> textiles = new ArrayList<>();

    public boolean MilkPacking_Work(){
        if (is_sth_in_WereHouse("BuffaloMilk")){

            //TODO
            return true;
        }
        else {
            //TODO
            return false;
        }
    }

    public boolean Mill_Work(){
        if (is_sth_in_WereHouse("Egg")){

            //TODO
            return true;
        }
        else {
            //TODO
            return false;
        }
    }

    public boolean Textile_Work(){
        if (is_sth_in_WereHouse("TurkeyFeather")){

            //TODO
            return true;
        }
        else {
            //TODO
            return false;
        }
    }

    public boolean Bakery_Work(){
        if (is_sth_in_WereHouse("Flour")){

            //TODO
            return true;
        }
        else {
            //TODO
            return false;
        }
    }

    public boolean IcecreamShop_Work(){
        if (is_sth_in_WereHouse("PocketMilk")){

            //TODO
            return true;
        }
        else {
            //TODO
            return false;
        }
    }

    public boolean Tailoring_Work(){
        if (is_sth_in_WereHouse("Textile")){

            //TODO
            return true;
        }
        else {
            //TODO
            return false;
        }
    }

    private boolean is_sth_in_WereHouse(String name){
        if (warehouse.haveSTH(name)){
            //TODO
            return true;
        }
        else {
            //TODO
            return false;
        }
    }

    private void Add_Primary_Products(int x, int y,String animal){
        if (animal.equalsIgnoreCase("chicken")){
            eggs.add(new Egg(x,y));
            cell[eggs.get(eggs.size()-1).getX()-1][eggs.get(eggs.size()-1).getY()-1].AddProduct("egg",eggs.size());
        } else if (animal.equalsIgnoreCase("Buffalo")){
            buffaloMilks.add(new BuffaloMilk(x,y));
            cell[buffaloMilks.get(buffaloMilks.size()-1).getX()-1][buffaloMilks.get(buffaloMilks.size()-1).getY()-1].AddProduct("buffaloMilk",eggs.size());
        } else if (animal.equalsIgnoreCase("Ostrich")){
            turkeyFeathers.add(new TurkeyFeather(x,y));
            cell[turkeyFeathers.get(turkeyFeathers.size()-1).getX()-1][turkeyFeathers.get(turkeyFeathers.size()-1).getY()-1].AddProduct("turkeyFeather",eggs.size());
        } else {
            //TODO
        }
    }











    private int turn;
    public void changeTurn(){
        this.turn++;
    }
}
