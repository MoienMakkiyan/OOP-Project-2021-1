package Functions;

import Objects.User;
import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Input {

    GAME_ORDERS game_orders = new GAME_ORDERS();
    User user;

    public void run(){
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!(input = scanner.nextLine()).equalsIgnoreCase("exit")){

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

    public void Game_Ordres (String [] input){
        if (input[0].equalsIgnoreCase("BUY")){
            if (game_orders.Buy(input[1],user)){
                //TODO
            }
            else {
                //TODO
            }
        }

        if (input[0].equalsIgnoreCase("PICKUP")){

        }

        if (input[0].equalsIgnoreCase("WELL")){

        }

        if (input[0].equalsIgnoreCase("PLANT")){

        }

        if (input[0].equalsIgnoreCase("WORK")){

        }

        if (input[0].equalsIgnoreCase("CAGE")){

        }

        if (input[0].equalsIgnoreCase("TURN")){

        }

        if (input[0].equalsIgnoreCase("TRUCK")){
            if (input[1].equalsIgnoreCase("LOAD")){

            }

            if (input[1].equalsIgnoreCase("UNLOAD")){

            }

            if (input[1].equalsIgnoreCase("GO")){

            }
        }
    }

}
