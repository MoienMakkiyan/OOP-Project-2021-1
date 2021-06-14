package Functions;

import Objects.Animal.Animal;
import Objects.Products.Product;
import Objects.WateringSystem;
import Objects.WorkShops.*;

import java.util.ArrayList;

public class Main_Manager {

    ArrayList<Product> products = new ArrayList<>();

    ArrayList<Animal> animals = new ArrayList<>();
    public void Add_Animal(String name){
        if (animals.add(new Animal(name))){
            //TODO
        }
        else {
            //TODO
        }
    }

    ArrayList<ArrayList> workshops = new ArrayList<>();
    public void Add_WorkShop(String name){

        ArrayList<PrimaryWorksop_MilkPacking>  primaryWorksop_milkPackings = new ArrayList<>();
        ArrayList<PrimaryWorksop_Mill> primaryWorksop_mills = new ArrayList<>();
        ArrayList<PrimaryWorksop_Textile> primaryWorksop_textiles = new ArrayList<>();
        ArrayList<SecondaryWorkshop_Bakery> secondaryWorkshop_bakeries = new ArrayList<>();
        ArrayList<SecondaryWorkshop_IcecreamShop> secondaryWorkshop_icecreamShops = new ArrayList<>();
        ArrayList<SecondaryWorkshop_Tailoring> secondaryWorkshop_tailorings = new ArrayList<>();

        workshops.add(primaryWorksop_milkPackings);
        workshops.add(primaryWorksop_mills);
        workshops.add(primaryWorksop_textiles);
        workshops.add(secondaryWorkshop_bakeries);
        workshops.add(secondaryWorkshop_icecreamShops);
        workshops.add(secondaryWorkshop_tailorings);

        if (name.equalsIgnoreCase("MilkPacking")){
            if (primaryWorksop_milkPackings.add(new PrimaryWorksop_MilkPacking())){
                //TODO
            }
            else {
                //TODO
            }
        }
        else if (name.equalsIgnoreCase("Mill")){
            if (primaryWorksop_mills.add(new PrimaryWorksop_Mill())){
                //TODO
            }
            else {
                //TODO
            }
        }
        else if (name.equalsIgnoreCase("Textile")){
            if (primaryWorksop_textiles.add(new PrimaryWorksop_Textile())){
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

    WateringSystem wateringSystem = new WateringSystem();
    public void Well(){
        wateringSystem.fillWell();
    }
}
