package Functions;

import Objects.Logger;
import Objects.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Input {

    GAME_ORDERS game_orders;
    ArrayList<User> users;
    User CURRENT_USER;
    Logger logger;
    Variable_Reading variable_reading;

    public Input(GAME_ORDERS game_orders, Logger logger, Variable_Reading variable_reading,ArrayList<User> users) {
        this.game_orders = game_orders;
        this.logger = logger;
        this.variable_reading = variable_reading;
        this.users = users;
    }

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
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
            else if (input.equalsIgnoreCase("Exit")){
                //TODO
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
            //TODO
            System.out.print("Please Enter Your PASSWORD : ");
            String password = scanner.nextLine();
            if (password.equalsIgnoreCase(users.get(backUserINDEX(username)).getPassword())){
                System.out.print("PASSWORD ACCEPTED ...");
                CURRENT_USER = users.get(backUserINDEX(username));
                pass = true;
            }
            else {
                //TODO
                System.out.println("Wrong PASSWORD please try again ...");
            }
        }
        else {
            //TODO
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
            users.add(new User(username, password));
            newUser(username);
            System.out.println("Added ...");
            pass = true;
        }
        else {
            //TODO
            System.out.println("This USERNAME exist, Please try again ...");
        }
        return pass;
    }

    public int backUserINDEX(String name){
        int a=-1;
        for (int i=0;i<users.size();i++){
            if (name.equalsIgnoreCase(users.get(i).getName())){
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
                Game_Orders(scanner,Integer.parseInt(input.split("\\s")[1]));
            }
            else if (input.equalsIgnoreCase("log out")){
                //TODO
                end = 1;
            }
            else if (input.equalsIgnoreCase("Exit")){
                //TODO
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

    public void Game_Orders (Scanner scanner,int level) {
        game_orders.set_level_tasks(level,CURRENT_USER);
        String input;
        while (!(input = scanner.nextLine()).equalsIgnoreCase("LOG OUT")){
            if (input.split("\\s")[0].equalsIgnoreCase("BUY")){
                if (game_orders.Buy(input.split("\\s")[1],CURRENT_USER)){
                    // TODO
                }
                else {
                    //TODO
                }
            }
            else if (input.split("\\s")[0].equalsIgnoreCase("PICKUP")){
                if (game_orders.Pickup(Integer.parseInt(input.split("\\s")[1]),Integer.parseInt(input.split("\\s")[2]),CURRENT_USER)){
                    //TODO
                }
                else {
                    //TODO
                }
            }
            else if (input.split("\\s")[0].equalsIgnoreCase("WELL")){
                if (game_orders.Well(CURRENT_USER)){
                    //TODO
                }
                else {
                    //TODO
                }
            }
            else if (input.split("\\s")[0].equalsIgnoreCase("PLANT")){
                if (game_orders.Plant(Integer.parseInt(input.split("\\s")[1]),Integer.parseInt(input.split("\\s")[2]),CURRENT_USER)){
                    //TODO
                }
                else {
                    //TODO
                }
            }
            else if (input.split("\\s")[0].equalsIgnoreCase("WORK")){
                if (game_orders.Work(input.split("\\s")[1],CURRENT_USER)){
                    //TODO
                }
                else {
                    //TODO
                }
            }
            else if (input.split("\\s")[0].equalsIgnoreCase("CAGE")){
                if (game_orders.Cage(Integer.parseInt(input.split("\\s")[1]),Integer.parseInt(input.split("\\s")[2]),CURRENT_USER)){
                    //TODO
                }
                else {
                    //TODO
                }
            }
            else if (input.split("\\s")[0].equalsIgnoreCase("TURN")){
                if (game_orders.Turn(Integer.parseInt(input.split("\\s")[1]),CURRENT_USER)){
                    //TODO
                }
                else {
                    //TODO
                }
            }
            else if (input.split("\\s")[0].equalsIgnoreCase("TRUCK")){
                if (input.split("\\s")[1].equalsIgnoreCase("LOAD")){
                    if (game_orders.Truck_Load(input.split("\\s")[2],CURRENT_USER)){
                        //TODO
                    }
                    else {
                        //TODO
                    }
                }

                if (input.split("\\s")[1].equalsIgnoreCase("UNLOAD")){
                    if (game_orders.Truck_Unload(input.split("\\s")[2],CURRENT_USER)){
                        //TODO
                    }
                    else {
                        //TODO
                    }
                }

                if (input.split("\\s")[1].equalsIgnoreCase("GO")){
                    if (game_orders.Truck_Go(CURRENT_USER)){
                        //TODO
                    }
                    else {
                        //TODO
                    }
                }
            }
            else {
                System.out.println("Invalid Command, Please try again ...");
                //TODO
            }
        }
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
}
