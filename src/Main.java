import Functions.GAME_ORDERS;
import Functions.Input;
import Functions.Main_Manager;
import Functions.Variable_Reading;
import Objects.Logger;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Variable_Reading.getInstance().initializing();
        Input.getInstance().run();
    }
}
