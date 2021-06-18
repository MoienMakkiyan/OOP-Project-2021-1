package Functions;

import Objects.Logger;
import Objects.User;
import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Input {

    GAME_ORDERS game_orders;
    User user;
    Logger logger;

    public Input(GAME_ORDERS game_orders, Logger logger) {
        this.game_orders = game_orders;
        this.logger = logger;
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);
        String allParts = "";
        while (!(allParts = scanner.nextLine()).equalsIgnoreCase("exit")){

            //String input[]=allParts.split(" ");
            //Game_Orders(input,scanner);
        }
    }

    public void start_menu(Scanner scanner){
        String input = "";
        System.out.println("1- LOG IN");
        System.out.println("2- SIGN UP");
        if ((input = scanner.nextLine()).equalsIgnoreCase("LOG IN")){

        }
        if ((input = scanner.nextLine()).equalsIgnoreCase("SIGN UP")){

        }
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
