package Functions;

import Objects.Logger;
import Objects.User;
import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Input {

    GAME_ORDERS game_orders;
    User user[];
    User CURRENT_USER;
    Logger logger;
    Variable_Reading variable_reading;

    public Input(GAME_ORDERS game_orders, Logger logger, Variable_Reading variable_reading,User user[]) {
        this.game_orders = game_orders;
        this.logger = logger;
        this.variable_reading = variable_reading;
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!(input = scanner.nextLine()).equalsIgnoreCase("exit")){
            start_menu(scanner);
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
            if (password.equalsIgnoreCase(user[backUserINDEX(username)].getPassword())){
                System.out.print("PASSWORD ACCEPTED ...");
                CURRENT_USER = user[backUserINDEX(username)];
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

    public int backUserINDEX(String name){
        int a=-1;
        for (int i=0;i<user.length;i++){
            if (name.equalsIgnoreCase(user[i].getName())){
                a=i;
                break;
            }
        }
        return a;
    }

    public void Game_Orders (String [] input,Scanner scanner) {
        if (input[0].equalsIgnoreCase("TURN")) {
            game_orders.change_turn(user);
        } else {
            if (input[0].equalsIgnoreCase("BUY")) {
                if (game_orders.Buy(input[1], user)) {
                    //TODO
                } else {
                    //TODO
                }
            } else if (input[0].equalsIgnoreCase("PICKUP")) {

            } else if (input[0].equalsIgnoreCase("WELL")) {

            } else if (input[0].equalsIgnoreCase("PLANT")) {

            } else if (input[0].equalsIgnoreCase("WORK")) {

            } else if (input[0].equalsIgnoreCase("CAGE")) {

            } else if (input[0].equalsIgnoreCase("TRUCK")) {
                if (input[1].equalsIgnoreCase("LOAD")) {

                }

                if (input[1].equalsIgnoreCase("UNLOAD")) {

                }

                if (input[1].equalsIgnoreCase("GO")) {

                }
            }
            input = scanner.nextLine().split(" ");
            Game_Orders(input, scanner);
        }
    }

}
