package Objects.Animal;

import java.util.ArrayList;

public class Wild extends Animal {

    private TypeW typeW;
    protected int lives;


    public static ArrayList<Wild> wilds = new ArrayList<>(0);

    Wild(String type) {
        super(type);
        if (type.equalsIgnoreCase("LION")) {
            this.lives = 3;
            this.typeW = TypeW.tiger;
        } else if (type.equalsIgnoreCase("BEAR")) {
            this.lives = 4;
            this.typeW = TypeW.tiger;
        } else if (type.equalsIgnoreCase("TIGER")) {
            this.lives = 4;
            this.typeW = TypeW.bear;
        }
    }

    public void cage() {
        this.lives--;
    }
}

enum TypeW {
    lion,
    bear,
    tiger
}

