import Functions.GAME_ORDERS;
import Functions.Input;
import Functions.Main_Manager;
import Functions.Variable_Reading;
import Objects.Logger;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Input.getInstance().run();
    }
}
