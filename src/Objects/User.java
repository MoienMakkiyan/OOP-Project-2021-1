package Objects;

import Functions.Variable_Reading;

import java.io.FileNotFoundException;

public class User {
    Variable_Reading variable_reading = new Variable_Reading();

    String Name;
    String Password;
    int level;
    int coin;


    public User(String name, String password, int level, int coin) throws FileNotFoundException {
        Name = name;
        Password = password;
        this.level = level;
        this.coin = coin;
    }

    public User(String name, String password) throws FileNotFoundException {
        Name = name;
        Password = password;
        this.level = 1;
        this.coin = variable_reading.starting_coin();
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public String getName() {
        return Name;
    }

    public String getPassword() {
        return Password;
    }
}
