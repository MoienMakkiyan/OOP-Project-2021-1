package Functions;

import Objects.Logger;
import Objects.User;
import com.sun.tools.javac.Main;

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
        String input = "";
        while (!(input = scanner.nextLine()).equalsIgnoreCase("exit")){
            start_menu(scanner);
            second_menu(scanner);
        }
    }

    public void start_menu(Scanner scanner){
        String input = "";
        boolean LOGGING = false;
        while (!LOGGING){
            System.out.println("1- LOG IN");
            System.out.println("2- SIGN UP");
            if ((input = scanner.nextLine()).equalsIgnoreCase("LOG IN")||(input = scanner.nextLine()).equalsIgnoreCase("1")){
                LOGGING = LogIN(scanner);
            }
            if ((input = scanner.nextLine()).equalsIgnoreCase("SIGN UP")||(input = scanner.nextLine()).equalsIgnoreCase("2")){
                LOGGING = SignUP(scanner);
                LOGGING = false;
            }
        }
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
                System.out.println("Wrong PASSWPRD please try again ...");
            }
        }
        else {
            //TODO
            System.out.println("This USERNAME have not found please try again...");
        }
        return pass;
    }

    public boolean SignUP(Scanner scanner){
        boolean pass = false;
        System.out.print("Please Enter Your USERNAME");
        String username = scanner.nextLine();
        if (backUserINDEX(username)==-1){
            System.out.print("Please Enter Your PASSWORD : ");
            String password = scanner.nextLine();
            users.add(new User(username, password));
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

    public void second_menu(Scanner scanner){
        boolean end = false;
        while (!end){
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
                end = true;
            }
            else if (input.equalsIgnoreCase("setting")){
                System.out.println("Setting Method is ran !");
            }
            else {
                System.out.println("Invalid Command, Please try again ...");
            }
        }
    }

    public void Game_Orders (Scanner scanner,int level) {
        game_orders.set_level_tasks(level,CURRENT_USER);
        String input = "";
        while (!(input = scanner.nextLine()).equalsIgnoreCase("LOG OUT")){
            if (input.split("\\s")[0].equalsIgnoreCase("BUY")){
                if (game_orders.Buy(input.split("\\s")[1],CURRENT_USER)){
                    //TODO
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
}
