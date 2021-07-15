package Functions;

import Objects.Logger;
import Objects.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Input {

    private static Input instance = null;

    private Input(){
    }

    /*public Input(GAME_ORDERS game_orders, Logger logger, Variable_Reading variable_reading,ArrayList<User> users) {
        this.game_orders = game_orders;
        this.logger = logger;
        this.variable_reading = variable_reading;
        this.users = users;
    }*/

    public void run(){
        Scanner scanner = new Scanner(System.in);
        int EXIT = -1;
        while (EXIT != 0){
            EXIT = start_menu(scanner);
            if (EXIT != 0){
                EXIT = second_menu(scanner);
            }
        }
    }

    public int start_menu(Scanner scanner){
        boolean LOGGING = false;
        int End = -1;
        while (!LOGGING){
            System.out.println("1- LOG IN");
            System.out.println("2- SIGN UP");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("LOG IN")||input.equalsIgnoreCase("1")){
                LOGGING = LogIN(scanner);
            }
            else if (input.equalsIgnoreCase("SIGN UP")||input.equalsIgnoreCase("2")){
                try {
                    LOGGING = SignUP(scanner);
                    LOGGING = false;
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
            else if (input.equalsIgnoreCase("Exit")){
                End = 0;
            }
        }
        return End;
    }

    public boolean LogIN(Scanner scanner){
        boolean pass = false;
        System.out.print("Please Enter Your USERNAME : ");
        String username = scanner.nextLine();
        if (backUserINDEX(username)!=-1){
            Logger.getInstance().setLogger(Variable_Reading.getInstance().getUsers().get(backUserINDEX(username)));
            Logger.getInstance().getLogger().info("This Username Entered.");
            System.out.print("Please Enter Your PASSWORD : ");
            String password = scanner.nextLine();
            if (password.equalsIgnoreCase(Variable_Reading.getInstance().getUsers().get(backUserINDEX(username)).getPassword())){
                System.out.println("PASSWORD ACCEPTED ...");
                Main_Manager.getInstance().setCURRENT_USER(Variable_Reading.getInstance().getUsers().get(backUserINDEX(username)));
                pass = true;
                Logger.getInstance().getLogger().info("Password Accepted & Its Logged in.");
            }
            else {
                Logger.getInstance().getLogger().warning("Wrong Password !");
                System.out.println("Wrong PASSWORD please try again ...");
            }
        }
        else {
            System.out.println("This USERNAME have not found please try again...");
        }
        return pass;
    }

    public boolean SignUP(Scanner scanner) throws FileNotFoundException {
        boolean pass = false;
        System.out.print("Please Enter Your USERNAME : ");
        String username = scanner.nextLine();
        if (backUserINDEX(username)==-1){
            System.out.print("Please Enter Your PASSWORD : ");
            String password = scanner.nextLine();
            Variable_Reading.getInstance().getUsers().add(new User(username, password));
            newUser(username);
            System.out.println("Added ...");
            try {
                Variable_Reading.getInstance().save();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                Variable_Reading.getInstance().save();
            } catch (IOException e) {
                e.printStackTrace();
            }
            pass = true;
        }
        else {
            System.out.println("This USERNAME exist, Please try again ...");
        }
        return pass;
    }

    public int backUserINDEX(String name){
        int a=-1;
        for (int i=0;i<Variable_Reading.getInstance().getUsers().size();i++){
            if (name.equalsIgnoreCase(Variable_Reading.getInstance().getUsers().get(i).getName())){
                a=i;
                break;
            }
        }
        return a;
    }

    public int second_menu(Scanner scanner){
        int end = -1;
        while (end == -1){
            System.out.println("1) START [level]");
            System.out.println("2) LOG OUT");
            System.out.println("3) SETTING");
            System.out.print("Enter Your Command : ");
            String input = scanner.nextLine();
            if (input.toLowerCase().startsWith("start")){
                if (check_level(Integer.parseInt(input.split("\\s")[1]))){
                    Game_Orders(scanner,Integer.parseInt(input.split("\\s")[1]));
                }
                else System.out.println("You can't reach this level !");
            }
            else if (input.equalsIgnoreCase("log out")){
                Logger.getInstance().getLogger().info("Logged out.");
                end = 1;
            }
            else if (input.equalsIgnoreCase("Exit")){
                end = 0;
            }
            else if (input.equalsIgnoreCase("setting")){
                System.out.println("Setting Method is ran !");
            }
            else {
                System.out.println("Invalid Command, Please try again ...");
            }
        }
        return end;
    }

    public boolean check_level(int n){
        if (Main_Manager.getInstance().getCURRENT_USER().getLevel()>=n)
            return true;
        else return false;
    }

    public void Game_Orders (Scanner scanner,int level) {
        GAME_ORDERS.getInstance().set_level_tasks(level,Main_Manager.getInstance().getCURRENT_USER());
        String input;
        while (!(input = scanner.nextLine()).equalsIgnoreCase("LOG OUT")){
            System.out.print("Enter your command : ");
            if (input.split("\\s")[0].equalsIgnoreCase("BUY")){
                if (GAME_ORDERS.getInstance().Buy(input.split("\\s")[1],Main_Manager.getInstance().getCURRENT_USER())){
                    Logger.getInstance().getLogger().info("Buy : "+input.split("\\s")[1]+" Bought Successfully! ");
                }
                else {
                    Logger.getInstance().getLogger().warning("Buy : "+input.split("\\s")[1]+" Unsuccessful Buying! ");
                }
            }
            if (input.split("\\s")[0].equalsIgnoreCase("Build")){
                if (GAME_ORDERS.getInstance().Build(input.split("\\s")[1],Main_Manager.getInstance().getCURRENT_USER())){
                    Logger.getInstance().getLogger().info("Build : "+input.split("\\s")[1]+" Bought Successfully! ");
                }
                else {
                    Logger.getInstance().getLogger().warning("Build : "+input.split("\\s")[1]+" Unsuccessful Buying! ");
                }
            }
            else if (input.split("\\s")[0].equalsIgnoreCase("PICKUP")){
                if (GAME_ORDERS.getInstance().Pickup(Integer.parseInt(input.split("\\s")[1]),Integer.parseInt(input.split("\\s")[2]),Main_Manager.getInstance().getCURRENT_USER())){
                    Logger.getInstance().getLogger().info("Pick Up : Picked Up Successfully!");
                }
                else {
                    Logger.getInstance().getLogger().warning("Pick Up : Unsuccessful Picking up!");
                }
            }
            else if (input.split("\\s")[0].equalsIgnoreCase("WELL")){
                if (GAME_ORDERS.getInstance().Well(Main_Manager.getInstance().getCURRENT_USER())){
                    Logger.getInstance().getLogger().info("Well : Filled Successfully! ");
                }
                else {
                    Logger.getInstance().getLogger().warning("Well : Unsuccessful Filling! ");
                }
            }
            else if (input.split("\\s")[0].equalsIgnoreCase("PLANT")){
                if (GAME_ORDERS.getInstance().Plant(Integer.parseInt(input.split("\\s")[1]),Integer.parseInt(input.split("\\s")[2]),Main_Manager.getInstance().getCURRENT_USER())){
                    Logger.getInstance().getLogger().info("Plant : Planted Successfully! ");
                }
                else {
                    Logger.getInstance().getLogger().warning("Plant : Unsuccessful Planting! ");
                }
            }
            else if (input.split("\\s")[0].equalsIgnoreCase("WORK")){
                if (GAME_ORDERS.getInstance().Work(input.split("\\s")[1],Main_Manager.getInstance().getCURRENT_USER())){
                    Logger.getInstance().getLogger().info("Work : "+input.split("\\s")[1]+" Created!");
                }
                else {
                    Logger.getInstance().getLogger().warning("Work : "+input.split("\\s")[1]+" Is Working!");
                }
            }
            else if (input.split("\\s")[0].equalsIgnoreCase("CAGE")){
                if (GAME_ORDERS.getInstance().Cage(Integer.parseInt(input.split("\\s")[1]),Integer.parseInt(input.split("\\s")[2]),Main_Manager.getInstance().getCURRENT_USER())){
                    Logger.getInstance().getLogger().info("Cage : Caged Successfully! ");
                }
                else {
                    Logger.getInstance().getLogger().warning("Cage : Unsuccessful Caging! ");
                }
            }
            else if (input.split("\\s")[0].equalsIgnoreCase("TURN")){
                if (GAME_ORDERS.getInstance().Turn(Integer.parseInt(input.split("\\s")[1]),Main_Manager.getInstance().getCURRENT_USER())){
                    Logger.getInstance().getLogger().info("Turn : "+input.split("\\s")[1]+" passed.");
                }
                else {
                    Logger.getInstance().getLogger().warning("Turn : turning failed !");
                }
            }
            else if (input.split("\\s")[0].equalsIgnoreCase("TRUCK")){
                if (input.split("\\s")[1].equalsIgnoreCase("LOAD")){
                    if (GAME_ORDERS.getInstance().Truck_Load(input.split("\\s")[2],Main_Manager.getInstance().getCURRENT_USER())){
                        Logger.getInstance().getLogger().info("Truck : Started To Load! ");
                    }
                    else {
                        Logger.getInstance().getLogger().warning("Truck : Unsuccessful Loading! ");
                    }
                }

                if (input.split("\\s")[1].equalsIgnoreCase("UNLOAD")){
                    if (GAME_ORDERS.getInstance().Truck_Unload(input.split("\\s")[2],Main_Manager.getInstance().getCURRENT_USER())){
                        Logger.getInstance().getLogger().info("Truck : Started To Unload! ");
                    }
                    else {
                        Logger.getInstance().getLogger().warning("Truck : Unsuccessful Unloading! ");
                    }
                }

                if (input.split("\\s")[1].equalsIgnoreCase("GO")){
                    if (GAME_ORDERS.getInstance().Truck_Go(Main_Manager.getInstance().getCURRENT_USER())){
                        Logger.getInstance().getLogger().info("Truck : Started To Go! ");
                    }
                    else {
                        Logger.getInstance().getLogger().warning("Truck : Unsuccessful Going! ");
                    }
                }
            }
            else {
                System.out.println("Invalid Command, Please try again ...");
                Logger.getInstance().getLogger().warning("Invalid Command Entered.");
            }
        }
        Logger.getInstance().getLogger().info("Logged out.");
    }

    private void newUser (String username){
        File folder = new File("UserData\\"+username);
        folder.mkdir();
        File user_data = new File("UserData\\"+username+"\\user_data.txt");
        File map_data = new File("UserData\\"+username+"\\map_data.txt");
        File product_data = new File("UserData\\"+username+"\\product.txt");
        File animal_data = new File("UserData\\"+username+"\\animal_data.txt");
        File log = new File("UserData\\"+username+"\\LOGGER.log");
        try {
            user_data.createNewFile();
            map_data.createNewFile();
            product_data.createNewFile();
            animal_data.createNewFile();
            log.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Input getInstance(){
        if (instance == null)
            instance = new Input();
        return instance;
    }

}