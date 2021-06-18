import Functions.GAME_ORDERS;
import Functions.Input;
import Functions.Main_Manager;
import Functions.Variable_Reading;
import Objects.Logger;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Variable_Reading variable_reading = new Variable_Reading();
        Main_Manager main_manager = new Main_Manager(variable_reading.map_size(),variable_reading);
        Logger logger = new Logger();
        GAME_ORDERS game_orders = new GAME_ORDERS(logger,variable_reading,main_manager);
        Input input = new Input(game_orders,logger,variable_reading,variable_reading.getUsersINFO());
        input.run();
    }
}
